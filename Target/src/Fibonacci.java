/**
 * @author Jhonata Lopes dos Santos 
 * 
 */

 import java.util.Scanner;

 public class Fibonacci {
 
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("*---- CALCULA FIBONACCI ----*");
         System.out.println("Digite um número: ");
         int num = input.nextInt();
         boolean isTrue = calculaFibonacci(num);
 
         if (isTrue) {
             System.out.println("O número " + num + " digitado pelo usuário está presente na sequência.");
         } else {
             System.out.println("O número " + num + " digitado pelo usuário não está presente na sequência.");
         }
     }
 
     public static boolean calculaFibonacci(int input) {
         int fibonacci = 1;
         int guardaValor = 0;
         int aux;
 
         if (input == 0 || input == 1) {
             return true;
         } else {
             while (fibonacci < input) {
                 aux = fibonacci;
                 fibonacci = fibonacci + guardaValor;
                 guardaValor = aux;
 
                 if (input == fibonacci) {
                     return true;
                 }
             }
         }
         return false;
     }
 }