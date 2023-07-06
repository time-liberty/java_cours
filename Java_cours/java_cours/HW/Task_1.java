// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)



package HW;
import java.util.Scanner;


public class Task_1 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        long sumN = 0;
        long sumSqrt = 0;
        for (int i = 1; i<= n;i++){
          sumSqrt = sumSqrt + i * i;
        }


          for (int i = 1; i <= n; i++) {
            sumN = sumN + i;
          }
          System.out.println("Сумма первых n натуральных чисел: " + sumN);
          System.out.println("Сумма квадратов первых n натуральных чисел: " + sumSqrt);
        }
      
    
}
