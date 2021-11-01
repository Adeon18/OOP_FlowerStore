package users;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    // The same flag sender
    Sender flag;
    Sender s1;
    Sender s2;
    Sender s3;


    @BeforeEach
    void setUp() {
        flag = new Sender();
        s1 = new Sender();
        s2 = new Sender();
        s3 = new Sender();
    }

    @Test
    void testId() {
        // Check for working ID
        assertEquals(1, s1.getId() - flag.getId());
        assertEquals(2, s2.getId() - flag.getId());
        assertEquals(3, s3.getId() - flag.getId());

    }
}