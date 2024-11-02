import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scan.nextInt();
        
        int a = 0, b = 1, next = a + b;
        
        if (num == 0 || num == 1) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
            return;
        }

        while (next < num) {
            a = b;
            b = next;
            next = a + b;
        }

        if (next == num) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
        
        scan.close();
    }
}
