package structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeStackTest {

    @DisplayName("StackTest")
    @Test
    public void testStack() {
        // given
        PracticeStack test = new PracticeStack();
        int[] array = {1, 2, 3, 4, 5};

        // when
        test.stackAccess(array);

        // then
    }
}
