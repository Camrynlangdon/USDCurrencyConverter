import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/*
 * Test the Calculator class
 */
public class CETest {
  @Test
  public void testIsValid1() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("4.02"));
  }
  @Test
  public void testIsValid2() {
    CEModel test = new CEModel();
    assertEquals(true,test.isValid("5.99999999999"));
  }
  @Test
  public void testIsValid3() {
    CEModel test = new CEModel();
    assertEquals(false,test.isValid("4.0a"));
  }
  @Test
  public void testIsValid4() {
    CEModel test = new CEModel();
    assertEquals(false,test.isValid("abc"));
  }
  @Test
  public void testIsValid5() {
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


}

