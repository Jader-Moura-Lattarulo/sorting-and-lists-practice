package br.com.alura.numberlist.numberlistmaker;

import java.util.Random;

public class NumberListMaker {
    public int getRandNumber() {
        Random random = new Random();
        return random.nextInt(101);
    }
}
