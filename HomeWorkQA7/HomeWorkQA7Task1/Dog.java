package HomeWorkQA7Task1;

import HomeWorkQA7Task1.Animals;

public class Dog extends Animals {

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    void sleep() {
        System.out.println("Dog sleep");
    }
}
