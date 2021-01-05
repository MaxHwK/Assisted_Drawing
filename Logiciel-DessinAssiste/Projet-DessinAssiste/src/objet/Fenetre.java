import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;

@SuppressWarnings({ "serial", "unused" })
public class Fenetre extends JFrame {

//Panels	
	private JPanel contentPane;
	//private int xSouris, ySouris;
//////////////////////////////////
//VARIABLES		
//////////////////////////////////	

//Edits	
	private JTextField edt_p1_x;
	private JTextField edt_p1_y;
	private JTextField edt_p2_x;
	private JTextField edt_p2_y;
	private JTextField edt_p3_x;
	private JTextField edt_p3_y;
	private JTextField edt_p4_x;
	private JTextField edt_p4_y;
	private JTextField edt_lon;
	private JTextField edt_lar;
	private JTextField edt_dia;
	private JTextField edt_ray1;
	private JTextField edt_ray2;
	private JTextField edt_ang1;
	private JTextField edt_ang2;
	private JTextField edt_ang3;
	private JTextField edt_ang4;
	private JTextField edt_vect_x;
	private JTextField edt_vect_y;
	
	private JTextField edt_vectcompo_x;
	private JTextField edt_vectcompo_y;
//Valeurs des edits
	private int val_p1_x;
	private int val_p1_y;
	private int val_p2_x;
	private int val_p2_y;
	private int val_p3_x;
	private int val_p3_y;
	private int val_p4_x;
	private int val_p4_y;
	private int val_lon;
	private int val_lar;
	private int val_dia;
	private int val_ray1;
	private int val_ray2;
	private int val_ang1;
	private int val_ang2;
	private int val_ang3;
	private int val_ang4;
	private int val_vect_x;
	private int val_vect_y;

	private int val_vectcompo_x;
	private int val_vectcompo_y;
	
//Variables du triangle	
	boolean Btriangle = false;
	boolean Btriangle2 = false;
	CollectionTriangle colltri = new CollectionTriangle();
	
//Variables du carré
	boolean Bcarre = false;
	boolean Bcarre2 = false;
	CollectionCarre collcarr = new CollectionCarre();
	
//Variables du cercle
	boolean Bcercle = false;
	boolean Bcercle2 = false;
	CollectionCercle collcer = new CollectionCercle();
		
//Variables du rectangle
	boolean Brectangle = false;
	boolean Brectangle2 = false;
	CollectionRectangle collrect = new CollectionRectangle();
	
//Variables du losange	
	boolean Blosange = false;
	boolean Blosange2 = false;
	CollectionLosange colllos = new CollectionLosange();
	
//Variables de l'arc de cercle
	boolean Badc = false;
	boolean Badc2 = false;
	CollectionArcDeCercle colladc = new CollectionArcDeCercle();
	
//Variables de l'ellipse
	boolean Bellipse = false;
	boolean Bellipse2 = false;
	CollectionEllipse collell = new CollectionEllipse();
	
	
//Variables du quadrangle
	boolean Bquadrangle = false;
	boolean Bquadrangle2 = false;
	CollectionQuadrangle collqua = new CollectionQuadrangle();
	double val_ang1_rad;
	double val_ang2_rad;
	double val_ang3_rad;
	double val_ang4_rad;
	
//Variables du segment
	boolean Bsegment = false;
	boolean Bsegment2 = false;
	CollectionSegment collseg = new CollectionSegment();
	
//Variables du multisegment
	boolean Bmultisegment = false;
	boolean Bmultisegment2 = false;	
	boolean BmultisegmentA = false;
	boolean BmultisegmentB = false;	
	
	Multisegment collmultiseg = new Multisegment();

//Variables du composite
	//boolean Bcomposite = false;
	//boolean Bcomposite2 = false;
		
	CollectionComposite collcomposite = new CollectionComposite();	
	
	
//Liste des éléments crées et Jcombobox	
	private JComboBox<ObjetBase> cbo_listeobj = new JComboBox<ObjetBase>();
	private CollectionObjets listeobj = new CollectionObjets();
	
	private JComboBox<ObjetBase> cbo_listecompo = new JComboBox<ObjetBase>();
	private CollectionObjets listecompo = new CollectionObjets();
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////	

///////////////////
//CLASSE FENETRE	
///////////////////	
public Fenetre()
{
		//Actions a = new Actions(this);
		
		setTitle("Dessin Assisté");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1518, 1006);
		this.setLocation(250,10);//Pour faire apparaitre la fenetre au bon endroit par rapport à l'écran
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_dessin = new JPanel();
		panel_dessin.setBounds(0, 139, 1257, 831);
		contentPane.add(panel_dessin);	
		
		
//////////////////////////////////
//PANEL D'ENTREE DES PARAMETRES		
//////////////////////////////////

	JPanel panel_param = new JPanel();
	panel_param.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
	panel_param.setBounds(1264, 0, 245, 970);
	contentPane.add(panel_param);
	panel_param.setLayout(null);		

	
	
	/*panel_dessin.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e)
		{
				
				xSouris = e.getX(); 
				ySouris = e.getY();
				
				System.out.println(xSouris + ";" + ySouris);
				
		}});*/
	
	JLabel lbl_x = new JLabel("x");
	lbl_x.setBounds(107, 13, 25, 16);
	panel_param.add(lbl_x);
	
	JLabel lbl_y = new JLabel("y");
	lbl_y.setBounds(170, 13, 25, 16);
	panel_param.add(lbl_y);
	

///////LABELS
	JLabel lbl_p1 = new JLabel("Point 1");
	lbl_p1.setBounds(12, 45, 39, 16);
	panel_param.add(lbl_p1);
	
	JLabel lbl_p2 = new JLabel("Point 2");
	lbl_p2.setBounds(12, 91, 39, 16);
	panel_param.add(lbl_p2);
	
	JLabel lbl_p3 = new JLabel("Point 3");
	lbl_p3.setBounds(12, 140, 39, 16);
	panel_param.add(lbl_p3);
	
	JLabel lbl_p4 = new JLabel("Point 4");
	lbl_p4.setBounds(12, 192, 39, 16);
	panel_param.add(lbl_p4);
	
	JLabel lbl_lon = new JLabel("Longueur");
	lbl_lon.setBounds(12, 237, 64, 16);
	panel_param.add(lbl_lon);
	
	JLabel lbl_lar = new JLabel("Largeur");
	lbl_lar.setBounds(12, 283, 53, 16);
	panel_param.add(lbl_lar);
	
	JLabel lbl_dia = new JLabel("Diagonale");
	lbl_dia.setBounds(12, 328, 64, 16);
	panel_param.add(lbl_dia);
	
	JLabel lbl_ray1 = new JLabel("Rayon 1");
	lbl_ray1.setBounds(12, 372, 64, 16);
	panel_param.add(lbl_ray1);
	
	JLabel lbl_ray2 = new JLabel("Rayon 2");
	lbl_ray2.setBounds(12, 421, 64, 16);
	panel_param.add(lbl_ray2);
	
	JLabel lbl_ang1 = new JLabel("Angle 1");
	lbl_ang1.setBounds(12, 467, 64, 16);
	panel_param.add(lbl_ang1);
	
	JLabel lbl_ang2 = new JLabel("Angle 2");
	lbl_ang2.setBounds(12, 516, 64, 16);
	panel_param.add(lbl_ang2);
	
	JLabel lbl_ang3 = new JLabel("Angle 3");
	lbl_ang3.setBounds(12, 565, 64, 16);
	panel_param.add(lbl_ang3);
	
	JLabel lbl_ang4 = new JLabel("Angle 4");
	lbl_ang4.setBounds(12, 614, 64, 16);
	panel_param.add(lbl_ang4);
	
	JLabel lbl_vect = new JLabel("Vecteur");
	lbl_vect.setBounds(12, 747, 53, 16);
	panel_param.add(lbl_vect);

///////EDITS	

	edt_p1_x = new JTextField();
	edt_p1_x.setEditable(false);	//On initialise le champ pour qu'il ne soit pas éditable
	edt_p1_x.setColumns(10);
	edt_p1_x.setBounds(85, 42, 47, 22);
	panel_param.add(edt_p1_x);
	
	edt_p1_y = new JTextField();
	edt_p1_y.setEditable(false);
	edt_p1_y.setColumns(10);
	edt_p1_y.setBounds(154, 42, 47, 22);
	panel_param.add(edt_p1_y);
	
	edt_p2_x = new JTextField();
	edt_p2_x.setEditable(false);
	edt_p2_x.setColumns(10);
	edt_p2_x.setBounds(85, 91, 47, 22);
	panel_param.add(edt_p2_x);
	
	edt_p2_y = new JTextField();
	edt_p2_y.setEditable(false);
	edt_p2_y.setColumns(10);
	edt_p2_y.setBounds(154, 91, 47, 22);
	panel_param.add(edt_p2_y);
	
	edt_p3_x = new JTextField();
	edt_p3_x.setEditable(false);
	edt_p3_x.setColumns(10);
	edt_p3_x.setBounds(85, 140, 47, 22);
	panel_param.add(edt_p3_x);
	
	edt_p3_y = new JTextField();
	edt_p3_y.setEditable(false);
	edt_p3_y.setColumns(10);
	edt_p3_y.setBounds(154, 140, 47, 22);
	panel_param.add(edt_p3_y);
	
	edt_p4_x = new JTextField();
	edt_p4_x.setEditable(false);
	edt_p4_x.setColumns(10);
	edt_p4_x.setBounds(85, 186, 47, 22);
	panel_param.add(edt_p4_x);
	
	edt_p4_y = new JTextField();
	edt_p4_y.setEditable(false);
	edt_p4_y.setColumns(10);
	edt_p4_y.setBounds(154, 186, 47, 22);
	panel_param.add(edt_p4_y);
	
	edt_lon = new JTextField();
	edt_lon.setEditable(false);
	edt_lon.setColumns(10);
	edt_lon.setBounds(118, 234, 47, 22);
	panel_param.add(edt_lon);
	
	edt_lar = new JTextField();
	edt_lar.setEditable(false);
	edt_lar.setColumns(10);
	edt_lar.setBounds(118, 280, 47, 22);
	panel_param.add(edt_lar);
	
	edt_dia = new JTextField();
	edt_dia.setEditable(false);
	edt_dia.setColumns(10);
	edt_dia.setBounds(118, 325, 47, 22);
	panel_param.add(edt_dia);
	
	edt_ray1 = new JTextField();
	edt_ray1.setEditable(false);
	edt_ray1.setColumns(10);
	edt_ray1.setBounds(118, 369, 47, 22);
	panel_param.add(edt_ray1);
	
	edt_ray2 = new JTextField();
	edt_ray2.setEditable(false);
	edt_ray2.setColumns(10);
	edt_ray2.setBounds(118, 418, 47, 22);
	panel_param.add(edt_ray2);
	
	edt_ang1 = new JTextField();
	edt_ang1.setEditable(false);
	edt_ang1.setColumns(10);
	edt_ang1.setBounds(118, 464, 47, 22);
	panel_param.add(edt_ang1);
	
	edt_ang2 = new JTextField();
	edt_ang2.setEditable(false);
	edt_ang2.setColumns(10);
	edt_ang2.setBounds(118, 513, 47, 22);
	panel_param.add(edt_ang2);
	
	edt_ang3 = new JTextField();
	edt_ang3.setEditable(false);
	edt_ang3.setColumns(10);
	edt_ang3.setBounds(118, 562, 47, 22);
	panel_param.add(edt_ang3);
	
	edt_ang4 = new JTextField();
	edt_ang4.setEditable(false);
	edt_ang4.setColumns(10);
	edt_ang4.setBounds(118, 611, 47, 22);
	panel_param.add(edt_ang4);
	
	edt_vect_x = new JTextField();
	edt_vect_x.setEditable(false);
	edt_vect_x.setText("0");//On initialise à 0 le déplacement
	edt_vect_x.setColumns(10);
	edt_vect_x.setBounds(85, 744, 47, 22);
	panel_param.add(edt_vect_x);
	
	edt_vect_y = new JTextField();
	edt_vect_y.setEditable(false);
	edt_vect_y.setText("0");//On initialise à 0 le déplacement
	edt_vect_y.setColumns(10);
	edt_vect_y.setBounds(154, 744, 47, 22);
	panel_param.add(edt_vect_y);		

///////COMBOBOX

	cbo_listeobj.setBounds(12, 695, 212, 25);
	panel_param.add(cbo_listeobj);
	
	
	cbo_listecompo.setBounds(12, 843, 212, 25);
	panel_param.add(cbo_listecompo);



//////////////////////////////////
//BOUTONS DE FORME		
//////////////////////////////////		
	JPanel panel_boutons = new JPanel();
	panel_boutons.setBounds(0, 0, 1257, 61);
	contentPane.add(panel_boutons);
	panel_boutons.setLayout(null);

			
		//TRIANGLE		
			JButton btn_tri = new JButton("Triangle");
			btn_tri.setBounds(0, 0, 103, 61);
			panel_boutons.add(btn_tri);
			btn_tri.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					//Initialisation de tous les champs à non éditables à chaque fois qu'on clique sur un bouton de forme
					BoolInit();
					
					//Puis activation des champs nécessaires uniquement
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_p2_x.setEditable(true);
					edt_p2_y.setEditable(true);
					edt_p3_x.setEditable(true);
					edt_p3_y.setEditable(true);
					
					Btriangle=true;		//Pour la conditionnelle d'attribution des variables de champs du bouton OK
				}
			});		
				
			btn_tri.setIcon(null);
			
				
		//CARRE		
			JButton btnCarre = new JButton("Carr\u00E9");
			btnCarre.setBounds(115, 0, 103, 61);
			panel_boutons.add(btnCarre);
			btnCarre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					BoolInit();
										
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_lon.setEditable(true);
									
					Bcarre=true;
				}
				
			});
				
			btnCarre.setIcon(null);
		
				
		//RECTANGLE
			JButton btnRectangle = new JButton("Rectangle");
			btnRectangle.setBounds(230, 0, 103, 61);
			panel_boutons.add(btnRectangle);
				
			btnRectangle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)												
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_lon.setEditable(true);
					edt_lar.setEditable(true);
																			
					Brectangle = true;
				}
			});
						
		//LOSANGE
			JButton btnLosange = new JButton("Losange");
			btnLosange.setBounds(345, 0, 103, 61);
			panel_boutons.add(btnLosange);
			
			btnLosange.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0)
				{
					BoolInit();
					
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_lon.setEditable(true);
					edt_dia.setEditable(true);
																			
					Blosange = true;
																			
				}
			});
								
		//CERCLE
			JButton btnCercle = new JButton("Cercle");
			btnCercle.setBounds(460, 0, 103, 61);
			panel_boutons.add(btnCercle);
								
			btnCercle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_ray1.setEditable(true);
																			
					Bcercle=true;
																			
				}
			});
			
		//ARC DE CERCLE	
			JButton btnArcdecercle = new JButton("Arc");
			btnArcdecercle.setBounds(575, 0, 103, 61);
			panel_boutons.add(btnArcdecercle);
			
			btnArcdecercle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_ray1.setEditable(true);
					edt_ang1.setEditable(true);
					edt_ang2.setEditable(true);
																			
					Badc=true;
																			
				}
			});
												
		//ELLIPSE		
			JButton btnEllipse = new JButton("Ellipse");
			btnEllipse.setBounds(690, 0, 103, 61);
			panel_boutons.add(btnEllipse);
			
			btnEllipse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
					
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_ray1.setEditable(true);
					edt_ray2.setEditable(true);

					Bellipse=true;
				}
			});
			
			btnEllipse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
					
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_ray1.setEditable(true);
					edt_ray2.setEditable(true);

					Bellipse=true;
				}
			});
			
			
		//QUADRANGLE	
			JButton btnQuadrangle = new JButton("Quadrangle");
			btnQuadrangle.setBounds(1039, 0, 103, 61);
			panel_boutons.add(btnQuadrangle);
			
			
			btnQuadrangle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_ray1.setEditable(true);
					
					edt_ang1.setEditable(true);
					edt_ang2.setEditable(true);
					edt_ang3.setEditable(true);
					edt_ang4.setEditable(true);
																		
					//Bcercle = true;
					Bquadrangle = true;
				}
			});	
			
			
			/*
			panel_dessin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
						int xSouris, ySouris;
						xSouris = e.getX(); 
						ySouris = e.getY();
						
						System.out.println("("+xSouris +";"+ ySouris+")");
				}
			});	
			*/
			
			
		//SEGMENT		
			JButton btnSegment = new JButton("Segment");
			btnSegment.setBounds(805, 0, 103, 61);
			panel_boutons.add(btnSegment);
			
			btnSegment.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);
					edt_p1_y.setEditable(true);
					edt_p2_x.setEditable(true);
					edt_p2_y.setEditable(true);
																			
					Bsegment = true;
				}
			});											
		
		////BOUTON MULTISEGMENT
			JButton btnMultiseg = new JButton("MultiSeg");
			btnMultiseg.setBounds(920, 0, 103, 61);
			panel_boutons.add(btnMultiseg);
			
			btnMultiseg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0)
			{
																		
				if(cbo_listeobj.getSelectedItem() instanceof Segment)
				{
					BoolInit();
																			
					edt_p1_x.setEditable(true);//On ne demande qu'un seul nouveau point
					edt_p1_y.setEditable(true);
																			
					Bmultisegment=true;
				}
																		
				
				if(cbo_listeobj.getSelectedItem() instanceof Multisegment)
				{
					BoolInit();
				
					edt_p1_x.setEditable(true);//On ne demande qu'un seul nouveau point
					edt_p1_y.setEditable(true);
																			
					BmultisegmentA=true;
				}
																		
			}});
		////BOUTON AJOUT
			
			JButton btnAjout = new JButton("Ajout");
			btnAjout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				
			//Sert à ajouter l'élément de la liste des objets...
				
				Composite c = new Composite();
				c = (Composite) cbo_listecompo.getSelectedItem();//...à un composite existant
				
			//TRIANGLE
				if(cbo_listeobj.getSelectedItem() instanceof Triangle)
				{
					Triangle t = new Triangle();
	                
	               	t = (Triangle) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(t);//ajout de l'objet au composite
	   		        
	   		    	cbo_listeobj.removeItem(t);
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
				
			//CARRE
				else if(cbo_listeobj.getSelectedItem() instanceof Carre)
				{
					Carre carr = new Carre();
	                
	               	carr = (Carre) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(carr);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(carr); 
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
						
						
			//RECTANGLE
				else if(cbo_listeobj.getSelectedItem() instanceof Rectangle)
				{
					Rectangle r = new Rectangle();
	                
	               	r = (Rectangle) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(r);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(r); 
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
						
			//LOSANGE
				else if(cbo_listeobj.getSelectedItem() instanceof Losange)
				{
	                Losange l = new Losange();
	                
	               	l = (Losange) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(l);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(l); 
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
						
			//CERCLE
				else if(cbo_listeobj.getSelectedItem() instanceof Cercle)
				{
					Cercle cer = new Cercle();
	                
	               	cer = (Cercle) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(cer);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(cer);
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
	
				
			//ARC DE CERCLE		
				else if(cbo_listeobj.getSelectedItem() instanceof ArcDeCercle)
				{
					ArcDeCercle adc = new ArcDeCercle();
	                
					adc = (ArcDeCercle) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(adc);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(adc);
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
	
				
			//ELLIPSE
				else if(cbo_listeobj.getSelectedItem() instanceof Ellipse)
				{
					Ellipse e = new Ellipse();
	                
					e = (Ellipse) cbo_listeobj.getSelectedItem();
	                
					c.add(e);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(e);
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
				
				
			//QUADRANGLE
				else if(cbo_listeobj.getSelectedItem() instanceof Quadrangle)
				{
					Quadrangle q = new Quadrangle();
	                
					q = (Quadrangle) cbo_listeobj.getSelectedItem();
	                
					c.add(q);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(q);
	   		    	
	   		    	//collcomposite.add(c);
		   		    //listecompo.add(c,cbo_listecompo);
				}
				
				
			//SEGMENT
				else if(cbo_listeobj.getSelectedItem() instanceof Segment)
				{
					Segment s = new Segment();
	                
					s = (Segment) cbo_listeobj.getSelectedItem();
	                
	   		    	c.add(s);//ajout de l'objet à l'arraylist composite
	   		        
	   		    	cbo_listeobj.removeItem(s);
	   		    	
	   		    	//collcomposite.add(c);
	   		    	//listecompo.add(c,cbo_listecompo);
				}
				
				
			//MULTISEGMENT
				else if(cbo_listeobj.getSelectedItem() instanceof Multisegment)
				{
					Multisegment ms = new Multisegment();
	                    
	                ms = (Multisegment) cbo_listeobj.getSelectedItem();
	                 
	       		    c.add(ms);//ajout de l'objet à l'arraylist composite
	       		      
	       		    cbo_listeobj.removeItem(ms);
	       		    
	       		    //collcomposite.add(c);
	       		    //listecompo.add(c,cbo_listecompo);
				}
				
				
				repaint();//utile ?
				
			}});	
			
			btnAjout.setEnabled(false);
			btnAjout.setBounds(64, 789, 74, 25);
			panel_param.add(btnAjout);	

		////BOUTON COMPOSITE
			JButton btnComposite = new JButton("Composite");
			btnComposite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{		
				//Bcomposite = true;
				
				//On donne le droit de bouger le composite si un premier est fait
				edt_vectcompo_x.setEditable(true);
				edt_vectcompo_y.setEditable(true);
				//Et aussi d'y ajouter un objet de la liste des objets
				btnAjout.setEnabled(true);
				
				
				Composite c = new Composite();//création de l'objet composite
				
				//TRIANGLE
					if(cbo_listeobj.getSelectedItem() instanceof Triangle)
					{
						Triangle t = new Triangle();
		                
		               	t = (Triangle) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(t);//ajout de l'objet au composite, s'adaptera au triangle
		   		        
		   		    	cbo_listeobj.removeItem(t);
		   		    	
		   		    	collcomposite.add(c);//On ajoute le nouveau composite à la collection des composites à afficher
			   		    listecompo.add(c,cbo_listecompo);//et aussi à la combobox qui les liste
					}
					
				//CARRE
					else if(cbo_listeobj.getSelectedItem() instanceof Carre)
					{
						Carre carr = new Carre();
		                
		               	carr = (Carre) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(carr);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(carr); 
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
							
							
				//RECTANGLE
					else if(cbo_listeobj.getSelectedItem() instanceof Rectangle)
					{
						Rectangle r = new Rectangle();
		                
		               	r = (Rectangle) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(r);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(r); 
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
							
				//LOSANGE
					else if(cbo_listeobj.getSelectedItem() instanceof Losange)
					{
		                Losange l = new Losange();
		                
		               	l = (Losange) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(l);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(l); 
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
							
				//CERCLE
					else if(cbo_listeobj.getSelectedItem() instanceof Cercle)
					{
						Cercle cer = new Cercle();
		                
		               	cer = (Cercle) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(cer);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(cer);
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
		
					
				//ARC DE CERCLE		
					else if(cbo_listeobj.getSelectedItem() instanceof ArcDeCercle)
					{
						ArcDeCercle adc = new ArcDeCercle();
		                
						adc = (ArcDeCercle) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(adc);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(adc);
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
		
					
				//ELLIPSE
					else if(cbo_listeobj.getSelectedItem() instanceof Ellipse)
					{
						Ellipse e = new Ellipse();
		                
						e = (Ellipse) cbo_listeobj.getSelectedItem();
		                
						c.add(e);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(e);
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
				
					
				//QUADRANGLE
					else if(cbo_listeobj.getSelectedItem() instanceof Quadrangle)
					{
						Quadrangle q = new Quadrangle();
		                
						q = (Quadrangle) cbo_listeobj.getSelectedItem();
		                
						c.add(q);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(q);
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
					
				//SEGMENT
					else if(cbo_listeobj.getSelectedItem() instanceof Segment)
					{
						Segment s = new Segment();
		                
						s = (Segment) cbo_listeobj.getSelectedItem();
		                
		   		    	c.add(s);//ajout de l'objet à l'arraylist composite
		   		        
		   		    	cbo_listeobj.removeItem(s);
		   		    	
		   		    	collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
					
					
				//MULTISEGMENT
					else if(cbo_listeobj.getSelectedItem() instanceof Multisegment)
					{
						Multisegment ms = new Multisegment();
		                    
		                ms = (Multisegment) cbo_listeobj.getSelectedItem();
		                 
		       		    c.add(ms);//ajout de l'objet à l'arraylist composite
		       		      
		       		    cbo_listeobj.removeItem(ms);
		       		    
		       		    collcomposite.add(c);
			   		    listecompo.add(c,cbo_listecompo);
					}
					
				
	   		    
			    //Bcomposite2=false;
			/////
				repaint();
			/////
			}
		});
			
		btnComposite.setBounds(1154, 0, 103, 61);
		panel_boutons.add(btnComposite);
		
		
			
		

		
		
		
///////BOUTONS
		
//OK
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	//Ici il va falloir faire un if pour savoir quel bouton on a activé avant,
	//et récupérer la valeur des champs nécessaires UNIQUEMENT !
				
			//On active les champs de déplacement si un 1er objet est fait
				edt_vect_x.setEditable(true);
				edt_vect_y.setEditable(true);
				//btn_Depl.setEnabled(true);
				
				if(Btriangle)
				{
					Btriangle2 = true;
					Btriangle = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p2_y.getText());
					
					val_p2_x=Integer.parseInt(edt_p1_y.getText());
					val_p2_y=Integer.parseInt(edt_p3_x.getText());
					
					val_p3_x=Integer.parseInt(edt_p2_x.getText());
					val_p3_y=Integer.parseInt(edt_p3_y.getText());
					
					repaint();
				}
				
				if(Bcarre)
				{
					Bcarre2 = true;
					Bcarre = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_lon=Integer.parseInt(edt_lon.getText());
					val_lon=Integer.parseInt(edt_lon.getText());
					
					repaint();
				}

				if(Brectangle)
				{
					Brectangle2 = true;
					Brectangle = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_lon=Integer.parseInt(edt_lon.getText());
					val_lar=Integer.parseInt(edt_lar.getText());
					
					repaint();
				}
				
				if(Blosange)
				{
					Blosange2 = true;
					Blosange = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_lon=Integer.parseInt(edt_lon.getText());
					val_dia=Integer.parseInt(edt_dia.getText());
					
					repaint();
				}
				
				if(Bcercle)
				{
					Bcercle2 = true;
					Bcercle = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_ray1=Integer.parseInt(edt_ray1.getText());
					
					repaint();
				}
				
				if(Badc)
				{
					Badc2 = true;
					Badc = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_ray1=Integer.parseInt(edt_ray1.getText());
					val_ang1=Integer.parseInt(edt_ang1.getText());
					val_ang2=Integer.parseInt(edt_ang2.getText());
					
					repaint();
				}
				
				if(Bellipse)
				{
					Bellipse2 = true;
					Bellipse = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_ray1=Integer.parseInt(edt_ray1.getText());
					val_ray2=Integer.parseInt(edt_ray2.getText());
					
					repaint();
				}
				
				
				if(Bquadrangle)
				{
					Bquadrangle2 = true;
					Bquadrangle = false;
					
				//Données récupérées pour le cercle
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					val_ray1=Integer.parseInt(edt_ray1.getText());
					
				//Données récupérées pour le quadrangle
					val_ang1=Integer.parseInt(edt_ang1.getText());
					val_ang2=Integer.parseInt(edt_ang2.getText());
					val_ang3=Integer.parseInt(edt_ang3.getText());
					val_ang4=Integer.parseInt(edt_ang4.getText());
					
					repaint();
				}
				
				
				if(Bsegment)
				{
					Bsegment2 = true;
					Bsegment = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					val_p2_x=Integer.parseInt(edt_p2_x.getText());
					val_p2_y=Integer.parseInt(edt_p2_y.getText());
					
					repaint();
				}

				
				if(Bmultisegment)//Si on part d'un segment
				{	
					Bmultisegment2 = true;
					Bmultisegment = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					
	                repaint();
				}
				
				if(BmultisegmentA)//Si on part d'un multisegment
				{	
					BmultisegmentB = true;
					BmultisegmentA = false;
					
					val_p1_x=Integer.parseInt(edt_p1_x.getText());
					val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					
	                repaint();
				}
				
				
				/*if(Bcomposite)//Si on part d'un segment
				{	
					Bcomposite2 = true;
					Bcomposite = false;
					
					//val_p1_x=Integer.parseInt(edt_p1_x.getText());
					//val_p1_y=Integer.parseInt(edt_p1_y.getText());
					
					
	                repaint();
				}*/
				
				
				
				BoolInit();//appuyer sur OK réinitialise aussi les zones de saisie
				
			}
		});
		btnOk.setBounds(160, 657, 64, 25);
		panel_param.add(btnOk);
		
				
//DEPLACEMENT
		JButton btnDepl = new JButton("Move !!");
		btnDepl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent action)
			{
						
				// Faire une fct annexe
				// DeplFigure(cbo_listeobj,x,y);
						
						
			//On récupère la valeur du vecteur
				val_vect_x=Integer.parseInt(edt_vect_x.getText());
            	val_vect_y= - Integer.parseInt(edt_vect_y.getText());  //inverse car l'ordonnée va de haut en bas en java
            	
            	
            //TRIANGLE
				if(cbo_listeobj.getSelectedItem() instanceof Triangle)
				{
					Triangle t = new Triangle();
		                    
		        	t = (Triangle) cbo_listeobj.getSelectedItem();
		                    
		         	t.deplacer(val_vect_x,val_vect_y);
		                    
		        	repaint(); 
				}
				
				
			//CARRE
				if(cbo_listeobj.getSelectedItem() instanceof Carre)
				{
		        	Carre c = new Carre();
		                    
		         	c = (Carre) cbo_listeobj.getSelectedItem();
		                    
		        	c.deplacer(val_vect_x,val_vect_y);
		                    
		         	repaint(); 
				}
						
						
			//RECTANGLE
				if(cbo_listeobj.getSelectedItem() instanceof Rectangle)
				{
                    Rectangle r = new Rectangle();
                    
                    r = (Rectangle) cbo_listeobj.getSelectedItem();
                    
                    r.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}
						
			//LOSANGE
				if(cbo_listeobj.getSelectedItem() instanceof Losange)
				{
                    Losange l = new Losange();
                    
                    l = (Losange) cbo_listeobj.getSelectedItem();
                    
                    l.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}
						
			//CERCLE
				if(cbo_listeobj.getSelectedItem() instanceof Cercle)
				{
                    Cercle c = new Cercle();
                    
                    c = (Cercle) cbo_listeobj.getSelectedItem();
                    
                    c.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}

				
			//ARC DE CERCLE		
				if(cbo_listeobj.getSelectedItem() instanceof ArcDeCercle)
				{
                    ArcDeCercle adc = new ArcDeCercle();
                    
                    adc = (ArcDeCercle) cbo_listeobj.getSelectedItem();
                    
                    adc.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}

				
			//ELLIPSE
				if(cbo_listeobj.getSelectedItem() instanceof Ellipse)
				{
                	Ellipse e = new Ellipse();
                    
                    e = (Ellipse) cbo_listeobj.getSelectedItem();
                    
                    e.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}
			
				
			//QUADRANGLE
				if(cbo_listeobj.getSelectedItem() instanceof Quadrangle)
				{
					Quadrangle q = new Quadrangle();
                    
                    q = (Quadrangle) cbo_listeobj.getSelectedItem();
                    
                    q.deplacer(val_vect_x,val_vect_y);
                    
                    repaint(); 
				}	
				
				
			//SEGMENT
				if(cbo_listeobj.getSelectedItem() instanceof Segment)
				{
                    Segment s = new Segment();
                    
                    s = (Segment) cbo_listeobj.getSelectedItem();
                    
                   	s.deplacer(val_vect_x,val_vect_y);
                    
                    repaint();
				}
				
			//MULTISEGMENT
				if(cbo_listeobj.getSelectedItem() instanceof Multisegment)
				{
	                   Multisegment ms = new Multisegment();
	                    
	                   ms = (Multisegment) cbo_listeobj.getSelectedItem();
	                    
	                   ms.deplacer(val_vect_x,val_vect_y);
	                   
	                   repaint();
				}
						
			}
		});
			
		btnDepl.setBounds(150, 789, 74, 25);
		panel_param.add(btnDepl);
		
		
		
		
		
		JLabel lbl_vectcompo = new JLabel("Vecteur");
		lbl_vectcompo.setBounds(12, 892, 53, 16);
		panel_param.add(lbl_vectcompo);
		
		edt_vectcompo_x = new JTextField();
		edt_vectcompo_x.setText("0");
		edt_vectcompo_x.setEditable(false);
		edt_vectcompo_x.setColumns(10);
		edt_vectcompo_x.setBounds(85, 889, 47, 22);
		panel_param.add(edt_vectcompo_x);
		
		edt_vectcompo_y = new JTextField();
		edt_vectcompo_y.setText("0");
		edt_vectcompo_y.setEditable(false);
		edt_vectcompo_y.setColumns(10);
		edt_vectcompo_y.setBounds(154, 889, 47, 22);
		panel_param.add(edt_vectcompo_y);
		
		JButton btnDeplcompo = new JButton("Move !!");
		btnDeplcompo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{

				//On récupère la valeur du vecteur
					val_vectcompo_x=Integer.parseInt(edt_vectcompo_x.getText());
	            	val_vectcompo_y=Integer.parseInt(edt_vectcompo_y.getText());
				
                    Composite c = new Composite();
                    
                    c = (Composite) cbo_listecompo.getSelectedItem();
                    
                    c.deplacer(val_vectcompo_x,val_vectcompo_y);
                    
                    repaint();
				
			}
		});
		btnDeplcompo.setBounds(150, 935, 74, 25);
		panel_param.add(btnDeplcompo);
		
		
		
		
		
		
		
		
}//FIN DE LA CLASSE FENETRE

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////
//CLASSE PAINT
///////////////////
public void paint(Graphics g)
{
	super.paintComponents(g);

	Point2D p1 = new Point2D(val_p1_x,val_p1_y);//Commun à toutes les figures
	
//TRIANGLE
		if(Btriangle2)//If seulement pour la création de la bonne forme
		{
			
			Point2D p2 = new Point2D(val_p2_x,val_p2_y);
			Point2D p3 = new Point2D(val_p3_x,val_p3_y);
			Triangle t = new Triangle(p1,p2,p3);
			colltri.add(t);

			listeobj.add(t,cbo_listeobj);
			
			Btriangle2=false;
		}
		colltri.afficher(g);//On affiche dans tous les cas la collection de la forme, meme vide
		
		
//CARRE		
		if(Bcarre2)
		{
			Carre c = new Carre(p1,val_lon);
			collcarr.add(c);
		
			listeobj.add(c,cbo_listeobj);
			
			Bcarre2=false;
		}
		collcarr.afficher(g);
		
		
//RECTANGLE	
		if(Brectangle2)
		{
			Rectangle r = new Rectangle(p1,val_lon,val_lar);
			collrect.add(r);
			
			listeobj.add(r,cbo_listeobj);
			
			Brectangle2=false;
		}
		collrect.afficher(g);
		
		
//LOSANGE		
		if(Blosange2)
		{
			Losange l = new Losange(p1,val_lon,val_dia);
			colllos.add(l);
			
			listeobj.add(l,cbo_listeobj);
			
			Blosange2=false;
		}
		colllos.afficher(g);
		
		
//CERCLE		
		
		if(Bcercle2)
		{
			Cercle c = new Cercle(p1,val_ray1);
			collcer.add(c);
			
			listeobj.add(c,cbo_listeobj);
			
			
		//if(Bquadrangle)
		//{
			//Cercle c = new (p1,val_ray1);
			//collcer.add(c);
				
			//listeobj.add(c,cbo_listeobj);
				
			//c.deplacer(-val_ray1/2,-val_ray1/2);
		//}
			
			Bcercle2=false;
		}
		collcer.afficher(g);
			
		
//ARC DE CERCLE	
		if(Badc2)
		{
			ArcDeCercle a = new ArcDeCercle(p1,val_ray1,val_ang1,val_ang2);
			colladc.add(a);
			
			listeobj.add(a,cbo_listeobj);
			
			Badc2=false;
			
		}
		colladc.afficher(g);
		
		
//ELLIPSE		
		if(Bellipse2)
		{
			Ellipse e = new Ellipse(p1,val_ray1,val_ray2);
			collell.add(e);
			
			listeobj.add(e,cbo_listeobj);
			
			Bellipse2=false;
		}
		collell.afficher(g);
		
		
//QUADRANGLE		
		if(Bquadrangle2)
		{
			double pi=Math.PI;
			
			val_ang1_rad = (val_ang1*2*pi)/360;
			val_ang2_rad = (val_ang2*2*pi)/360;
			val_ang3_rad = (val_ang3*2*pi)/360;
			val_ang4_rad = (val_ang4*2*pi)/360;
			
			
			double cos1 = Math.cos(val_ang1_rad);
			double sin1 = Math.sin(val_ang1_rad);
			
			double cos2 = Math.cos(val_ang2_rad);
			double sin2 = Math.sin(val_ang2_rad);
			
			double cos3 = Math.cos(val_ang3_rad);
			double sin3 = Math.sin(val_ang3_rad);
			
			double cos4 = Math.cos(val_ang4_rad);
			double sin4 = Math.sin(val_ang4_rad);
			
			
			double x1 = val_p1_x - (cos1*val_ray1/2);
			double y1 = val_p1_y + (sin1*val_ray1/2);
			
			double x2 = val_p1_x - (cos2*val_ray1/2);
			double y2 = val_p1_y + (sin2*val_ray1/2);
			
			double x3 = val_p1_x - (cos3*val_ray1/2);
			double y3 = val_p1_y + (sin3*val_ray1/2);
			
			double x4 = val_p1_x - (cos4*val_ray1/2);
			double y4 = val_p1_y + (sin4*val_ray1/2);


			Point2D pa = new Point2D((int)x1,(int)y1);
			Point2D pb = new Point2D((int)x2,(int)y2);
			Point2D pc = new Point2D((int)x3,(int)y3);
			Point2D pd = new Point2D((int)x4,(int)y4);
			
			Quadrangle q = new Quadrangle(pa,pb,pc,pd);
			
			collqua.add(q);
					
			listeobj.add(q,cbo_listeobj);
					
			Bquadrangle2=false;
		}
		collqua.afficher(g);		
		
		
//SEGMENT		
		if(Bsegment2)
		{
			
			Point2D p2 = new Point2D(val_p2_x,val_p2_y);
			Segment s = new Segment(p1,p2);
			
			collseg.add(s);
			
			listeobj.add(s,cbo_listeobj);
			
			Bsegment2=false;
		}
		collseg.afficher(g);
		
		
//MULTISEGMENT (depuis un segment)	
		if(Bmultisegment2)
		{
			Segment s = new Segment();//1er segment
			
			s = (Segment) cbo_listeobj.getSelectedItem();//qui prend la valeur du segment sélectionné
			
			Point2D p3 = new Point2D(val_p1_x,val_p1_y);//nouveau point
		
			Multisegment ms = new Multisegment(s);//création du multisegment avec le 1er segment

	        ms.add2(p3);//ajout du point au bout du 1er segment
	        
	        collmultiseg.add(ms);
	        
	        listeobj.add(ms,cbo_listeobj);
	        
	        
	        cbo_listeobj.removeItem(s);//On enlève l'objet segment de la combobox car il est maintenant un multisegment
	        
	        
	        Bmultisegment2=false;
		}
		collmultiseg.afficher(g);
		
		
//MULTISEGMENT (depuis un multisegment)		
		if(BmultisegmentB)
		{
			Multisegment ms = new Multisegment();//1er segment
			
			ms = (Multisegment) cbo_listeobj.getSelectedItem();//qui prend la valeur du segment sélectionné
			
			Point2D p3 = new Point2D(val_p1_x,val_p1_y);//nouveau point
		
	        ms.add2(p3);//ajout du point au bout du 1er segment
	        
	        collmultiseg.add(ms);
	        
	        //listeobj.add(ms,cbo_listeobj);
	        
	        BmultisegmentB=false;
		}
		collmultiseg.afficher(g);
		

//COMPOSITE	DANS PAINT (SUREMENT INUTILE)
		//if(Bcomposite)
		//{
			
//			Composite c = new Composite();//création de l'objet composite
//			
//			
//			//TRIANGLE
//				if(cbo_listeobj.getSelectedItem() instanceof Triangle)
//				{
//					Triangle t = new Triangle();
//	                
//	               	t = (Triangle) cbo_listeobj.getSelectedItem();
//	                
//	               	
//	   		    	c.add(t);//ajout de l'objet au composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listecompo.add(c,cbo_listecompo);
//	   		    	
//	   		    	cbo_listeobj.removeItem(t); 
//	   		    	
//				}
//				
//			//CARRE
//				if(cbo_listeobj.getSelectedItem() instanceof Carre)
//				{
//					Carre carr = new Carre();
//	                
//	               	carr = (Carre) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(carr);//création
//	
//	   		    	c.add(carr);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(carr); 
//				}
//						
//						
//			//RECTANGLE
//				if(cbo_listeobj.getSelectedItem() instanceof Rectangle)
//				{
//					Rectangle r = new Rectangle();
//	                
//	               	r = (Rectangle) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(r);//création
//	
//	   		    	c.add(r);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(r); 
//				}
//						
//			//LOSANGE
//				if(cbo_listeobj.getSelectedItem() instanceof Losange)
//				{
//	                Losange l = new Losange();
//	                
//	               	l = (Losange) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(l);//création
//	
//	   		    	c.add(l);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(l); 
//				}
//						
//			//CERCLE
//				if(cbo_listeobj.getSelectedItem() instanceof Cercle)
//				{
//					Cercle cer = new Cercle();
//	                
//	               	cer = (Cercle) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(cer);//création
//	               	
//	   		    	c.add(cer);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(cer);
//				}
//	
//				
//			//ARC DE CERCLE		
//				if(cbo_listeobj.getSelectedItem() instanceof ArcDeCercle)
//				{
//					ArcDeCercle adc = new ArcDeCercle();
//	                
//					adc = (ArcDeCercle) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(adc);//création
//	
//	   		    	c.add(adc);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(adc);
//				}
//	
//				
//			//ELLIPSE
//				if(cbo_listeobj.getSelectedItem() instanceof Ellipse)
//				{
//					Ellipse e = new Ellipse();
//	                
//					e = (Ellipse) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(e);//création
//	
//	   		    	c.add(e);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(e);
//				}
//				
//				
//			//SEGMENT
//				if(cbo_listeobj.getSelectedItem() instanceof Segment)
//				{
//					Segment s = new Segment();
//	                
//					s = (Segment) cbo_listeobj.getSelectedItem();
//	                
//	               	//Composite c = new Composite(s);//création
//	
//	   		    	c.add(s);//ajout de l'objet à l'arraylist composite
//	   		        
//	   		    	//collcomposite.add(c);
//	   		        
//	   		    	//listeobj.add(c,cbo_listeobj);
//	   		        
//	   		    	cbo_listeobj.removeItem(s);
//				}
//				
//				
//			//MULTISEGMENT
//				if(cbo_listeobj.getSelectedItem() instanceof Multisegment)
//				{
//					Multisegment ms = new Multisegment();
//	                    
//	                ms = (Multisegment) cbo_listeobj.getSelectedItem();
//	                    
//	                //Composite c = new Composite(ms);//création
//	
//	       		    c.add(ms);//ajout de l'objet à l'arraylist composite
//	       		        
//	       		    //collcomposite.add(c);
//	       		        
//	       		    //listeobj.add(c,cbo_listeobj);
//	       		        
//	       		    cbo_listeobj.removeItem(ms);
//				}
//				
//				
//			collcomposite.add(c);
//   		        
//   		    listecompo.add(c,cbo_listecompo);
//   		    	
//			//repaint();
//		    Bcomposite2=false;
	//}
		collcomposite.afficher(g);
			//On veut afficher tous les composites existants
			//qui sont stockés dans cette CollectionComposite
		
		
		
		
		
}//FIN DE LA CLASSE PAINT

////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////

public void BoolInit()
{
	edt_p1_x.setEditable(false);
	edt_p1_x.setText("");
	
	edt_p1_y.setEditable(false);
	edt_p1_y.setText("");
	
	edt_p2_x.setEditable(false);
	edt_p2_x.setText("");
	
	edt_p2_y.setEditable(false);
	edt_p2_y.setText("");
	
	edt_p3_x.setEditable(false);
	edt_p3_x.setText("");

	edt_p3_y.setEditable(false);
	edt_p3_y.setText("");
	
	edt_p4_x.setEditable(false);
	edt_p4_x.setText("");
	
	edt_p4_y.setEditable(false);
	edt_p4_y.setText("");
	
	edt_lon.setEditable(false);
	edt_lon.setText("");
	
	edt_lar.setEditable(false);
	edt_lar.setText("");
	
	edt_dia.setEditable(false);
	edt_dia.setText("");
	
	edt_ang1.setEditable(false);
	edt_ang1.setText("");
	
	edt_ang2.setEditable(false);
	edt_ang2.setText("");
	
	edt_ang3.setEditable(false);
	edt_ang3.setText("");
	
	edt_ang4.setEditable(false);
	edt_ang4.setText("");
	
	edt_ray1.setEditable(false);
	edt_ray1.setText("");

	edt_ray2.setEditable(false);
	edt_ray2.setText("");

//On remet les coordonnées à 0 pour ne pas rien avoir
	edt_vect_x.setText("0");
	edt_vect_y.setText("0");
	
	edt_vectcompo_x.setText("0");
	edt_vectcompo_y.setText("0");
	
	
//On remet les booléens à false pour empêcher la création à venir après avoir choisi une autre forme
	Btriangle = false;
	Bcarre = false;
	Brectangle = false;
	Blosange = false;
	Bcercle = false;
	Badc = false;
	Bellipse = false;
	Bquadrangle = false;
	Bsegment = false;
	Bmultisegment = false;
	
	
	//Bcomposite = false;
}
}
