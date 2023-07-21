package seminar4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Sample01 {

    public static void main(String[] args) {

        public static void task1(){

            static Scanner scanner = new Scanner(System.in);

            Deque deque = new ArrayDeque();
            while (true) {
                System.out.println("Введите строку: ");
                String str = scanner.nextLine();
                if (str.isEmpty()) {
                    System.out.println("Завершение работы подпрограммы.");
                    break;
                }
                if (str.equals("print")) {
                    for (Object o : deque) {
                        System.out.println(o);
                    }
                } else if (str.equals("revert")) {
                    System.out.println("Удаление элемента: " + deque.pollFirst());

                } else {
                    deque.push(str);
                }

            }


