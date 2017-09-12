package com.xyzcorp;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class JUnit5FixturesTest {
    @BeforeAll
    static void initAll() {
        System.out.println("Starting file");
    }

    @BeforeEach
    void init() {
        System.out.println("Running before each test");
    }

    @Test
    void succeedingTest() {
        assertEquals(10, 5 + 5);
    }

    @Test
    @Disabled("for demonstration purposes")
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
        System.out.println("Running after each test");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Ending file");
    }
}
