package objet;

public class Point2D {

	protected int x;
	protected int y;
	
	
	public Point2D(int a, int b)
	{
		x=a;
		y=b;
	}
	
	public Point2D()
	{
		this.setX(0);
		this.setY(0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
		
}
