package com.xyzcorp;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@Tag("fast")
public class JUnit5TaggedTest {

    //Rules for tags
    // A tag must not be null or blank.
    // A trimmed tag must not contain whitespace.
    // A trimmed tag must not contain ISO control characters.
    // A trimmed tag must not contain any of the following reserved characters.

    @Test
    @Tag(value = "unit")
    void testOne() {
        assertThat(1).isEqualTo(1);
    }

    @Test
    @Tag(value = "integration")
    void testTwo() {
        assertThat(2).isEqualTo(2);
    }

    @Test
    @Tag(value = "system")
    void testThree() {
        assertThat(3).isEqualTo(3);
    }
}
