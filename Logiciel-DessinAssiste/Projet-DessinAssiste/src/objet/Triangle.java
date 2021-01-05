import java.awt.*;

public class Triangle extends ObjetBase{
	
	protected Point2D point2;
	protected Point2D point3;
	
	Triangle()
	{}
	
	/*Triangle(Point2D p2, Point2D p3)
	{
		super();
		point2 = p2;
		point3 = p3;
	}*/
	
	Triangle(Point2D p1,Point2D p2, Point2D p3)
	{
		super(p1);
		point2 = p2;
		point3 = p3;
	}

	public Point2D getPoint2() {
		return point2;
	}

	public void setPoint2(Point2D point2) {
		this.point2 = point2;
	}

	public Point2D getPoint3() {
		return point3;
	}

	public void setPoint3(Point2D point3) {
		this.point3 = point3;
	}

	public void afficher(Graphics g)
	{
		super.afficher(g);
		g.drawLine(super.x,super.y,point2.x,point2.y);
		
		g.drawLine(point2.x,point2.y,point3.x,point3.y);
		
		g.drawLine(point3.x,point3.y,super.x,super.y);
		
	}
	/*
	public void afficher2(Graphics g,int abs, int ord)
	{
		g.drawLine(super.x+abs,super.y+ord,point2.x+abs,point2.y+ord);
		
		g.drawLine(point2.x+abs,point2.y+ord,point3.x+abs,point3.y+ord);
		
		g.drawLine(point3.x+abs,point3.y+ord,super.x+abs,super.y+ord);
		
	}
*/
	public void deplacer(int abs, int ord)
	{
		int a = super.getX() + abs;
		int b = super.getY() + ord;
		
		int c = point2.x + abs;
		int d = point2.y + ord;
		
		int e = point3.x + abs;
		int f = point3.y + ord;
		
		
		super.deplOrigine(a,b);
		
		
		Point2D pdeux = new Point2D(c,d);
		setPoint2(pdeux);
		
		
		Point2D ptrois = new Point2D(e,f);
		setPoint3(ptrois);
		
		/*
		System.out.println("Nouvelles coordonnées du triangle :");
		System.out.println(a+";"+b);
		System.out.println(c+";"+d);
		System.out.println(e+";"+f);
		*/
	}
}
