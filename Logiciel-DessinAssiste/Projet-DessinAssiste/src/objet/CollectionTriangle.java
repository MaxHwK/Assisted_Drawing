import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionTriangle{

	protected ArrayList<Triangle> collection;
	
	
	public CollectionTriangle()
    {
    	this.collection = new ArrayList<Triangle>();
    }
    
    
    public void add(Triangle t)
    {
    	collection.add(t);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Triangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        	
        }
    }

    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Triangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
	//public void remove(Triangle t) {

	//	this.remove(t);
		
	//}
	
}
