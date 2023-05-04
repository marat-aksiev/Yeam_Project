import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Project {

    public static class FlashcardApp {

        private ArrayList<String[]> flashcards;
        private Scanner scanner;

        public FlashcardApp() {
            flashcards = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void run() {
            loadFlashcards();
            while (true) {
                System.out.println("Press enter to see a flashcard, or type 'add' to add a new flashcard, or type 'quit' to exit");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("quit")) {
                    break;
                } else if (input.equalsIgnoreCase("add")) {
                    addFlashcard();
                } else {
                    showRandomFlashcard();
                }
            }
            saveFlashcards();
        }

        private void loadFlashcards() {
            // Load saved flashcards from a file or database
        }

        private void saveFlashcards() {
            // Save the current flashcards to a file or database
        }

        private void showRandomFlashcard() {
            Collections.shuffle(flashcards);
            String[] flashcard = flashcards.get(0);
            System.out.println(flashcard[0]); // Display the question
            scanner.nextLine(); // Wait for the user to press enter
            System.out.println(flashcard[1]); // Display the answer
        }

        private void addFlashcard() {
            System.out.println("Enter a question:");
            String question = scanner.nextLine();
            System.out.println("Enter the answer:");
            String answer = scanner.nextLine();
            flashcards.add(new String[] { question, answer });
        }


    }

    public static void main(String[] args) {
        FlashcardApp app = new FlashcardApp();
        app.run();
    }

}
