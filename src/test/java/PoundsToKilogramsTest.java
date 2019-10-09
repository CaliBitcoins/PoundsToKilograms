import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.fail;

public class PoundsToKilogramsTest {

    @Test
    public void conversionTest() {
        // Step 0 - Test IDE
        //fail("Not implemented");

        // Step 1 - Setup: test that conversion() works
        double pounds = 3.13d;
        double ratio = 0.45359237d;
        double kilos = pounds * ratio;
        PoundsToKilograms p2d = new PoundsToKilograms();

        // Setp 2 - Exercises

        // Step 3 - Assert
        // In floating point tests must assign a delta value (expected, actual, delta)
        // Throws Exception: java.lang.AssertionError: Use assertEquals(expected, actual, delta) to compare floating-point numbers
        Assert.assertEquals(p2d.conversion(ratio, pounds), kilos, 5);

        // Step 4 - Teardown

    }
}