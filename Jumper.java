public class Jumper{
	private int startPoint;
	private int endPoint;
	public Jumper(int startPoint,int endPoint){
		this.startPoint=startPoint;
		this.endPoint=endPoint;
	}
	public int getStartPoint(){
		return(startPoint);
	}
	public int getEndPoint(){
		return(endPoint)
	}
}
class Snakes extends Jumper{
	public Snakes(int startPoint,int endPoint){
		super(startPoint,endPoint);
	}
}
class Ladders extends Jumper{
	public Ladders(int startPoint,int endPoint){
		super(startPoint,endPoint);
	}
}
