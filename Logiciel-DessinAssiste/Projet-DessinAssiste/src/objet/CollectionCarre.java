import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionCarre {

	private ArrayList<Carre> collection;
	
	
	public CollectionCarre()
    {
    	this.collection = new ArrayList<Carre>();
    }
    
    
    public void add(Carre c)
    {
    	collection.add(c);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Carre> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Carre> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
}
