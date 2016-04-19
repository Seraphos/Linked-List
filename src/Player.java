/**
 * Created by Seraphos on 4/13/2016.
 */
public class Player {
    private int id;
    private String name;
    private String game;

    public Player(int i, String n, String g){
        id = i;
        name  = n;
        game = g;
    }//end constructor

    public int getID(){
        return id;
    }//end getter

    public String getName(String n){

        return name;
    }//end getName

    public String getGame(String g){
        return game;

    }//end getter

    public void setID(int i){
        id = i;
    }//end setter

    public void setName(String n){
        name = n;
    }//end setter

    public void setGame(String g){
        game = g;
    }//end setter

    public boolean equals( Object p ){
        if( !( p instanceof Player) )
            return false;
        else{
            Player objPlayer = (Player ) p;
            return ( id == objPlayer.id && name.equals( objPlayer.name) &&
                    game.equals( objPlayer.game) );
        }

    }//end equals method

    public String toString(){

        return("id: " + id + "\t Name: " + name + "\t Game: " + game);
    }//end toStirng
}
