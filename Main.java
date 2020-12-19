package ru.mirea.gib04.lab7;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> vaze = new ArrayList<String>();
        vaze.add("яблоко");
        vaze.add("груша");
        for(String t : vaze) System.out.println(t);


        LinkedList<String> states = new LinkedList<String>();
        states.add("Германия");
        states.add("Россия");
        states.add("Польша");
        states.addFirst("Великобритания");
        states.addLast("Вьетнам");
        states.add(1,"Китай");

        /* Процедурный подход */
        for( int i=0; i<states.size();i++)
            System.out.println(states.get(i));

        states.remove(1);

        System.out.println("/////////////\n");

        /* Объектно-ориентированный подход */
        for(String p : states){
            System.out.println(p);

        }

        if(states.contains("Вьетнам")) System.out.println("Есть такое государство");
        states.remove(2);
        states.remove("Польша");

        for(String p : states) {
            System.out.println(p);
        }

        LinkedList<Person> friends = new LinkedList<Person>();
        friends.add(new Person("Stepan"));
        friends.add(1, new Person ("Mike"));
        friends.addFirst(new Person("Tom"));
        friends.addLast(new Person("Nick"));

        for(Person p : friends) System.out.println(p);
        friends.remove(1);
        for(Person p : friends) System.out.println(p);
        Person tmp = friends.getFirst();
        System.out.println(tmp);


    }


}
