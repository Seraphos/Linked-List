/**
 * Created by Seraphos on 4/13/2016.
 */
public class PlayerLinkedListClient {

    public static void main(String [] args){
    Player p1 = new Player(1, "Bob", "Bob's Burgers");
    Player p2 = new Player(2, "Jamie", "Jamie's Game");
    Player p3 = new Player(3, "John", "John Cena");
    Player p4 = new Player(4, "Steve", "Call of Duty");
    Player p5 = new Player(5, "Arthur", "World of Warcraft");
    Player p6 = new Player(6, "Sarah", "Left for Dead");

    PlayerLinkedList players = new PlayerLinkedList();
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());
    players.insert(p1);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());
    players.insert(p2);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());
    players.insert(p3);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());

    players.insertNextToLast(p4);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());

    players.insertNextToLast(p5);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());

    players.insertNextToLast(p6);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + " \n"
            + players.toString());

    players.insertNextToLast(p6);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertNextToLast(p6);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertNextToLast(p6);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());


        try {
            players.deleteSecond();
        } catch (DataStructureException e) {
            e.printStackTrace();
        }
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());

        try {
            players.deleteSecond();
        } catch (DataStructureException e) {
            e.printStackTrace();
        }
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());

        try {
            players.deleteSecond();
        } catch (DataStructureException e) {
            e.printStackTrace();
        }
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());

    players.insertLast(p1);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertLast(p2);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertLast(p3);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertLast(p4);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertLast(p5);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    players.insertLast(p6);
    System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
    try {
        players.insertPlayerThirdPosition(p1);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        players.insertPlayerThirdPosition(p2);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        players.insertPlayerThirdPosition(p3);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        players.insertPlayerThirdPosition(p4);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        players.insertPlayerThirdPosition(p5);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        players.insertPlayerThirdPosition(p6);
        System.out.println("Number of items in the list: " + players.getNumberOfItems() + "\n" + players.toString());
        } catch (NullPointerException e){
            e.printStackTrace();
    }


}//end client method
}
