package main;

import ru.ifmo.se.pokemon.*;
import main.poks.*;
import main.moves.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Braviary p1 = new Braviary("Орлан",1);
        Deoxys p2 = new Deoxys("Вирус из космоса", 1);
        Poliwag p3 = new Poliwag("Головастик",1);
        Poliwhirl p4 = new Poliwhirl("Амфибия", 1);;
        Poliwrath p6 = new Poliwrath("СверхАмфибия", 1);
        Rufflet p5 = new Rufflet("Орленок", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}