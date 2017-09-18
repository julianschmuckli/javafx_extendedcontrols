package net.schmuckli.logic.wurfel;

import java.util.Random;

public class Wurfel {

    private Random rand = new Random();
    private int current = 1;

    public Wurfel() {
        current = rand.nextInt(6) + 1;
    }

    public void randomize() {
        current = rand.nextInt(6) + 1;
    }

    public int getCurrent() {
        return current;
    }
}
