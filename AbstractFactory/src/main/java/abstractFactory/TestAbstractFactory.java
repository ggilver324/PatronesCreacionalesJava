package abstractFactory;

import abstractFactory.armor.Armor;
import abstractFactory.enemy.Enemy;
import abstractFactory.factory.EnemyAbstractFactory;
import abstractFactory.factory.MageFactory;
import abstractFactory.factory.WarriorFactory;
import abstractFactory.weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args){

        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor heavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        heavyArmor.protect();
        axe.damage();

        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();
        mage.attack();
        robe.protect();
        wizardStaff.damage();

    }
}
