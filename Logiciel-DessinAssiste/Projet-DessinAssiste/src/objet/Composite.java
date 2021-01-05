import java.awt.Graphics;
//import java.util.ArrayList;

public class Composite extends ObjetBase{

	//protected ArrayList<ObjetBase> compo;
	
	protected CollectionArcDeCercle listeadc;
	protected CollectionCarre listecarr;
	protected CollectionCercle listecer;
	protected CollectionEllipse listeell;
	protected CollectionLosange listelos;
	protected CollectionMultisegment listemultiseg;
	protected CollectionRectangle listerect;
	protected CollectionSegment listeseg;
	protected CollectionTriangle listetri;
	protected CollectionQuadrangle listequa;
	
	 public Composite() 
     {
		//super();
        //compo = new ArrayList<ObjetBase>();
         
        listetri = new CollectionTriangle();
        listeadc = new CollectionArcDeCercle();
        listecarr= new CollectionCarre();
        listecer = new CollectionCercle();
        listeell = new CollectionEllipse();
        listelos = new CollectionLosange();
        listemultiseg = new CollectionMultisegment();
        listerect = new CollectionRectangle();
        listeseg = new CollectionSegment();
        listequa = new CollectionQuadrangle();
         
     }
	
	/* public Composite(ObjetBase o) 
     {
		 compo = new ArrayList<ObjetBase>();
		 add(o);
     }*/

	 
	//public ArrayList<ObjetBase> getCompo() {
	//	return compo;
	//}

	//public void setCompo(ArrayList<ObjetBase> compo) {
	//	this.compo = compo;
	//}
	
	
    public void add(ObjetBase o)
    {
    //Ajoute l'objet de base à la collection correspondant à son type
    	
    	if(o instanceof ArcDeCercle)
    	{
    		ArcDeCercle adc = new ArcDeCercle();
    		adc = (ArcDeCercle) o;
    		listeadc.add(adc);
    	}
    	
    	if(o instanceof Carre)
    	{
    		Carre c = new Carre();
    		c = (Carre) o;
    		listecarr.add(c);
    	}
    	
    	if(o instanceof Cercle)
    	{
    		Cercle c = new Cercle();
    		c = (Cercle) o;
    		listecer.add(c);
    	}
    	
    	if(o instanceof Ellipse)
    	{
    		Ellipse e = new Ellipse();
    		e = (Ellipse) o;
    		listeell.add(e);
    	}
    	
    	if(o instanceof Losange)
    	{
    		Losange l = new Losange();
    		l = (Losange) o;
    		listelos.add(l);
    	}
    	
    	if(o instanceof Multisegment)
    	{
    		Multisegment ms = new Multisegment();
    		ms = (Multisegment) o;
    		listemultiseg.add(ms);
    	}
    	
    	if(o instanceof Rectangle)
    	{
    		Rectangle r = new Rectangle();
    		r = (Rectangle) o;
    		listerect.add(r);
    	}
    	
    	if(o instanceof Segment)
    	{
    		Segment s = new Segment();
    		s = (Segment) o;
    		listeseg.add(s);
    	}
    	
    	if(o instanceof Triangle)
    	{
    		Triangle t = new Triangle();
    		t = (Triangle) o;
    		listetri.add(t);
    	}
    	
    	if(o instanceof Quadrangle)
    	{
    		Quadrangle q = new Quadrangle();
    		q = (Quadrangle) o;
    		listequa.add(q);
    	}
    	
    }
    
   /* public void addTri(Triangle t)
    {
    	listetri.add(t);
    }*/
    
    public void afficher(Graphics g)
	{
		
    	listeadc.afficher(g);
    	listecarr.afficher(g);
    	listecer.afficher(g);
    	listeell.afficher(g);
    	listelos.afficher(g);
    	listemultiseg.afficher(g);
    	listerect.afficher(g);
    	listeseg.afficher(g);
    	listetri.afficher(g);
    	listequa.afficher(g);
	}
    
    public void deplacer(int abs, int ord)
   	{
   		
       	listeadc.deplacer(abs,ord);
       	listecarr.deplacer(abs,ord);
       	listecer.deplacer(abs,ord);
       	listeell.deplacer(abs,ord);
       	listelos.deplacer(abs,ord);
       	listemultiseg.deplacer(abs,ord);
       	listerect.deplacer(abs,ord);
       	listeseg.deplacer(abs,ord);
       	listetri.deplacer(abs,ord);
       	listequa.deplacer(abs,ord);
   	}
	
}
