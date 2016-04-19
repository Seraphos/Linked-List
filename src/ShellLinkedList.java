/**
 * Created by Seraphos on 4/17/2016.
 */
public abstract class ShellLinkedList {

    protected PlayerNode head;
    protected int numberOfItems;

    public ShellLinkedList() {
        head = null;
        numberOfItems = 0;
    }//end constructor

    public int getNumberOfItems(){
        return numberOfItems;
            }//end getter

    public boolean isEmpty(){
        return (numberOfItems == 0);
    }//end boolean

    public String toString(){
        String listString = "";
        PlayerNode current = head;
        while (current != null)
        {
            listString += current.getPlayer().toString() + "\n";
            current = current.getNext();
        }//end while
        return listString;
    }//end toString

}//end class
