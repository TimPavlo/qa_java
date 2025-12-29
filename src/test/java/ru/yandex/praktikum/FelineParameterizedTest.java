package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.animals.Feline;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittensCount;
    private final int expectedCount;

    public FelineParameterizedTest(int kittensCount, int expectedCount) {
        this.kittensCount = kittensCount;
        this.expectedCount = expectedCount;
    }

    @Parameterized.Parameters
    public static Object[][] getData(){
        return new Object[][] {
                {1, 1},
                {5, 5},
                {0, 0}
        };
    }

    @Test
    public void testGetKittensWithCount() {
        Feline feline = new Feline();
        assertEquals(expectedCount, feline.getKittens(kittensCount));
    }
}