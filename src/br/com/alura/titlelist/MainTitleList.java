package br.com.alura.titlelist;

import br.com.alura.titlelist.titlelistmaker.Title;

import java.util.ArrayList;
import java.util.Collections;

public class MainTitleList {
    public static void main(String[] args) {
        Title title01 = new Title("Lord of The Rings");
        Title title02 = new Title("Titanic");
        Title title03 = new Title("Batman");
        Title title04 = new Title("Star Wars");
        Title title05 = new Title("Transformers");

        ArrayList<Title> list = new ArrayList<>();

        list.add(title01);
        list.add(title02);
        list.add(title03);
        list.add(title04);
        list.add(title05);

        Collections.sort(list);


        System.out.println("Títulos ordenados:");
        for (Title title : list) {
            System.out.println(title);
        }

    }
}
