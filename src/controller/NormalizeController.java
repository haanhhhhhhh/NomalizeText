
package controller;

import common.Algorithm;
import common.Library;
import view.Menu;

public class NormalizeController extends Menu<String> {

    static String[] options = {"Normalize file text.", "Exit."};
    Library l;
    Algorithm ar;

    public NormalizeController() {
        super("PROGRAMING", options);
        l = new Library();
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1 -> ar.normalizeText("input.txt", "output.txt");
            case 2 -> System.exit(0);
        }
    }
}

