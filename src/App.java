import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Scanner s = new Scanner(System.in);
        System.out.println("Digite o tamanho da piramide:");
        final int length = s.nextInt();
        for(int i = 0; i<=length; i++){
            String ans = "";
            for(int j = 0; j<i; j++){
                ans += i;
            }
            System.out.println(ans);
        }
    }
}
