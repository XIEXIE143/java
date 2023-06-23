package zoo;

public class AnimalApp {
    public static void main(String[] args) {
        // Animal dog = new Animal();
    //     dog.type= "dog";
    //     dog.name = "タロー";
    //     dog.crying = "わん!";

    //     dog.walk();
    //     dog.cry();

    //     Animal cat = new Animal();
    //     cat.type= "cat";
    //     cat.name = "ミク";
    //     cat.crying = "ニャー!";

    //     cat.walk();
    //     cat.cry();
    //     cat.escape();
    // }

    // 問題
        // dog.type = "dog";
        // dog.name = "ポチ";
        // dog.crying = "わん！";

        // Animal cat = new Animal();
        // cat.type = "cat";
        // cat.name = "ミケ";
        // cat.crying = "にゃー！";

        // dog.walk();
        // dog.cry();
        // cat.cry();
        // cat.escape();

        Dog dog = new Dog("タロー");
        dog.walk();
        dog.cry();

        Cat cat = new Cat("ミケ");
        cat.cry();
        cat.walk();
        cat.escape();

        Dog dog1 = new Dog("マイケル");
        Dog dog2 = new Dog("ション");
        Cat cat1 = new Cat("リサ");
        Cat cat2 = new Cat("シロー");

        Animal[] animals = {
            dog1, dog2, cat1, cat2
        };

        for (Animal animal : animals) {
            System.out.println(animal.name + ":");
            animal.cry();
            animal.walk();
        }
    }
}
