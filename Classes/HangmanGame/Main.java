import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int wordOption;
		File wordSelected = new File("");

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("	   ===================\n	   ||  Hangman Game ||\n	   ===================");
			System.out.println("	   Select one category");
			System.out.println("	   0: Easy Words ");
			System.out.println("	   1: Difficult Words ");
			System.out.println("	   2: Very Difficult Words");
			System.out.print("\nType your option here: ");
			wordOption = scan.nextInt();

			switch (wordOption) {
				case 0:
					wordSelected = new File("/Users/rebeccamonroy/Desktop/HangmanGame/WordBank/easyWords.txt");
					System.out.println("You have selected easy words");
					break;
				case 1:
					wordSelected = new File("/Users/rebeccamonroy/Desktop/HangmanGame/WordBank/difficultWords.txt");
					System.out.println("You have selected difficult words");
					break;
				case 2:
					wordSelected = new File("/Users/rebeccamonroy/Desktop/HangmanGame/WordBank/verydifficultWords.txt");
					System.out.println("You have selected very difficult words");
					break;
				default:
					System.out.println("Invalid Option");
			}

			try (Scanner scanner = new Scanner(wordSelected)) {
				Scanner sc = new Scanner(System.in);

				List<String> words = new ArrayList<>();

				while (scanner.hasNext()) {
					words.add(scanner.nextLine());
				}

				Random rand = new Random();

				String word = words.get(rand.nextInt(words.size()));

				List<Character> playerGuesses = new ArrayList<>();

				printWord(word, playerGuesses);

				int counterWrongAttempts = 0;

				while (true) {

					printHangman(counterWrongAttempts);

					if (counterWrongAttempts >= 6) {
						System.out.println("     YOU LOSE :(");
						System.out.println("\n***********Secret word was: " + word.toUpperCase() + "***********\n");
						break;
					}

					printWord(word, playerGuesses);

					if (!getPlayerGuess(sc, word, playerGuesses)) {
						counterWrongAttempts++;
					}

					if (printWord(word, playerGuesses)) {
						System.out.println("    	 YOU WIN!!");
						break;
					}
				}

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}

		} catch (Exception ex) {
			System.out.println("You need to type a number from 0 to 2");
		}
	}

	public static boolean getPlayerGuess(Scanner scanner, String word, List<Character> playerGuesses) {
		System.out.print("Enter your letter: ");
		String letterGuess = scanner.nextLine();
		playerGuesses.add(letterGuess.charAt(0));
		return word.contains(letterGuess);
	}

	public static boolean printWord(String word, List<Character> playerGuesses) {
		int counterCorrectLetter = 0;
		for (int i = 0; i < word.length(); i++) {
			if (playerGuesses.contains(word.charAt(i))) {
				System.out.print(word.charAt(i));
				counterCorrectLetter++;
			}
		}
		System.out.println();

		return (word.length() == counterCorrectLetter);
	}

	public static void printHangman(int wrongAttempts) {
		System.out.println("   --------------\n  | Hangman Game |\n   ---------------");
		System.out.println("    	 |   	    ");

		if (wrongAttempts >= 1) {
			System.out.println("  	 O");
		}
		if (wrongAttempts >= 2) {
			System.out.print(" 	\\ ");
			if (wrongAttempts >= 3) {
				System.out.println("/");
			} else {
				System.out.println("");
			}
		}

		if (wrongAttempts >= 4) {
			System.out.println("  	 |");
		}

		if (wrongAttempts >= 5) {
			System.out.print(" 	/ ");
			if (wrongAttempts >= 6) {
				System.out.println("\\");
			}
			System.out.println("   	    ");

		}
	}
}
