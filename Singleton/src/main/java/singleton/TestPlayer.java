package singleton;

public class TestPlayer {

    public static void main(String[] args){

        Player player = Player.getPlayer("pepe");
        System.out.println(player);
        player = Player.getPlayer("pedro");
        System.out.println(player);
    }
}
