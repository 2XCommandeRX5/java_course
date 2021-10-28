package L10.exp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArOpsTest {
    private ArOps test = new ArOps();

    @Test
    public void testDivByZer(){
        Assertions.assertThrows(ArithmeticException.class,
                new Executable() {
            @Override
            public void execute() throws Throwable {
                test.div(1,0);
            }
        });
    }
@Test
    public void testExDiv(){
    Assertions.assertEquals(3, test.div(6,2));
}

}
