import java.awt.Graphics;

public class Quadrangle extends ObjetBase{

	private Point2D point2;
	private Point2D point3;
	private Point2D point4;
	//private Cercle c1;
	
	/*Quadrangle(Cercle c, Point2D p2, Point2D p3, Point2D p4)
	{
		super();
		//c=c1;
		point2 = p2;
		point3 = p3;
		point4 = p4;
	}*/
	
	/*Quadrangle(Cercle c, Point2D p1,Point2D p2, Point2D p3, Point2D p4)
	{
		super(p1);
		c=c1;
		point2 = p2;
		point3 = p3;
		point4 = p4;
	}*/

	Quadrangle(Point2D p1,Point2D p2, Point2D p3, Point2D p4)
	{
		super(p1);
		point2 = p2;
		point3 = p3;
		point4 = p4;
		
	}
	
	public Quadrangle() {
		// TODO Auto-generated constructor stub
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

	public Point2D getPoint4() {
		return point4;
	}

	public void setPoint4(Point2D point4) {
		this.point4 = point4;
	}

	/*public Cercle getC1() {
		return c1;
	}

	public void setC1(Cercle c1) {
		this.c1 = c1;
	}*/

	
	
	
	public void afficher(Graphics g)
	{
		//super.afficher(g);
		g.drawLine(super.x,super.y,point2.x,point2.y);
		
		g.drawLine(point2.x,point2.y,point3.x,point3.y);
		
		g.drawLine(point3.x,point3.y,point4.x,point4.y);
		
		g.drawLine(point4.x,point4.y,super.x,super.y);

	}
	
	
	
//((A VOIR))
	public void deplacer(int abs, int ord)
	{
		int a = super.getX() + abs;
		int b = super.getY() + ord;
		
		int c = point2.x + abs;
		int d = point2.y + ord;
		
		int e = point3.x + abs;
		int f = point3.y + ord;
		
		int g = point4.x + abs;
		int h = point4.y + ord;
		
		super.deplOrigine(a,b);
		
		
		
		Point2D pdeux = new Point2D(c,d);
		setPoint2(pdeux);
		
		
		Point2D ptrois = new Point2D(e,f);
		setPoint3(ptrois);
		
		Point2D pquatre = new Point2D(g,h);
		setPoint4(pquatre);
		
		
	}
	
	
}
