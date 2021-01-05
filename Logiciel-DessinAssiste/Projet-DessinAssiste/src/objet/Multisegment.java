import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class Multisegment extends Segment{

	private ArrayList<Segment> multiseg;
	private Segment s0;
	
	public Multisegment() 
    {
		 super();
		 multiseg = new ArrayList<Segment>();
		 
    }
	
	 public Multisegment(Segment s) 
    {
		 multiseg = new ArrayList<Segment>();
		 add(s);
		 s0=s;
    }

	 
	public ArrayList<Segment> getMultiseg()
	{
		return multiseg;
	}

	public void setMultiseg(ArrayList<Segment> ms)
	{
		multiseg = ms;
	}

	public void add(Segment s)
    {
		multiseg.add(s);
    }
	
	public void add2(Point2D p)
    {
		Segment s1 = new Segment(s0.point2,p);
		multiseg.add(s1);
		s0=s1;
    }
	
	public void afficher(Graphics g)
	{
		Iterator<Segment> it=multiseg.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
		
	}
	
	public void deplacer(int abs, int ord)
	{
		Iterator<Segment> it=multiseg.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs,ord);
        }
		
		
	}	
	
	
}
