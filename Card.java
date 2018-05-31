public class Card {

  private Suites Suite;

  private Values Value;

  public Card(Suites suite, Values value) {
    this.Suite = suite;
    this.Value= value;
  }

  public String toString() {
    return this.Value +  " of " + this.Suite;
  }

}
