package rpg;

// public class Wizard extends Character {

//     public Wizard(String name) {
//         super(name);
//         this.setJob("wizard");
//         this.setHp(30);
//         this.setMp(20);
//         this.setAttackPower(4);
//         this.setDefencePower(3);
//     }
    
// }

import java.util.Random;
public class Warrior extends Character {

    public Warrior(String name) {
        super(name);
        this.setJob("warrior");
        this.setHp(50);
        this.setMp(0);
        this.setAttackPower(7);
        this.setDefencePower(3);
    }
    
    @Override
    public void attack(Monster monster) {
        System.out.println("Override!!");
        // attackPower を一時保存（いちじほぞん）
        int attackPower = this.getAttackPower();

        // クリティカルヒット（ランダム）
        Random rand = new Random();
        if (rand.nextInt(5) == 0) {
            // attackPower を2倍にして攻撃（こうげき）
            setAttackPower(attackPower * 2);
        }
        super.attack(monster);

        // attackPowerを戻す
        this.setAttackPower(attackPower);
    }

}