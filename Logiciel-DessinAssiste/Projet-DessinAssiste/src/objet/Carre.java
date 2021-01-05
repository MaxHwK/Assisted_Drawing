package objet;

import java.awt.Graphics;

public class Carre extends ObjetBase{

	protected int longueur;

	protected Point2D point2 = new Point2D();
	protected Point2D point3 = new Point2D();
	protected Point2D point4 = new Point2D();
	
	
	Carre()
	{}
	
	public Carre(Point2D PO,int l) {
		super(PO);
		longueur = l;
	}
	
	public Carre(int l) {
		super();
		longueur = l;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int l) {
		longueur = l;
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
		
	

	public void afficher(Graphics g)
	{
			//g.drawRect(super.x, super.y, super.x+longueur, super.x+longueur);
		Point2D point2 = new Point2D(super.x+(longueur),super.y);	//point du haut
		Point2D point3 = new Point2D(super.x+(longueur),super.y+(longueur));	//en bas à droite
		Point2D point4 = new Point2D(super.x,super.y+(longueur));	//point en bas
			
			g.drawLine(super.x,super.y,point2.x,point2.y);

			g.drawLine(point2.x,point2.y,point3.x,point3.y);
			
			g.drawLine(point3.x,point3.y,point4.x,point4.y);
			
			g.drawLine(point4.x,point4.y,super.x,super.y);

	}	
	
	
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
		setPoint3(pquatre);
	}	
		
	
	
}