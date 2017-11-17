/**
 * @Authors : Elb@t
 * @Version : 0.1 Janvier 2017
 *
 **/

import javax.swing.*;


    public class Main {

        public static void main(String[] args) {

            JOptionPane.showMessageDialog(null,"Bienvenue dans la roue de la Bouffe !");

            int nbChoix = Integer.parseInt(JOptionPane.showInputDialog("Combien de choix de restaurant ?"));

            String restaurant[] = new String[10];

            for (int i = 0; i < nbChoix; i++) {
                restaurant[i] = JOptionPane.showInputDialog("Entrez le restaurant numero " +(i+1));
            }
            JOptionPane.showMessageDialog(null,"Vous allez manger au : " +restaurant[ListeRestaurants.leTirage(nbChoix)]);
        }




    }