package objet;

import java.awt.Graphics;


public class Ellipse extends Cercle{

	private int rayon2;
	
	public Ellipse(int r1, int r2)
	{
		super(r1);
		rayon2 = r2;
	}
	
	public Ellipse(Point2D PO, int r1, int r2)
	{
		super(PO,r1);
		rayon2 = r2;
	}
	
	
	public Ellipse() {
		
	}

	public int getRayon2() {
		return rayon2;
	}
	
	public void setRayon2(int r2) {
		rayon2 = r2;
	}
	
		public void afficher(Graphics g)
		{

			g.drawOval(super.x, super.y, rayon, rayon2);
		
		}
	
}