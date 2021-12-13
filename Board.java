import java.util.*;


class Board {
    private Dice dice;
    private int boardSize;
    private HashMap<Integer, Snakes> snakes;
    private HashMap<Integer, Ladders> ladders;
    private Queue<Player> playerTurns;

    public Board(int boardSize, Dice dice, HashMap<Integer, Snakes> snakes, HashMap<Integer, Ladders> ladders,
            Queue<Player> playerTurns) {
        this.boardSize = boardSize;
        this.playerTurns = playerTurns;
        this.ladders = ladders;
        this.snakes = snakes;
        this.dice = dice;

    }

    public void letsStartGame() {
        while (true) {
            Player play = playerTurns.poll();
            int prevPosition = play.getPlayerLocation();
            int newPosition = prevPosition + dice.rollValue();
            if (newPosition <= boardSize) {
                if (snakes.containsKey(newPosition)) {
                    System.out.println(play.getName() + "was bitten by a Snake and moved backward ");
                    Snakes snakeObj = snakes.get(newPosition);
                    newPosition = snakeObj.getEndPoint();
                } else if (ladders.containsKey(newPosition)) {
                    System.out.println(play.getName() + " climed a ladder and moved forward");
                    Ladders ladderObj = ladders.get(newPosition);
                    newPosition = ladderObj.getEndPoint();

                } else {
                    prevPosition = newPosition;
                    System.out
                            .println(play.getName() + "rolled a dice moved from " + prevPosition + "to " + newPosition);
                }
                if (newPosition == boardSize) {
                    System.out.println(play.getName() + "won the game");
                    break;
                }
                play.setPlayerLocation(newPosition);

            }
            playerTurns.add(play);

        }
    }
}
