package card;

/**
 * ICE 1 Card Trick
 * Modified by: Mohammad Ashraf
 * Student Number: 991813398
 * Date Modified: Jan 20, 2026
 *
 * This class creates a hand of seven random cards and
 * searches the hand for a hard-coded lucky card.
 */
public class CardTrick {

    public static void main(String[] args) {

        // Create a hand of 7 cards
        Card[] magicHand = new Card[7];

        // Fill the hand with random cards
        for (int i = 0; i < magicHand.length; i++) {

            Card c = new Card();

            // Random value between 1 and 13
            int value = (int) (Math.random() * 13) + 1;
            c.setValue(value);

            // Random suit from Card.SUITS (index 0–3)
            int suitIndex = (int) (Math.random() * 4);
            c.setSuit(Card.SUITS[suitIndex]);

            magicHand[i] = c;
        }

        // Display the magic hand
        System.out.println("Magic Hand Cards:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        // Hard-coded lucky card (Task 6 requirement)
        Card luckyCard = new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit("Clubs");

        // Search for the lucky card
        boolean found = false;

        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue()
                    && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report result
        System.out.println("\nLucky Card: Clubs 2");

        if (found) {
            System.out.println("Congratulations! You found the lucky card!");
        } else {
            System.out.println("❌ Sorry! The lucky card is not in the hand.");
        }
    }
}
