import java.awt.Graphics;

public class Losange extends Carre{

	private int diagonale;
	//on utilise la longueur du carré comme 1 ere diagonale !

	public Losange(Point2D PO,int lon,int d){
		super(PO,lon);
		setDiagonale(d);
	}
	
	public Losange(int lon, int d) {
		super(lon);
		setDiagonale(d);
	}

	public Losange() {
		// TODO Auto-generated constructor stub
	}

	public int getDiagonale() {
		return diagonale;
	}

	public void setDiagonale(int d) {
		this.diagonale = d;
	}


	public void afficher(Graphics g)
	{
		
		Point2D point2 = new Point2D(super.x+(diagonale/2),super.y+(longueur/2));	//point du haut
		Point2D point3 = new Point2D(super.x+diagonale,super.y);	//point au fond
		Point2D point4 = new Point2D(super.x+(diagonale/2),super.y-(longueur/2));	//point en bas
		
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