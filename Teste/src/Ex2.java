import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String text = scanner.nextLine();
        
        int count = 0;
        
        for (char c : text.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vez(es) na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
        
        scanner.close();
    }
}
