/*Name: Taha Rangwala
 * Date: January 13, 2017
 * Purpose: This is the tree node class, and this holds all of the information for all
 * the tree nodes including the value and the node to the left and right of the node 
 */

//treeNode class header
public class treeNode<T>  {

	//Declaring private instance variables
	private T value;//value of node
	private treeNode<T> left, right;//nodes to left and right of node

	/*Purpose: Constructor method to initialize private instance variables
	 * @param initValue value of tree node
	 * @param initLeft left node
	 * @param initRight right node 
	 */
	public treeNode(T initValue, treeNode<T> initLeft, treeNode<T> initRight){
		value = initValue;
		left = initLeft;
		right = initRight;
	}

	/*Purpose: Constructor method to initialize private instance variables
	 * @param initValue value of tree node
	 */
	public treeNode(T initValue){
		value = initValue;
		left = null;
		right = null;
	}

	/*Purpose: Gets the value of the node
	 * @return Returns a generic type of the value of the node
	 */
	public T getValue(){
		return value;
	}

	/*Purpose: Gets the left node of the current node
	 * @return Returns the left node of the current node
	 */
	public treeNode<T> getLeft(){
		return left;
	}

	/*Purpose: Gets the right node of the current node
	 * @return Returns the right node of the current node
	 */
	public treeNode<T> getRight(){
		return right;
	}

	/*Purpose: Sets the value of the current node
	 * @param value new value of the current node
	 */
	public void setValue(T value){
		this.value = value;
	}

	/*Purpose: Sets the node of the left node
	 * @param node new node of the left node
	 */
	public void setLeft(treeNode<T> node){
		left = node;
	}

	/*Purpose: Sets the node of the right node
	 * @param node new node of the right node
	 */
	public void setRight(treeNode<T> node){
		right = node;
	}

}