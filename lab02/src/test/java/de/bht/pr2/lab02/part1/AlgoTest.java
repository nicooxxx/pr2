package de.bht.pr2.lab02.part1;
import de.bht.pr2.lab02.part2.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgoTest {
    private int[] array;
    // Erwartetes Ergebnis als String
    private int[] expected = {0, 8, 9, 21, 23, 77, 78, 143};

    @BeforeEach
    void setUp() {
        // Initialisierung des Arrays
        array = new int[]{21, 143, 0, 8, 77, 9, 78, 23};

    }

    @Test
    void testTest(){
        assertEquals(8, array.length);
    }

    @Test
    void testBubblesort(){
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    @Test
    void testInsertionSort(){
        assertEquals("[21, 143, 0, 8, 77, 9, 78, 23]", Arrays.toString(array));
        assertArrayEquals(expected, InsertionSort.sort(array));
        InsertionSort.sort(array);
        assertEquals(21, array[3]);
    }

}
