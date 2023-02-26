package main;

import ru.ifmo.se.pokemon.*;
import main.poks.*;
import main.moves.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Braviary p1 = new Braviary("Орлан",63);
        Deoxys p2 = new Deoxys("Вирус из космоса", 49);
        Poliwag p3 = new Poliwag("Головастик",1);
        Poliwhirl p4 = new Poliwhirl("Амфибия", 48);
        Poliwrath p5 = new Poliwrath("СверхАмфибия", 1);
        Rufflet p6 = new Rufflet("Орленок", 59);

        b.addAlly(p2);
        b.addAlly(p3);
        b.addAlly(p6);
        b.addFoe(p1);
        b.addFoe(p4);
        b.addFoe(p5);
        b.go();
    }
}