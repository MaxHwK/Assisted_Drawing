import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSegment{

	private ArrayList<Segment> collection;
	
	
	 public CollectionSegment() 
    {
		 this.collection = new ArrayList<Segment>();
    }


	public void add(Segment s)
    {
    	collection.add(s);
    }
	
	
	public void afficher(Graphics g)
	{
		Iterator<Segment> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
	}
	
	public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Segment> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
	
}
