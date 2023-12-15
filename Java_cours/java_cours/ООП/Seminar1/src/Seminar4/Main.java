package Seminar4;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.insertAtStart(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("Размер списка: " + list.getSize());
        System.out.println("Элемент с индексом 0: " + list.getElement(0));
        System.out.println("Элемент с индексом 1: " + list.getElement(1));
        System.out.println("Элемент с индексом 2: " + list.getElement(2));
    }
}



