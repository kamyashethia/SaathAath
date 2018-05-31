import java.util.ArrayList;
import java.util.Random;

public class Deck {

  private Card[] cards;

  public Deck() {

    cards = initializeDeck();

  }

  public Card[] getCards() {
    return this.cards;
  }

  public String toString() {
    StringBuilder deck = new StringBuilder();
    for( Card card: cards) {
      deck.append(card.toString() + ", ");
    }

    deck.setLength(deck.length()-2);
    return deck.toString();
  }

  public Card[] initializeDeck() {
    ArrayList<Card> appendableCards = new ArrayList<Card>();

    for (Values value: Values.values()) {

      appendableCards.add(new Card(Suites.SPADES, value));
      appendableCards.add(new Card(Suites.HEART, value));

      if (value.getNumber() != 7) {
        appendableCards.add(new Card(Suites.DIAMONDS, value));
        appendableCards.add(new Card(Suites.CLUBS, value));
      }
    }
    return appendableCards.toArray(new Card[appendableCards.size()]);
  }


  /**
  * Implements Fisher-Yates algorithm
  */
  public void shuffle() {
      for (int i = cards.length - 1; i>0; i--) {
        int swapIndex = (new Random()).nextInt(i);
        Card swapCard = cards[swapIndex];
        cards[swapIndex] = cards[i];
        cards[i] = swapCard;
      }
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);

    deck.shuffle();

    System.out.println(deck);

  }
}
