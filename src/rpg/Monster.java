package rpg;

// import java.util.Random;

// public class Warrior extends Character {

//     public Warrior(String name) {
//         super(name);
//         this.setJob("warrior");
//         this.setHp(50);
//         this.setMp(0);
//         this.setAttackPower(7);
//         this.setDefencePower(3);
//     }
    
//     @Override
//     public void attack(Monster monster) {
//         System.out.println("Override!!");
//         // attackPower を一時保存（いちじほぞん）
//         int attackPower = this.getAttackPower();

//         // クリティカルヒット（ランダム）
//         Random rand = new Random();
//         if (rand.nextInt(5) == 0) {
//             // attackPower を2倍にして攻撃（こうげき）
//             setAttackPower(attackPower * 2);
//         }
//         super.attack(monster);

//         // attackPowerを戻す
//         this.setAttackPower(attackPower);
//     }

// }


public class Monster {

    public Monster(String name) {
        this.name = name;
        this.hp = 10;
        this.mp = 0;
        this.attackPower = 100;
        this.defencePower = 2;
    }

    public String name;
    public int hp;
    public int mp;
    public int attackPower;
    public int defencePower;

    public void attack(Character character) {
        int damage = this.attackPower - character.getDefencePower();
        if (damage > 0) {
            character.setHp(character.getHp() - damage);
        }
    }

}