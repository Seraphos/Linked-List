import javax.xml.crypto.Data;

/**
 * Created by Seraphos on 4/18/2016.
 */
public class PlayerStackLinkedList extends ShellLinkedList{


    public PlayerStackLinkedList(){
        super();
    }//end constructor
    //push method @param p Player object to insert
    public void push (Player p){
        PlayerNode pn = new PlayerNode(p);
        pn.setNext(head);
        head = pn;
        numberOfItems++;
    }//end push method

    //pop method @return the Player object deleted
    public Player pop () throws DataStructureException {
        if (isEmpty())
            throw new DataStructureException("empty stack: cannot be popped.");
        else {
            Player deleted = head.getPlayer();
            head = head.getNext();
            numberOfItems--;
            return deleted;
        }//end else statement
    }//end pop method
        //peek method @return the Player object retrieved

    public Player peek(Player p5) throws DataStructureException {
        if (isEmpty())
            throw new DataStructureException("empty stack: cannot peek");
        else {
            return head.getPlayer();
        }//end peek method


    }//end class
}