package ru.vsu.but.project;public class Dog {    int size;    String name;    void bark() {        if (size > 60) {            System.out.println("Gav-gav");        } else if (size > 14) {            System.out.println("Vuf-vuf");        } else {            System.out.println("Tyaf-tyaf");        }    }}class DogTestDrive {    public static void main(String[] args) {        Dog one = new Dog();        one.size = 70;        Dog two = new Dog();        two.size = 8;        Dog three = new Dog();        three.size = 35;        one.bark();        two.bark();        three.bark();    }}    /*String name;    public static void main(String[] args) {        // Создаем объект DOg и получаем к нему доступ        Dog dog1 = new Dog();        dog1.bark();        dog1.name = "Bart";        //Теперь создадим массив типа Dog        Dog[] myDogs = new Dog[3];        //Поместим в него несколько элементов        myDogs[0] = new Dog();        myDogs[1] = new Dog();        myDogs[2] = dog1;        //Теперь получамем доступ к объектам Dog с помощью ссылок из масси        myDogs[0].name = "Fred";        myDogs[1].name = "John";        System.out.print("Name of the last dog: ");        System.out.println(myDogs[2].name);        //переберем все элементы массива и вызовем для каждого метод bark()        int x = 0;        while (x < myDogs.length) {            myDogs[x].bark();            x = x + 1;        }    }    public void bark() {        System.out.println( name + " says gav!");    }    public void eat() { }    public void chaseCat() { } */