package az.edu.turing.module02.part01.laboratory1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie[] movies = new Movie[3];
        int movieCount = 3;

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ". Enter movie name: ");
            String name = input.nextLine();
            System.out.print((i + 1) + ". Enter movie rating: ");
            double rating = input.nextDouble();
            input.nextLine();
            movies[i] = new Movie(name, rating);
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Display all movies");
            System.out.println("2 - Add more movies");
            System.out.println("3 - Show statistics");
            System.out.println("4 - Search movie by name");
            System.out.println("5 - Update movie rating");
            System.out.println("6 - Delete a movie");
            System.out.println("7 - Sort movies by rating (ascending)");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Movies ---");
                    for (Movie movie : movies) {
                        System.out.println(movie);
                    }
                    break;

                case 2:
                    System.out.print("How many new movies do you want to add? ");
                    int newCount = input.nextInt();
                    input.nextLine();

                    Movie[] newMovies = new Movie[movieCount + newCount];
                    for (int i = 0; i < movieCount; i++) {
                        newMovies[i] = movies[i];
                    }

                    for (int i = movieCount; i < movieCount + newCount; i++) {
                        System.out.print("Enter movie name: ");
                        String name = input.nextLine();
                        System.out.print("Enter movie rating: ");
                        double rating = input.nextDouble();
                        input.nextLine();
                        newMovies[i] = new Movie(name, rating);
                    }

                    movies = newMovies;
                    movieCount += newCount;

                    System.out.println("✔️ New movies added successfully.");
                    break;

                case 3:
                    double total = 0;
                    double maxRating = movies[0].getRating();
                    double minRating = movies[0].getRating();
                    String highestRated = movies[0].getName();
                    String lowestRated = movies[0].getName();

                    for (Movie movie : movies) {
                        double rating = movie.getRating();
                        total += rating;

                        if (rating > maxRating) {
                            maxRating = rating;
                            highestRated = movie.getName();
                        }

                        if (rating < minRating) {
                            minRating = rating;
                            lowestRated = movie.getName();
                        }
                    }

                    double average = total / movieCount;

                    System.out.println("\n--- Statistics ---");
                    System.out.printf("Average Rating: %.2f%n", average);
                    System.out.println("Highest Rated Movie: " + highestRated + " (" + maxRating + ")");
                    System.out.println("Lowest Rated Movie: " + lowestRated + " (" + minRating + ")");
                    break;

                case 4:
                    System.out.print("Enter movie name to search: ");
                    String searchName = input.nextLine();
                    boolean found = false;

                    for (Movie movie : movies) {
                        if (movie.getName().equalsIgnoreCase(searchName)) {
                            System.out.println("Movie found: " + movie.getName());
                            System.out.println("Rating: " + movie.getRating());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("❌ Movie not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter the movie name to update rating: ");
                    String updateName = input.nextLine();
                    boolean updated = false;

                    for (Movie movie : movies) {
                        if (movie.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new rating for \"" + movie.getName() + "\": ");
                            double newRating = input.nextDouble();
                            input.nextLine();
                            movie.setRating(newRating);
                            System.out.println("✔️ Rating updated successfully.");
                            updated = true;
                            break;
                        }
                    }

                    if (!updated) {
                        System.out.println("❌ Movie not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter the movie name to delete: ");
                    String deleteName = input.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < movieCount; i++) {
                        if (movies[i].getName().equalsIgnoreCase(deleteName)) {
                            Movie[] reduced = new Movie[movieCount - 1];
                            int index = 0;
                            for (int j = 0; j < movieCount; j++) {
                                if (j != i) {
                                    reduced[index++] = movies[j];
                                }
                            }
                            movies = reduced;
                            movieCount--;
                            System.out.println("✔️ Movie deleted successfully.");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("❌ Movie not found.");
                    }
                    break;

                case 7:
                    for (int i = 0; i < movieCount - 1; i++) {
                        for (int j = 0; j < movieCount - i - 1; j++) {
                            if (movies[j].getRating() > movies[j + 1].getRating()) {
                                Movie temp = movies[j];
                                movies[j] = movies[j + 1];
                                movies[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("✔️ Movies sorted by rating (ascending):");
                    for (Movie movie : movies) {
                        System.out.println(movie);
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    return;

                default:
                    System.out.println("⚠️ Invalid choice. Try again.");
            }
        }
    }
}
