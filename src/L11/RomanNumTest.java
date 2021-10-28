package L11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RomanNumTest {
    @Test
    public void testOne() {
        List<RomanNum> number = Collections.singletonList(RomanNum.ONE);
        int actual = RomanNum.convertToArabic(number);
        Assertions.assertEquals(RomanNum.ONE.getValue(),actual);
    }
    @Test
    public void testFive(){
        List<RomanNum> number = Collections.singletonList(RomanNum.FIVE);
        int actual = RomanNum.convertToArabic(number);
        Assertions.assertEquals(RomanNum.FIVE.getValue(),actual);
    }

    @Test
    public void testTen(){
        List<RomanNum> number = Collections.singletonList(RomanNum.TEN);
        int actual = RomanNum.convertToArabic(number);
        Assertions.assertEquals(RomanNum.TEN.getValue(),actual);
    }

    @Test
    public void testIncNum() {
        List<RomanNum> number = new ArrayList<>();
        number.add(RomanNum.TEN);
        number.add(RomanNum.TEN);
        number.add(RomanNum.FIVE);
        number.add(RomanNum.ONE);
        number.add(RomanNum.ONE);

        int actual = RomanNum.convertToArabic(number);
        Assertions.assertEquals(27,actual);
    }

    @Test
    public void testDecNum() {
        List<RomanNum> number = new ArrayList<>();
        number.add(RomanNum.ONE);
        number.add(RomanNum.TEN);
        int actual = RomanNum.convertToArabic(number);
        Assertions.assertEquals(9,actual);
    }

}
