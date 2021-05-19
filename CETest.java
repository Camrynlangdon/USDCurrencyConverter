import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CETest {
  @Test
  public void getCurrency1() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("4.02"));
  }
  @Test
  public void getCurrency2() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("5.99999999999"));
  }
  @Test
  public void getCurrency3() {
    CEModel test = new CEModel();
    assertEquals(false,test.isValid("4.0a"));
  }
  @Test
  public void getCurrency4() {
    CEModel test = new CEModel();
    assertEquals(false,test.isValid("abc"));
  }
  @Test
  public void getCurrency5() {
    CEModel test = new CEModel();
    assertEquals(false,test.isValid(""));
  }
  @Test
  public void testCalculate1() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("1.00"));
    test.fetchCurrency();
    assertEquals("1.00",test.USD);
  }
  @Test
  public void testCalculate2() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("99.99000000000000000000000000000000"));
    test.fetchCurrency();
    assertEquals("99.99",test.USD);
  }
  @Test
  public void testCalculate3() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("500000.000000000000000000000000000000000"));
    test.fetchCurrency();
    assertEquals("500000.00",test.USD);
  }


  //!!!!! Beware this app only updates every 24-hours
  /* uncomment for test
  @Test
  public void isCorrectAmount() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("1"));

    Double current = 1.28; //needs current currency value - Beware this app only updates every 24-hours
    Double currency = Double.valueOf(test.AUD); // input currency

    test.fetchCurrency();

    assertEquals("1",String.valueOf(currency / current)); //should equal 1 of itself within a small margin of
                                                          //error to account for 24/hour updates
  }

  !!! uncomment for test */

}

