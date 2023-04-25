package arraysAndStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckForTargetTest {

    @Test
    public void checkForTarget(){
        int[] input = {1, 3, 4, 5, 7, 9, 10};
        int target = 8;

        boolean result = CheckForTarget.checkForTarget(input, target);
        assertTrue(result);

        target = 12;
        result = CheckForTarget.checkForTarget(input, target);
        assertTrue(result);

        target = 2;
        result = CheckForTarget.checkForTarget(input, target);
        assertFalse(result);

        target = 15;
        result = CheckForTarget.checkForTarget(input, target);
        assertTrue(result);
    }

}