import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner clavier = new Scanner(System.in);
    static Random Rand = new Random();

    public static void main(String[] args) {
        System.out.println("Combien de choix avez vous en tete ?");
        int nbChoix = clavier.nextInt();

        String restaurant[] = new String[10];
        int result =0;

        System.out.println("Ou voulez vous manger ?");
        for (int i = 0; i <= nbChoix; i++) {
            restaurant[i] = clavier.nextLine();
        }

        result = Rand.nextInt(nbChoix);

        System.out.println("Vous allez manger au : " + restaurant[result]);
    }
}