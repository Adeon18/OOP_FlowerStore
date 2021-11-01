package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {
    // A flag receiver from which we are gonna be decrementing when there is a whole test suilte being run.
    Receiver flag;
    Receiver r1;
    Receiver r2;
    Receiver r3;

    @BeforeEach
    void setUp() {
        flag = new Receiver();
        r1 = new Receiver();
        r2 = new Receiver();
        r3 = new Receiver();
    }

    @Test
    void testId() {
        assertEquals(1, r1.getId() - flag.getId());
        assertEquals(2, r2.getId() - flag.getId());
        assertEquals(3, r3.getId() - flag.getId());

    }
}