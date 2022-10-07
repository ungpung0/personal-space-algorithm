package structure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeQueueTest {

    @DisplayName("QueueTest")
    @Test
    public void testQueue() {
        PracticeQueue test = new PracticeQueue();
        int[] values = {1, 2, 3, 4, 5};
        test.queueAccess(values);
    }
}
