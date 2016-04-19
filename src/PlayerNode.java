/**
 * Created by Seraphos on 4/13/2016.
 */
public class PlayerNode {
    private Player player;
    private PlayerNode next;

    public PlayerNode(){
        player = null;
        next = null;
    }//end constructor

    public PlayerNode(Player p){
        setPlayer(p);
        next = null;

    }//end overloaded constructor

    public Player getPlayer(){
        return player;
    }//end getter

    public PlayerNode getNext(){
        return next;
    }//end getter

    public void setPlayer(Player p){
        player = p;
    }//end setter

    public void setNext(PlayerNode pn){
        next = pn;
    }//end setter

}
