import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionCercle {

	private ArrayList<Cercle> collection;
	
	
	public CollectionCercle()
    {
    	this.collection = new ArrayList<Cercle>();
    }
    
    
    public void add(Cercle c)
    {
    	collection.add(c);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Cercle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Cercle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
}
