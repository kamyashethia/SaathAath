public enum Values{
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  TEN(10),
  JACK(11),
  QUEEN(12),
  KING(13),
  ACE(14);

  private int number;

  Values(int number) {
      this.number = number;
  }

  public int getNumber() {
    return this.number;
  }


}
