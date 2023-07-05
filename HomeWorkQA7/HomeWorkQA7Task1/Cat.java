package HomeWorkQA7Task1;

import HomeWorkQA7Task1.Animals;

public class Cat extends Animals {
    @Override
    void eat() {
        System.out.println("Сat eat");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleep");
    }
}
