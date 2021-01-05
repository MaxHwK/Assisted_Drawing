//import java.awt.Graphics;
import java.util.ArrayList;
//import java.util.Iterator;
import javax.swing.JComboBox;

	public class CollectionObjets extends ObjetBase{

		protected ArrayList<ObjetBase> collection;
		
		
		 public CollectionObjets() 
	     {
			 	super();
	            setCollection(new ArrayList<ObjetBase>());
	     }
		
		 
		public ArrayList<ObjetBase> getCollection() {
			return collection;
		}
		

		public void setCollection(ArrayList<ObjetBase> coll) {
			this.collection = coll;
		}
		
		
	    public void add(ObjetBase o,JComboBox<ObjetBase> cb)
	    {
	    	collection.add(o);
	    	cb.addItem(o);
	    	
	    }
	    
	   
	    public void deplacer(int abs, int ord,JComboBox<ObjetBase> cb)
		{
			
			Point2D pun = new Point2D(super.x + abs,super.y + ord);
			

			((ObjetBase) cb.getSelectedItem()).setPO(pun);
			
			//Point2D pdeux = new Point2D(point2.x + abs,point2.y + ord);
			//setPoint2(pdeux);
			
			
			//Point2D ptrois = new Point2D(point3.x + abs,point3.y + ord);
			//setPoint3(ptrois);
			
		}    
	    
}
