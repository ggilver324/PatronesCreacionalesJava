package singletonThread;

public class TestPlayer {

    public static void main(String[] args){

        Thread threadPepe = new Thread(new RunPepe());
        Thread threaManolo = new Thread(new RunManolo());

        threadPepe.start();
        threaManolo.start();
    }

    static class RunPepe implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Pepe");
            System.out.println("Running Pepe" + player);
        }
    }

    static class RunManolo implements Runnable{

        @Override
        public void run() {
            Player player = Player.getPlayer("Manolo");
            System.out.println("Running Manolo" + player);
        }
    }
}
