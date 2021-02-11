package com.example;

public class Main {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.setName("My friend");
        Cat c = new Cat();
        c.setName("Tom");
        Dog d = new Dog();
        d.setName("Beethoven");
        SiamiCat sc = new SiamiCat();
        sc.setName("Prince");
        Labrador l = new Labrador();
        l.setName("Lucky");

        Animal [] animals = new Animal[]{a, c, d, sc, l};

        for (int i = 0; i < animals.length; i++){
            animals[i].gotoVet();
        }

        for (int i = 0; i < animals.length; i++){
            getSize(animals[i]);
        }

        d.setBarkLength(true);
        guardTheHouse(d);
    }

    public static void getSize(Animal a){
        System.out.println(String.format("Size of the pet is %s", a.getSize()));
    }

    public static void guardTheHouse(Dog dog){
        dog.guardHouse();
    }
}
