import javax.swing.*;
import java.util.Random;
import java.util.ArrayList;

public class ListeRestaurants {
    ArrayList<Restaurant> Resaurants = new ArrayList<Restaurant>();


    /**
     * Tire un nombre aleatoire entre min et mbdeproposition
     **/
    public static int leTirage(int max) {
        Random Rand = new Random();
        /** S'il y a qu'un restaurant on retourne 0 **/
        if (max == 1) {
            return 0;
        } else {
            /** Tirage entre 0 et max**/
            int aleatoire = Rand.nextInt(max);
            return aleatoire;
        }
    }


    /**
     * Demande le restaurant et le met dans la liste des Restaurants
     */
    public static ArrayList<Restaurant> demanderRestaurant() {
        ArrayList<Restaurant> restos = new ArrayList<Restaurant>();

        for (int i = 0; i < 10; i++) {
            //String nomResto = JOptionPane.showInputDialog("Entrez le restaurant numero " +(i+1));

            Restaurant resto = new Restaurant(JOptionPane.showInputDialog("Entrez le restaurant numero " +(i+1)));

            restos.add(resto);


        }
    return restos;
    }
}

