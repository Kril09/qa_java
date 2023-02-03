package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMocTest {
    @Mock
    Feline feline;
    @Test
    public void testLionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualCountKit = lion.getKittens();;
        assertEquals ("Ожидаемое значение: 1", 1,actualCountKit);
    }

    @Test
    public void testLionGetFood() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = lion.getFood();
        assertEquals("Ожидается: Животные, Птицы, Рыба", expectedFood,actualFood);
    }

    @Test
    public void testLionExceptionSex() {
        Exception exception = null;
        try {
            Lion lion = new Lion(null,feline);
        } catch (Exception e) {
            exception = e;
        }
        boolean expectedTrue = true;
        assertEquals(expectedTrue,exception != null);
        String expectedMessage = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedMessage, exception.getMessage());
    }
}
