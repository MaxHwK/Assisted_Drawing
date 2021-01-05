import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionEllipse {

	private ArrayList<Ellipse> collection;
	
	
	public CollectionEllipse()
    {
    	this.collection = new ArrayList<Ellipse>();
    }
    
    
    public void add(Ellipse e)
    {
    	collection.add(e);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Ellipse> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Ellipse> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
}
