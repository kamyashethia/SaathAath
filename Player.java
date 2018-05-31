public class Player {

  Card[] cards;

  private int roundsWon;

  private String name;

  public Player(Card[] cards, String name) {
    this.cards = card;
    this.roundsWon = 0;
    this.name = name;
  }

  public function getRoundsWon() {
    return this.roundsWon;
  }

  public function incrementRoundsWon() {
    this.roundsWon++;
  }



}
