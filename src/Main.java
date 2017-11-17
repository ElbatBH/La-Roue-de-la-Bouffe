/**
 * @Authors : Elb@t
 * @Version : 0.1 Janvier 2017
 *
 **/

import javax.swing.*;


    public class Main {

        public static void main(String[] args) {

            //Message Bienvenue.
            JOptionPane.showMessageDialog(null,"Bienvenue dans la roue de la Bouffe !");

            ListeRestaurants.demanderRestaurant();

            JOptionPane.showMessageDialog(null,"Vous allez manger au : ");

        }




    }