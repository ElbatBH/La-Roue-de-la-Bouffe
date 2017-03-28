/**
 * @Authors : Elb@t
 * @Version : 0.1 Janvier 2017
 *
 **/

import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

    public class Main {
        static Scanner clavier = new Scanner(System.in);
        static Random Rand = new Random();

        public static void main(String[] args) {

            JOptionPane.showMessageDialog(null,"Bienvenue dans la roue de la Bouffe !");

            int nbChoix = Integer.parseInt(JOptionPane.showInputDialog("Combien de choix de restaurant ?"));

            String restaurant[] = new String[10];

            for (int i = 0; i < nbChoix; i++) {
                restaurant[i] = JOptionPane.showInputDialog("Entrez le restaurant numero " +(i+1));
            }
            JOptionPane.showMessageDialog(null,"Vous allez manger au : " +restaurant[leTirage(nbChoix)]);
        }

        /** Tire un nombre aleatoire entre min et mbdeproposition **/
        public static int leTirage(int max){
            /** S'il y a qu'un restaurant on retourne 0 **/
            if (max==1){return 0;}
            else {
                /** Tirage entre 0 et max**/
                int aleatoire = Rand.nextInt(max);
                return aleatoire;
            }
        }


    }