package rpg;

public class Wizard extends Character {

    // public Wizard(String name) {
    //     super(name);
    //     this.job = "wizard";
    //     this.hp = 30;
    //     this.mp = 20;
    //     this.attackPower = 4;
    //     this.defencePower = 3;
//     }
// }

public Wizard(String name) {
    super(name);
    this.setJob("wizard");
    this.setHp(30);
    this.setMp(20);
    this.setAttackPower(4);
    this.setDefencePower(3);
  }
}