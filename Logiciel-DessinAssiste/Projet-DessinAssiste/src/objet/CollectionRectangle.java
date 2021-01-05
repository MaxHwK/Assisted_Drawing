import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionRectangle {

	private ArrayList<Rectangle> collection;
	
	
	public CollectionRectangle()
    {
    	this.collection = new ArrayList<Rectangle>();
    }
    
    
    public void add(Rectangle r)
    {
    	collection.add(r);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Rectangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
    
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<Rectangle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
	
}
