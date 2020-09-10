package Lab_7;

import Lab_4.Planet;

import java.util.LinkedList;

public class LinkedListTest {
    public void testList() {
        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for(String state : states){
            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Planet> people = new LinkedList<Planet>();
        people.add(new Planet("Planet1"));
        people.addFirst(new Planet("Planet2"));
        people.addLast(new Planet("Planet3"));
        people.remove(1); // удаление второго элемента

        for(Planet p : people){

            System.out.println(p.getName());
        }
        Planet first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
