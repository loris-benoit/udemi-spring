package org.mycompany.dvdstore;

import org.mycompany.dvdstore.entity.Movie;
import org.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Quel est le titre du film ?");
        String title = scanner.nextLine();
        System.out.println( "Quel est le genre du film ?");
        String genre = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        MovieService service = new MovieService();
        service.registerMovie(movie);
    }
}
