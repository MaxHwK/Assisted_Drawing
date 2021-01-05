import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionComposite {

	private ArrayList<Composite> collection;
	
	
	public CollectionComposite()
    {
    	this.collection = new ArrayList<Composite>();
    }
    
    
    public void add(Composite c)
    {
    	collection.add(c);
    }
    
    
    public void afficher(Graphics g)
    {
    	Iterator<Composite> it=collection.iterator();
        while(it.hasNext())
        {
        	it.next().afficher(g);
        }
    }


	//public void remove(Composite c) {

	//	this.remove(c);
		
	//}
	
}
