import java.util.Random;
public class Dice{
	public int rollVal(){
		int val=new Random().nextInt(6)+1;
		if(val==6){
			val=6+new Random().nextInt(6)+1;
			if(val==12){
				val=12+new Random().nextInt(6)+1;
				if(val==18){
					System.out.println("Better luck next time");
					val=0;
				}
			}
		}
		return val;
	}
}
