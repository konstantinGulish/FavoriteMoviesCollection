import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Declare a sentinel value and movie variable
        String sentinel = "q";
        String movie = "";

    // Create a scanner for reading in user input
        Scanner in = new Scanner(System.in);

    // Declare an array list for movies
        ArrayList<String> movies = new ArrayList<>();

    // Continue to prompt user for input until they enter sentinel
        while (!movie.equalsIgnoreCase(sentinel)){
            System.out.println("Enter your favorite movie (enter q to Quit)");
            movie = in.nextLine();
            if (!movie.equalsIgnoreCase(sentinel)) movies.add (movie);
        }
        Collections.sort (movies);
        for (String m: movies){
            System.out.println(m);
        }
    }
}
