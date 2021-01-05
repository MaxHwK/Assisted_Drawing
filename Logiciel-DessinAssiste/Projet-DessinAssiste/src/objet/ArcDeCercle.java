import java.awt.Graphics;


public class ArcDeCercle extends Cercle{

	
	private int angleDep;
	private int angleArr;
	
	public ArcDeCercle(Point2D PO, int r, int AD, int AA)
	{
		super(PO,r);
		angleDep = AD;
		angleArr = AA;
	}

	public ArcDeCercle(int r, int AD, int AA)
	{
		super(r);
		angleDep = AD;
		angleArr = AA;
	}

	public ArcDeCercle() {
		// TODO Auto-generated constructor stub
	}

	public int getAngleDep() {
		return angleDep;
	}

	public void setAngleDep(int AD) {
		angleDep = AD;
	}

	public int getAngleArr() {
		return angleArr;
	}

	public void setAngleArr(int AR) {
		angleArr = AR;
	}


	public void afficher(Graphics g)
	{
		g.drawArc(super.x, super.y, rayon, rayon, angleDep, angleArr);
	}

	
	public void deplacer(int abs, int ord)
	{
		int a = super.getX() + abs;
		int b = super.getY() + ord;
		
		
		super.deplOrigine(a,b); 
	}
	
}
