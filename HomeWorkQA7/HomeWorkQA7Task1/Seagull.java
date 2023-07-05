package HomeWorkQA7Task1;

import HomeWorkQA7Task1.Animals;
import HomeWorkQA7Task1.Fly;

public class Seagull extends Animals implements Fly {
    @Override
    void eat() {
        System.out.println("Seagull eats");
    }

    @Override
    void sleep() {
        System.out.println("Seagull sleep");
    }


    @Override
    public void fly() {
        System.out.println("Seagull fly");
    }


}
