public class ValuesTest {


  public static void testSeven() {
    assert Values.SEVEN.getNumber() == 7;
  }
  public static void testEight() {
    assert Values.EIGHT.getNumber() == 8;
  }
  public static void testNine() {
    assert Values.NINE.getNumber() == 9;
  }
  public static void testTen() {
    assert Values.TEN.getNumber() == 10;
  }
  public static void testJack() {
    assert Values.JACK.getNumber() == 11;
  }
  public static void testQueen() {
    assert Values.QUEEN.getNumber() == 12;
  }
  public static void testKing() {
    assert Values.KING.getNumber() == 13;
  }
  public static void testAce() {
    assert Values.ACE.getNumber() == 14;
  }


  public static void main(String[] args) {
    testSeven();
    testEight();
    testNine();
    testTen();
    testJack();
    testQueen();
    testKing();
    testAce();

  }

}
