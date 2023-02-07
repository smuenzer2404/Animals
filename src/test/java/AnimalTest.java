import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
   private Animal dog;
   private Animal cat;

    @BeforeEach
    void setUp(){
        dog = new Animal("Bella",-5, "dog", "Wuff");
        cat = new Animal("Minky", 1,"cat", "Miau");
    }

    @Test
    void giveAnimalLoud() {
        String expected = "Miau";
        String actual = cat.getAnimalLoud();
        Assertions.assertEquals(expected, actual);

        String expected2 = "Wuff";
        String actual2 = dog.getAnimalLoud();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void getNameAndAge() {
        String expected =  "Name: " + "Bella" + ", Alter: " + -5;
        String actual = dog.getNameAndAge();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ageCategory() {
        String expexted = "no category";
        String actual = dog.ageCategory();
        Assertions.assertEquals(expexted,actual);

    }
}