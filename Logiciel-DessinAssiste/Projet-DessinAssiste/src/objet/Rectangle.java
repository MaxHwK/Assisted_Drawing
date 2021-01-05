package objet;

import java.awt.Graphics;

public class Rectangle extends Carre{

	private int largeur;

	public Rectangle(Point2D PO,int lon,int lar){
		super(PO,lon);
		setLargeur(lar);
	}
	
	public Rectangle(int lon, int lar) {
		super(lon);
		setLargeur(lar);
	}

	public Rectangle() {
		
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int l) {
		this.largeur = l;
	}


	public void afficher(Graphics g)
	{
		g.drawRect(x, y, longueur, largeur);
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
