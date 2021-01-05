package objet;

import java.awt.Graphics;


public class Cercle extends ObjetBase {

	protected int rayon;
	
	public Cercle(int r)
	{
		super();
		rayon = r;
	}
	
	public Cercle(Point2D pO, int r)
	{
		super(pO);
		rayon = r;
	}
	
	
	public Cercle() {
	
	}

	public int getRayon() {
		return rayon;
	}
	
	public void setRayon(int r) {
		rayon = r;
	}

	
	public void afficher(Graphics g)
	{

		g.drawOval(super.x, super.y, rayon, rayon);
	
	}

	public void deplacer(int abs, int ord)
	{
		int a = super.getX() + abs;
		int b = super.getY() + ord;
		
		
		super.deplOrigine(a,b); 
	}	
	
	
}
