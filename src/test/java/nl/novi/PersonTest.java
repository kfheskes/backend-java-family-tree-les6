package nl.novi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
Person father;
Person me;
Person sharenda;
Person sabina;
Person river;
Person mother;
Pet petMother;
    @BeforeEach
    void setUp() {
         father = new Person("Theo","Hoogendijk",67, 'm');
         me = new Person("Kay-Arne","Fratheo","Heskes",31,'m');
        sharenda = new Person("Sharenda", "Hoogendijk", 38, 'f');
        sabina = new Person("Sabina", "Hoogendijk", 42,'f');
        river = new Person("River", "Ooijendijk", 8,'m');
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
        Integer getAge = me.getAge();

        assertEquals(31, getAge);
    }

    @Test
    void setAge() {
        me.setAge(5);
        Integer getAge = me.getAge();
        assertEquals(5, getAge);
    }

    @Test
    void getSex() {
        char getSex = me.getSex();

        assertEquals('m', getSex);
    }

    @Test
    void setSex() {
        me.setSex('f');
        char getSex = me.getSex();
        assertEquals('f', getSex);
    }

    @Test
    void getFather() {
        father.setFather(father);

        Person getPersonFather = father.getFather();
        //Assert
        assertEquals(father, getPersonFather);
    }

    @Test
    void setFather() {
        father.setFather(father);

        Person setPersonFather = father.getFather();

        assertEquals(father, setPersonFather);

    }

    @Test
    void getMother() {
        mother.setMother(mother);

        Person getPersonMother = mother.getMother();
        //Assert
        assertEquals(mother, getPersonMother);

    }

    @Test
    void setMother() {
        mother.setMother(mother);

        Person setPersonMother = mother.getMother();

        assertEquals(mother, setPersonMother);
    }

    @Test
    void getSiblings() {

        List<Person> sisters = new ArrayList<>();
        sisters.add(sharenda);
        sisters.add(sabina);
        me.setSiblings(sisters);

        List<Person> getSiblings = me.getSiblings();

        assertEquals(sisters, getSiblings);
    }

    @Test
    void setSiblings() {
        List<Person> sisters = new ArrayList<>();
        sisters.add(sharenda);
        sisters.add(sabina);
        me.setSiblings(sisters);

        List<Person> siblings = me.getSiblings();

        assertEquals(sisters, siblings);

    }

    @Test
    void getChildren() {
        List<Person> childrenFather = new ArrayList<>();
        childrenFather.add(me);
        childrenFather.add(sharenda);
        childrenFather.add(sabina);
        father.setChildren(childrenFather);

        List<Person> children = father.getChildren();

        assertEquals(childrenFather, children);

    }

    @Test
    void setChildren() {
        List<Person> childrenFather = new ArrayList<>();
        childrenFather.add(me);
        childrenFather.add(sharenda);
        childrenFather.add(sabina);
        father.setChildren(childrenFather);

        List<Person> children = father.getChildren();

        assertEquals(childrenFather, children);

    }

    @Test
    void getPets() {
        List<Pet> petMotherList = new ArrayList<>();
        petMotherList.add(petMother);
        mother.setPets(petMotherList);

        List<Pet> motherPet = mother.getPets();

        assertEquals(motherPet, petMotherList );
    }

    @Test
    void setPets() {
        List<Pet> petMotherList = new ArrayList<>();
        petMotherList.add(petMother);
        mother.setPets(petMotherList);

        List<Pet> motherPet = mother.getPets();

        assertEquals(motherPet, petMotherList );
    }

    @Test
    void getGrandChildren() {

        List<Person> getChildParent = new ArrayList<>();
        getChildParent.add(sabina);
        mother.setChildren(getChildParent);

        List<Person> getChildFromSister = new ArrayList<>();
        getChildFromSister.add(river);
        sabina.setChildren(getChildFromSister);

        List<Person> grandChildren = new ArrayList<>();
        grandChildren.add(river);
        mother.setGrandChildren( grandChildren);


        assertEquals(grandChildren, getChildFromSister);
    }

    @Test
    void setGrandChildren() {
        List<Person> getChildParent = new ArrayList<>();
        getChildParent.add(sabina);
        mother.setChildren(getChildParent);

        List<Person> getChildFromSister = new ArrayList<>();
        getChildFromSister.add(river);
        sabina.setChildren(getChildFromSister);

        List<Person> grandChildren = new ArrayList<>();
        grandChildren.add(river);
        mother.setGrandChildren( grandChildren);


        assertEquals(grandChildren, getChildFromSister);
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