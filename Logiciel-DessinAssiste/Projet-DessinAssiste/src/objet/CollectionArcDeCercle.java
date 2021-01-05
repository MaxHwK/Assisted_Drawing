import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionArcDeCercle {

	private ArrayList<ArcDeCercle> collection;
	
	
	public CollectionArcDeCercle()
    {
    	this.collection = new ArrayList<ArcDeCercle>();
    }
    
    
    public void add(ArcDeCercle adc)
    {
    	collection.add(adc);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<ArcDeCercle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }
	
    public void deplacer(int abs, int ord)
    {
    	
    	Iterator<ArcDeCercle> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().deplacer(abs, ord);
        }
    }
    
}
