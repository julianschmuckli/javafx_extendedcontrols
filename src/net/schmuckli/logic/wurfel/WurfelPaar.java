package net.schmuckli.logic.wurfel;

import java.util.ArrayList;

public class WurfelPaar {

    private ArrayList<Wurfel> wurfels = new ArrayList<>();
    private static WurfelPaar instance = null;

    private WurfelPaar() {
        for (int i = 0; i < 4; i++) {
            wurfels.add(new Wurfel());
        }
    }

    public static WurfelPaar getInstance() {
        if (instance == null) {
            instance = new WurfelPaar();
        }
        return instance;
    }

    public void randomizeAll() {
        for (Wurfel curr : wurfels) {
            curr.randomize();
        }
    }

    public ArrayList<Wurfel> getWurfels() {
        return wurfels;
    }
}
