package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
Person father;
Person me;
Person sharenda;
Person mother;
Pet petMother;
    @BeforeEach
    void setUp() {
         father = new Person("Theo","Hoogendijk",67, 'm');
         me = new Person("Kay-Arne","Fratheo","Heskes",31,'m');
        sharenda = new Person("Sharenda", "Hoogendijk", 38, 'f');
        mother = new Person("Hennie", "Heskes", 66, 'f');
        petMother = new Pet("Pando",3,"Kruising poedel en shih tzu");
    }

    @Test
    void getName() {
        //Act
        String getName = father.getName();
        //Assert
        assertEquals("Theo", getName);
    }

    @Test
    void setName() {
        father.setName("Kikker");
        String getName = father.getName();
        assertEquals("Kikker", getName);
    }

    @Test
    void getLastName() {
        //Act
        String getName = father.getLastName();
        //Assert
        assertEquals("Hoogendijk", getName);
    }

    @Test
    void setLastName() {
        father.setLastName("SlootWater");;
        String getName = father.getLastName();
        assertEquals("SlootWater", getName);
    }

    @Test
    void getMiddleName() {
        String getName = me.getMiddleName();
        //Assert
        assertEquals("Fratheo", getName);
    }

    @Test
    void setMiddleName() {
        me.setMiddleName("Pad");;
        String getName = me.getMiddleName();
        assertEquals("Pad", getName);
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }

    @Test
    void getSex() {
    }

    @Test
    void setSex() {
    }

    @Test
    void getFather() {
    }

    @Test
    void setFather() {
    }

    @Test
    void getMother() {
    }

    @Test
    void setMother() {
    }

    @Test
    void getSiblings() {
    }

    @Test
    void setSiblings() {
    }

    @Test
    void getChildren() {
    }

    @Test
    void setChildren() {
    }

    @Test
    void getPets() {
    }

    @Test
    void setPets() {
    }

    @Test
    void getGrandChildren() {
    }

    @Test
    void setGrandChildren() {
    }

    @Test
    void addParents() {
        me.addParents(father,mother, me);

        assertEquals(father, me.getFather());
        assertEquals("Hennie", me.getMother().getName());
    }

    @Test
    void addChild() {
        father.addChild(father, me);
        father.addChild(father, sharenda);

        assertEquals("Kay-Arne", father.getChildren().get(0).getName());
        assertEquals(2, father.getChildren().size());
    }

    @Test
    void addPet() {
        mother.addPet(mother, petMother);

        assertEquals(petMother, mother.getPets().get(0));

    }

    @Test
    void addSibling() {
        me.addSibling(me,sharenda);

        assertEquals(sharenda, me.getSiblings().get(0));
    }
}