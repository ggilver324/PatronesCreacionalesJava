package protoType;

public class TestProtoType {

    public static void main(String[] args){

        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.Clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("************* Warrior *****************");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("******************************");
        Mage mage1 = new Mage(500,500,500);
        Mage mage2 = (Mage) mage1.Clone();
        System.out.println(mage1);
        System.out.println(mage2);
        mage2.setDamage(200);
        System.out.println("************* Mage *****************");
        System.out.println(mage1);
        System.out.println(mage2);





        /*    Enemy enemy1 = new Enemy(100, 100);
        Enemy enemy2 = enemy1;
        Enemy enemy3 = enemy1;
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
        System.out.println("*********************************");
        enemy2.setHealth(0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
    */


    }
}
