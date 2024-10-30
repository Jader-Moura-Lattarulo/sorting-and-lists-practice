package br.com.alura.changeimplementations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ImplementationList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        addElements(list);
        System.out.println("Elementos ArrayList:");
        printList(list);

        list = new LinkedList<>();
        addElements(list);
        System.out.println("Elementos LinkedList:");
        printList(list);

    }

    private static void addElements(List<String> list) {
        list.add("Elemento01");
        list.add("Elemento02");
        list.add("Elemento03");
        list.add("Elemento04");
        list.add("Elemento05");
    }

    private static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

}

