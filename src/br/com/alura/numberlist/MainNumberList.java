package br.com.alura.numberlist;

import br.com.alura.numberlist.numberlistmaker.NumberListMaker;

import java.util.ArrayList;
import java.util.Collections;

public class MainNumberList {
    public static void main(String[] args) {
        NumberListMaker numberListMaker = new NumberListMaker();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randNumber = numberListMaker.getRandNumber();
            list.add(randNumber);
        }
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
