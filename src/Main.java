/**
 * @Authors : Elb@t
 * @Version : 0.1 Janvier 2017
 *
 **/

import java.util.Scanner;
import java.util.Random;

    public class Main {
        static Scanner clavier = new Scanner(System.in);
        static Random Rand = new Random();

        public static void main(String[] args) {
            System.out.println("Combien de choix de restaurant ?");
            int nbChoix = clavier.nextInt();
            String restaurant[] = new String[10];
            System.out.println("Quelles sont vos idees ?");
            for (int i = 0; i <= nbChoix; i++) {
                restaurant[i] = clavier.nextLine();
            }
            trieAlpha(restaurant);
            int result = leTirage(0, nbChoix);
            System.out.println("Vous allez manger au : " + restaurant[result]);
        }

        /** Tire un nombre aleatoire entre min et mbdeproposition **/
        public static int leTirage(int min, int max){
            /** Tirage entre 0 et max-1, on rajoute 1 pour avoir entre 1 et max. **/
            int aleatoire = Rand.nextInt(max-1)+1;
            return aleatoire;
        }

        /** Trie le tab par ordre Alpha **/
        public static void trieAlpha (String[] tab){


        }
    }