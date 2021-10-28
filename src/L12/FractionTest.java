package L12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class FractionTest {
    @Test
    @Order(1)
    public void simplifyTest() {
        Fraction val = new Fraction(45,10);
        Fraction actual = val.simplyfy();
        Fraction exp = new Fraction(9,2);
        Assertions.assertEquals(exp,actual);
    }

    @Test
    @Order(2)
    public void plusTest() {
        Fraction f = new Fraction(1,2);
        Fraction s = new Fraction(3,5);
        Fraction a = f.plus(s) ;
        Fraction e = new Fraction(11,10);
        Assertions.assertEquals(e,a);
    }

}
