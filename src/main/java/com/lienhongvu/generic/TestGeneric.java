package com.lienhongvu.generic;

import com.lienhongvu.abstractclass.*;

import java.util.ArrayList;

/**
 * Created by hvlien on 9/20/2017.
 */
public class TestGeneric {

    public static void main(String[] args) {
        new TestGeneric().go();
    }

    private void go(){
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
        takeAnimal(animals);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        takeAnimal(dogs);
    }

    private void takeAnimal(ArrayList<? extends Animal> animals){
        for (Animal animal: animals) animal.sound();
    }

    // How to declare a generic type
    private <T extends Animal> void getAnimal1(ArrayList<T> arrayList){
    }
    // Or
    private void getAnimal2(ArrayList<? extends Animal> arrayList){
    }
}
