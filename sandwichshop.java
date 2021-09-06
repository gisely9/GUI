 
package da;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class sandwichshop {
	
	//creating a string array for sandwich ingredients 
String sandwichIngredients []= {"Chicken","Mutton","Veg"};

//creating a string array for bread types
String breadTypes[]= {"Bloomer","Cob","Plait"};

//declaring a container object 
JFrame jf;
JPanel p1,p2,p3,p4, mainP;

//declaring a component object

JList<String>  ingredient , bread;
JLabel ingL,breadL,amountL;
JTextField amountT;
JButton amountB,exitB;

//Define a default constructor 
sandwichshop () {
	
	//create frame 
	jf=new JFrame("SandwichShop");
	
	//creating panels 
	
	p1=new JPanel();
	p2=new JPanel();
	p3= new JPanel();
	p4=new JPanel();
	
	mainP = new JPanel();
	
	//creating list of boxes and add a string array
	
	ingredient= new JList<String>(sandwichIngredients);
	bread = new JList<String>(breadTypes);
	
	//creating text field 
	
   amountT = new JTextField(5);
   
   //creating buttons 
   
   amountB = new JButton("Check Amount");
	exitB= new JButton("Exit");
	
	//Initializing the labels 
	
	ingL =new JLabel();
	breadL= new JLabel();
	amountL = new JLabel();
   
   //Adds component to panels
	p1.add(ingL);
	p1.add(ingredient);
	p2.add(breadL);
	p2.add(bread);
	p3.add(amountL);
	p3.add(amountT);
	p4.add(amountB);
	p4.add(exitB);
	
	//Adds panels to main panel 
	
	mainP.add(p1);
	mainP.add(p2);
	mainP.add(p3);
	mainP.add(p4);

	//Set the main panel layout to 4 rows and 1 column 
	
	mainP.setLayout(new GridLayout(4,1));
	
	//Adds main panel to frame 
	
	jf.add(mainP);
	
	//Sets the frame visible property to true 
	
	jf.setVisible(true);
	
	//set the size of the frame to width 400 and height 150
	
	jf.setSize(400,150);
	
//Registers action listener to exit button using anonymous class 
	
	exitB.addActionListener(new ActionListener()
	{
		
		//overrides the actionPerformed() method 
		
		public void actionPerformed(ActionEvent ae)
		{
			System.exit(0);
			
		
		}
		
		//End of method
		
	});//End of anonymous class 

//Register action listener to amount button using anonymous class 

amountB.addActionListener(new ActionListener() 
		
		{
	//Overrides the actionPerformed() method 
	
	public void actionPerformed(ActionEvent ae)
	{
		
		//Extracts index of the selected item from the list box 
		
		int indexIngredient = ingredient.getSelectedIndex();
		
		int indexBread = bread.getSelectedIndex();
		
		//checks if ingredient index is 0 and bread index is 0
		
		//then set the amount 100 in text field 
		
	if(indexIngredient ==0 && indexBread ==0)
		amountT.setText("100");
	
	//checks if ingredient index is 0 and bread index 1
	
	//then set the amount 120 in text field 
	
	if(indexIngredient==0 && indexBread==1)
		amountT.setText("120");
	
	//checks if ingredient index is 0 and bread index is 2
	
	// then set the amount 160 in text field 
	
	if(indexIngredient ==0 && indexBread ==2)
		amountT.setText("160");
	
	//checks if ingredient index is 1 and bread index is 0
	
		// then set the amount 190 in text field
	
	if(indexIngredient ==1 && indexBread ==0)
		amountT.setText("190");
	
	//checks if ingredient index is 1 and bread index is 1
	
			// then set the amount 205 in text field
	
	if(indexIngredient ==1 && indexBread ==1)
		
		amountT.setText("205");
	
	//checks if ingredient index is 1 and bread index is 2
	
	// then set the amount 210 in text field
	
	if(indexIngredient ==1 && indexBread ==2)
		
		amountT.setText("210");
	
	//checks if ingredient index is 2 and bread index is 0
	
		// then set the amount 97 in text field
	
	if(indexIngredient ==2 && indexBread ==0)
		
		amountT.setText("97");
	
	
	//checks if ingredient index is 2 and bread index is 1
	
			// then set the amount 85 in text field
	
	if(indexIngredient ==2 && indexBread ==1)
		
		amountT.setText("85");
		
	//checks if ingredient index is 2 and bread index is 2
	
	// then set the amount 70 in text field
	
	if(indexIngredient ==2 && indexBread ==2)
		
		amountT.setText("70");
	
	    }//End of method 
	
		});//End of anonymous class 
		
		}//End of default constructor
		
		//main function definition 
		
		public static void main (String[] args)
		
		{
	
	//creates an anonymous object by calling default constructor 
			
	  new sandwichshop  ();
	  
		}//End of main method 
		
		//End of class 
	
	}
	


