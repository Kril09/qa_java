package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();
        assertEquals("Ожидается: Животные, Птицы, Рыба", expectedMeat, actualMeat);
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String expectedFam = "Кошачьи";
        String actualFam = feline.getFamily();
        assertEquals("Ожидается: Кошачьи", expectedFam, actualFam);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int expectedKit = 1;
        int actualKit = feline.getKittens();
        assertEquals("Ожидается: 1", expectedKit, actualKit);
    }
}