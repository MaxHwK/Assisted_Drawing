import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionMultisegment {

	private ArrayList<Multisegment> collection;
	
	
	public CollectionMultisegment()
    {
    	this.collection = new ArrayList<Multisegment>();
    }
    
    
    public void add(Multisegment ms)
    {
    	collection.add(ms);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Multisegment> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Multisegment> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
}
