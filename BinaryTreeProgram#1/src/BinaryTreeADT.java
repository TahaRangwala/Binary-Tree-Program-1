/*Name: Taha Rangwala
 *Date: January 13, 2017
 *Purpose: This interface holds all of the methods that multiple classes use for a binary tree. This
 *is a form of polymorphism.
 */

//BinaryTreeADT Interface Header
public interface BinaryTreeADT <T>{

	/*Purpose: Gets the top root
	 * @return Returns the top root
	 */
	public treeNode<T> getRoot();

	/*Purpose: Sets the node of the top root
	 * @param newNode new node of the top root 
	 */
	public void setRoot(treeNode<T> newNode); 

	/*Purpose: Checks if the binary tree is empty
	 * @return Returns a boolean value of whether or not the binary tree is empty
	 */
	public boolean isEmpty();

	/*Purpose: Add element to binary tree
	 * @param element Element added to binary tree
	 */
	public void add(T element);

	/*Purpose: Checks if an element is in the binary tree
	 * @param element Element be searched for
	 * @return Returns a boolean value of whether or not the element is in the binary tree
	 */
	public boolean containsRegular(T element);
	
	/*Purpose: Checks if an element is in the binary tree recursively
	 * @param element Element be searched for
	 * @param currentNode node that is being compared to the element
	 * @return Returns a boolean value of whether or not the element is in the binary tree
	 */
	public boolean containsRecursive(T element, treeNode <T> currentNode);
	
}
