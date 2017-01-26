/**
 * @Authors : Elb@t
 * @Version : 0.1 Janvier 2017
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Progr {
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

        result = leTirage(nbChoix);

        System.out.println("Vous allez manger au : " + restaurant[result]);
    }
/** Tire un nombre aleatoire entre 0 et mbdeproposition **/
    public static int leTirage(int nbdeproposition){
        double max = nbdeproposition;
        double min = 0;
        /** Pour avoir le max car 1 est exclu avec Math.random **/
        double result = Math.random()*(max-min+1)+min;
        return (int)result;
    }
}