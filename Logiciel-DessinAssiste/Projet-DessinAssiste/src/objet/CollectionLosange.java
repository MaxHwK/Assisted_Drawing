import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionLosange {

	private ArrayList<Losange> collection;
	
	
	public CollectionLosange()
    {
    	this.collection = new ArrayList<Losange>();
    }
    
    
    public void add(Losange l)
    {
    	collection.add(l);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Losange> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Losange> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
}
