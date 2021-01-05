package objet;

import java.awt.Graphics;

public class ObjetBase extends Point2D{
	
	protected Point2D PO;
	
	public ObjetBase(Point2D pO) {
		super(pO.x,pO.y);
	}
	
	public ObjetBase() {
		super();
	}
	
	
	public Point2D getPO() {
		return PO;
	}

	public void setPO(Point2D pO) {
		PO = pO;
	}
	
	
	public void deplOrigine(int a, int b)
	{
		super.setX(a);
		super.setY(b);
	}
	
	
	public void afficher(Graphics g)
	{
		
	}
	
}
