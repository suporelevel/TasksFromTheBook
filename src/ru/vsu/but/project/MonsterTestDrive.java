package ru.vsu.but.project;public class MonsterTestDrive {    public static void main(String[] args) {        Monster [] ma = new Monster[3];        ma[0] = new Vampire();        ma[1] = new Dragon();        ma[2] = new Monster();        for (int x=0; x<3; x++) {            ma[x].frighten(x);        }    }}class Monster {    boolean frighten(int z) {        System.out.println("GRRRRRRRR");        return true;    }}class Vampire extends Monster {    boolean frighten(byte x) {        System.out.println("Куснуть?");        return true;    }}class Dragon extends Monster {    boolean frighten(int degree) {        System.out.println("Огненное дыхание");        return true;    }}