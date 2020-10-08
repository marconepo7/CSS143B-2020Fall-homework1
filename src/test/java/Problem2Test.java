import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        int [][] inputs = {
                {3, 2, 7, 4, 8},
                {5, 4, 3, 2, 1},
                {23, 63, 26, 87, 57},
                {8, 4},
                {7, 7, 7, 4, 4,},

        };
        int [][] answer = {
                {2, 3, 4, 7, 8},
                {1, 2, 3, 4, 5},
                {23, 26, 57, 63, 87},
                {4, 8},
                {4, 4, 7, 7, 7,},

        };
        assertEquals(inputs.length, answer.length);

        for (int i = 0; i < inputs.length; i++) {
            int[] expected = answer[i];
            Problem2.bubbleSort(inputs[i]);
            assertArrayEquals(answer[i], inputs[i]);


            // add your tests here
        }
    }
}
