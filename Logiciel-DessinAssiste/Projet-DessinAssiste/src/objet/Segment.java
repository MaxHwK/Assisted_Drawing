package objet;

import java.awt.Graphics;

public class Segment extends ObjetBase{

	protected Point2D point2;
	
	public Segment(Point2D p1, Point2D p2)
	{
		super(p1);
		point2 = p2;
	}
	
	
	public Segment() {
		
	}

	public Point2D getPoint2() {
		return point2;
	}
	
	public void setPoint2(Point2D p) {
		point2 = p;
	}
	
	public void afficher(Graphics g)
	{
		
		g.drawLine(super.x,super.y,point2.x,point2.y);
		
	}	
	
	
	public void deplacer(int abs, int ord)
	{
		int a = super.getX() + abs;
		int b = super.getY() + ord;
		
		int c = point2.x + abs;
		int d = point2.y + ord;
		
		super.deplOrigine(a,b);
		
		Point2D pdeux = new Point2D(c,d);
		setPoint2(pdeux);
	}	
}
