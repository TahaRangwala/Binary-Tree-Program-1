/*Name: Taha Rangwala
 *Date: January 13, 2017
 *Purpose: This is the binary tree class which holds a binary tree. It holds a root node
 *and method related to the binary tree.
 */

//BinaryTree class header
public class BinaryTree <T extends Comparable<T>> implements BinaryTreeADT<T>{

	//Declaring private instance variables
	private treeNode <T> Root;//Root node of binary tree
	
	//Constructor method to initialize private instance variables
	public BinaryTree(){
		Root = null;
	}

	/*/*Purpose: Gets the top root
	 * @return Returns the top root
	 */
	public treeNode getRoot() {
		return Root;
	}

	/*Purpose: Sets the node of the top root
	 * @param newNode new node of the top root 
	 */
	public void setRoot(treeNode <T> newNode) {
		Root.setValue(newNode.getValue());
	}

	/*Purpose: Checks if the binary tree is empty
	 * @return Returns a boolean value of whether or not the binary tree is empty
	 */
	public boolean isEmpty() {
		return Root == null;
	}

	/*Purpose: Add element to binary tree
	 * @param element Element added to binary tree
	 */
	public void add(T element) {
		if(isEmpty())
			Root = new treeNode(element);
		else{
			treeNode <T> Temp = Root, Previous = null;
			while(Temp != null){
				if(element.compareTo(Temp.getValue()) < 0){
					Previous = Temp;
					Temp = Temp.getLeft();
				}
				else{
					Previous = Temp;
					Temp = Temp.getRight();
				}
			}
			if(element.compareTo(Previous.getValue()) < 0)
				Previous.setLeft(new treeNode(element));
			else
				Previous.setRight(new treeNode(element));
		}
	}

	/*Purpose: Checks if an element is in the binary tree
	 * @param element Element be searched for
	 * @return Returns a boolean value of whether or not the element is in the binary tree
	 */
	public boolean containsRegular(T element) {
		if(isEmpty())
			throw new IllegalArgumentException("The Binary Tree Is Empty!");
		else{
			treeNode <T> Temp = Root;
			while(Temp != null){
				if(element.compareTo(Temp.getValue()) < 0){
					System.out.print(Temp.getValue() + " ");
					Temp = Temp.getLeft();
				}
				else if(element.compareTo(Temp.getValue()) > 0){
					System.out.print(Temp.getValue() + " ");
					Temp = Temp.getRight();
				}
				else{
					System.out.println(Temp.getValue() + " Found");
					return true;
				}
			}
			System.out.println(Temp.getValue() + " Not Found");
			return false;
		}
	}

	/*Purpose: Checks if an element is in the binary tree recursively
	 * @param element Element be searched for
	 * @param currentNode node that is being compared to the element
	 * @return Returns a boolean value of whether or not the element is in the binary tree
	 */
	public boolean containsRecursive(T element, treeNode <T>currentNode) {
		if(isEmpty())
			throw new IllegalArgumentException("The Binary Tree Is Empty!");
		else if(element.compareTo(currentNode.getValue()) == 0){
			System.out.println(currentNode.getValue() + " Found");
			return true;
		}
		else if(currentNode == null){
			System.out.println(currentNode.getValue() + " Not Found");
			return false;
		}
		else if (element.compareTo(currentNode.getValue()) < 0){
			System.out.print(currentNode.getValue() + " ");
			return containsRecursive(element, currentNode.getLeft());
		}
		else{
			System.out.print(currentNode.getValue() + " ");
			return containsRecursive(element, currentNode.getRight());
		}
	}
	
}
