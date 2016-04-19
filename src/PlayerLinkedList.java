/**
 * Created by Seraphos on 4/13/2016.
 */


public class PlayerLinkedList extends ShellLinkedList{

    public PlayerLinkedList(){
        super();
    }//end constructor

    public void insert(Player p){
        PlayerNode pn = new PlayerNode(p);
        pn.setNext(head);
        head = pn;

        numberOfItems++;
    }//end insert method

    public void insertPlayerThirdPosition(Player p)throws NullPointerException{
        if( numberOfItems > 2 ){
            PlayerNode pn = new PlayerNode(p);
            head = pn;
            pn.setNext(head.getNext().getNext());
            head.getNext().setNext(pn);
            numberOfItems++;
        }//end if conditional

        else{
            PlayerNode pn = new PlayerNode(p);
            if ( head == null ){
                head = pn;
            }//end inner if conditional
            pn.setNext(head);
            head = pn;
            numberOfItems++;
        }//end else conditional

    }//end insert player in third position method
    public Player delete(int searchID) throws DataStructureException{
        PlayerNode current = head;
        PlayerNode previous = null;

        while ( current != null && current.getPlayer().getID()!= searchID ){
            previous = current;
            current = current.getNext();

        }//end while loop
        if ( current == null)
            throw new DataStructureException(searchID + " not found, cannot be deleted.");
        if ( current == head )
            head = head.getNext();//delete head
        else {
            previous.setNext(current.getNext());
        }

        numberOfItems--;
        return current.getPlayer();
    }//end delete method

    public Player deleteSecond() throws DataStructureException{

        if ( numberOfItems < 2)
            throw new DataStructureException("Fewer than two players are on the list, cannot delete.");
        else
        {
            PlayerNode current = head.getNext();
            head.setNext(current.getNext());
            numberOfItems--;
            return current.getPlayer();
        }
    }//end method
    public void insertNextToLast(Player p){

        PlayerNode pn = new PlayerNode(p);
        PlayerNode current = head;

        if (numberOfItems == 0)
            head = pn;
        else if (numberOfItems == 1)
        {
            pn.setNext(head);
            head = pn;
        }//end else
        else{
            for (int i = 0; i < numberOfItems -2; i++)
                current = current.getNext();
            pn.setNext(current.getNext());
            current.setNext(pn);
        } //end inner else
        numberOfItems++;

    }//end method

    public void insertLast(Player p){

        PlayerNode pn = new PlayerNode(p);
        PlayerNode current = head;

        if (numberOfItems == 0)
            head = pn;
        else {
            if (numberOfItems == 1) {
                pn.setNext(head);
                head = pn;
            }//end conditional
            else {
                for (int i = 0; i < numberOfItems - 1; i++)
                    current = current.getNext();
                pn.setNext(current.getNext());
                current.setNext(pn);
            }//end conditional
        }
        numberOfItems++;

    }//end method

    public Player peek( int searchID )throws DataStructureException{

        PlayerNode current = head;

        while ( current != null && current.getPlayer().getID() != searchID )
            current = current.getNext();

        if ( current == null )
            throw new DataStructureException(searchID + " not found: cannot be returned.");
        else
            return current.getPlayer();

    }//end peek


}
