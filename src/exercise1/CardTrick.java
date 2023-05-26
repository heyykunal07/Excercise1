package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Kunal Gothwal May 26,2023 
 */
import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {

    Card[] hand = new Card[7];

    for (int i = 0; i < hand.length; i++) {
        Card card = new Card();
        card.setValue(generateRandomNumber(1, 13));
        card.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
        hand[i] = card;
    }

    // Ask the user for card value and suit
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the card value (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
    int value = scanner.nextInt();
    System.out.print("Enter the card suit (1 for Hearts, 2 for Diamonds, 3 for Spades, 4 for Clubs): ");
    int suitIndex = scanner.nextInt() - 1;
    String suit = Card.SUITS[suitIndex];

    // Search for a match in the hand
    boolean matchFound = false;
    for (Card card : hand) {
        if (card.getValue() == value && card.getSuit().equals(suit)) {
            matchFound = true;
            break;
        }
    }

    if (matchFound) {
        printInfo();
    } else {
        System.out.println("Sorry, no match found.");
    }

    scanner.close();
}

/**
 * Helper method to generate a random number between min and max (inclusive).
 *
 * @param min The minimum value.
 * @param max The maximum value.
 * @return The random number generated.
 */
private static int generateRandomNumber(int min, int max) {
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
}

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}