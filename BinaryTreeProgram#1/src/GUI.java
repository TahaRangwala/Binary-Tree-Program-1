/*Name: Taha Rangwala
 * Date: January 13, 2017
 * Purpose: This is the gui class which allows the user to use a friendly user interface that
 * has buttons and input and output fields; 
 */

import BreezySwing.*;//allows for more window objects

import javax.swing.*;//allows for more window objects

import java.awt.Color;//allows for more colors

//GUI class header
public class GUI extends GBFrame {

	//Declaring private instance variables
	private BinaryTreeADT treeObj;//BinaryTreeADT object
	//Declaring window objects
	private JLabel numberLabel;
	private IntegerField numberField;
	private JButton Add, regSearch, recurSearch, Exit;
	
	//Constructor method to initialize private instance variables and window objects
	public GUI(){
		treeObj = new BinaryTree();
		numberLabel = addLabel("Number",1,1,1,1);
		numberField = addIntegerField(0,1,2,1,1);
		Add = addButton("Add",2,1,1,1);
		Exit = addButton("Exit",2,2,1,1);
		regSearch = addButton("Regular Search",3,1,1,1);
		recurSearch = addButton("Recursive Search",3,2,1,1);
		numberField.setText("");
		numberField.grabFocus();
	}
	
	/*Purpose: The purpose of this method is to detect which button the user presses and then it performs whatever task
	 * that the button is associated with
	 * @param buttonObj This is the button object which holds the value of what button the user has pressed
	 */
	public void buttonClicked(JButton buttonObj){
		if(buttonObj == Add){//Add a number
			if(checkNumber()){
				treeObj.add(numberField.getNumber());
				numberField.setText("");
				numberField.grabFocus();
			}
			else
				JOptionPane.showMessageDialog(new JFrame(),"Number Values Are Invalid!", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
		else if(buttonObj == regSearch){//Regular search for number in tree
			if(checkNumber()){
				try{
					treeObj.containsRegular(numberField.getNumber());
					numberField.setText("");
					numberField.grabFocus();
				}
				catch(IllegalArgumentException E){
					JOptionPane.showMessageDialog(new JFrame(),E.getLocalizedMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
			else
				JOptionPane.showMessageDialog(new JFrame(),"Number Values Are Invalid!", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
		else if(buttonObj == recurSearch){//Recursive search for number in tree
			if(checkNumber()){
				try{
					treeObj.containsRecursive(numberField.getNumber(),treeObj.getRoot());
					numberField.setText("");
					numberField.grabFocus();
				}
				catch(IllegalArgumentException E){
					JOptionPane.showMessageDialog(new JFrame(),E.getLocalizedMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
				}
			}
			else
				JOptionPane.showMessageDialog(new JFrame(),"Number Values Are Invalid!", "Error Message", JOptionPane.ERROR_MESSAGE);
		}
		else
			this.dispose();//closes the program
	}
	
	/*Purpose: The purpose of this method is to check if the numbers are valid integers
	 * @return Returns a boolean value of whether or not the number is a valid integer
	 */
	private boolean checkNumber(){
		return numberField.isValidNumber();
	}
	
	// Main method to set up the GUI
	public static void main (String [] args){
		GUI theMainGUI = new GUI();
		theMainGUI.setSize(300,150);//size of the GUI interface
		theMainGUI.setTitle("Choose Type of Program");//title of GUI interface
		theMainGUI.setLookAndFeel("MOTIF");//This changes the look of the GUI interface
		theMainGUI.setVisible(true);//visibility of interface
		theMainGUI.setLocationRelativeTo(null);//Location is in center of screen
		theMainGUI.getContentPane().setBackground(new Color(169,229,255));//background of GUI is light blue
	}
	
}

	