package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

Pet petMother;
Pet petFather;

Person father;
Person sabina;

    @BeforeEach
    void setUp() {
        petMother = new Pet("Pando", 3, "Kruising poedel en shih tzu");
        petFather = new Pet("Kenzo", 2, "vuilnisbak");
        father = new Person("Theo", "Hoogendijk", 67, 'm');
        sabina = new Person("Sabina", "Hoogendijk", 42,'f');
    }

    @Test
    void setSpecies() {
        petMother.setSpecies("Labrador");
        String getSpecies = petMother.getSpecies();
        assertEquals("Labrador", getSpecies);
    }
    @Test
    void getSpecies() {
        String getSpeciesTest = petMother.getSpecies();

        assertEquals("Kruising poedel en shih tzu", getSpeciesTest);
    }

    @Test
    void getOwner() {
        Person owner = petMother.getOwner();

        assertEquals(null, owner );

    }

    @Test
    void setOwner() {
        petFather.setOwner(sabina);

        Person owner = petFather.getOwner();

        assertEquals(sabina, owner);
    }

    @Test
    void getName() {
        //Act
        String getName = petFather.getName();
        //Assert
        assertEquals("Kenzo", getName);
    }

    @Test
    void setName() {
        petMother.setName("kay");

        String namePet = petMother.getName();

        assertEquals("kay", namePet);
    }

    @Test
    void getAge() {
        int getAge = petFather.getAge();

        assertEquals(2, getAge);

    }

    @Test
    void setAge() {
        petMother.setAge(4);

        int petAge = petMother.getAge();

        assertEquals(4, petAge);
    }


}