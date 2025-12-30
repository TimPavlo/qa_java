package ru.yandex.praktikum;

import org.junit.Test;
import ru.yandex.praktikum.animals.Feline;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void testGetKittensDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testEatMeatReturnsList() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertNotNull(food);
    }

    @Test
    public void testEatMeatContainsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные"));
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}