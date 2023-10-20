package nl.novi;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;

    private List<Person> grandChildren;

    public Person(String name, String lastName, int age, char sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, char sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person father, Person mother, Person child) {
        child.setFather(father);
        child.setMother(mother);
        father.addChild(father, child);
        mother.addChild(mother, child);
    }

    public void addChild(Person parent, Person child) {
        List<Person> children = new ArrayList<>();
        if (parent.getChildren() != null) {
            for (Person person : parent.getChildren()) {
                children.add(person);
            }
        }
        children.add(child);

        parent.setChildren(children);
    }

    public void addPet(Person person, Pet pet) {
        List<Pet> pets = new ArrayList<>();
        if (person.getPets() != null) {
            for (Pet owner : getPets()) {
                pets.add(owner);
            }
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person me, Person sibling) {
        List<Person> siblings = new ArrayList<>();
        if (me.getSiblings() != null) {
            for (Person person : me.getSiblings()) {
                siblings.add(person);
            }
        }
        siblings.add(sibling);

        me.setSiblings(siblings);
    }

    public List<Person> getGrandChildren() {
        return grandChildren;
    }

    public void setGrandChildren(List<Person> grandChildren) {
        this.grandChildren = grandChildren;
    }


     public List<Person> getGrandChildren(Person parent) {
        List<Person> grandChildren = new ArrayList<>();
        if (parent.getChildren() != null)
            for (Person children : parent.getChildren()) {
                if (children.getChildren() != null) {
                    for (Person child : children.getChildren()
                    ) {
                        grandChildren.add(child);
                    }
                }
            }
                return grandChildren;

    }
}
