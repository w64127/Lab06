package com.company;

//exercise1
interface Plywa {
    void plun();
}

interface Lata {
    void lec();
}

class Statek implements Plywa{
    public void plun() {
        System.out.println("I can swim!");
    }
}

class Samolot implements Lata{
    public void lec() {
        System.out.println("I can fly!");
    }
}

//exercise2
interface Plywanie{
    void plyn();
    void wynurz();
    void zanurz();
}

interface Latanie{
    void lec();
    void wyladuj();
}

abstract class Zwierze{ }

abstract class Ryba extends Zwierze implements Plywanie{
    abstract void jedz();
    abstract void wydalaj();
}

class Wieloryb extends Ryba{
    void jedz(){
        System.out.println("I can eat");
    }
    void wydalaj(){
        System.out.println("I can poop");
    }
    public void plyn(){
        System.out.println("I can swim");
    }
    public void wynurz(){
        System.out.println("I can breathe");
    }
    public void zanurz(){
        System.out.println("I can breathe under the water");
    }
}

public class Main {
    public static void main(String[] args) {
	    //exercise1
        System.out.println("Exercise1 -- Ship and airplane");
        Statek statek = new Statek();
        Samolot samolot = new Samolot();

        statek.plun();
        samolot.lec();

        //exercise2
        System.out.println("\nWhat does whale say?");
        Wieloryb wieloryb = new Wieloryb();

        wieloryb.jedz();
        wieloryb.plyn();
        wieloryb.wydalaj();
        wieloryb.wynurz();
        wieloryb.zanurz();
    }
}
