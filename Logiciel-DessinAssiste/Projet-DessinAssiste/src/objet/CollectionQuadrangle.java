import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionQuadrangle {

	private ArrayList<Quadrangle> collection;
	
	
	public CollectionQuadrangle()
    {
    	this.collection = new ArrayList<Quadrangle>();
    }
    
    
    public void add(Quadrangle q)
    {
    	collection.add(q);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Quadrangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
    
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Quadrangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
	
}
