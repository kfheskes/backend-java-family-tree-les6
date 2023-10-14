package nl.novi;

public class Main {

    public static void main(String[] args) {

        Person father = new Person("Theo", "Hoogendijk", 67, 'm');
        Person mother = new Person("Hennie", "Heskes", 66, 'f');
        Person me = new Person("Kay-Arne", "Fratheo", "Heskes", 31, 'm');
        Person sharenda = new Person("Sharenda", "Hoogendijk", 38, 'f');
        Person sabina = new Person("Sabina", "Hoogendijk", 42,'f');
        Pet petMother = new Pet("Pando",3,"Kruising poedel en shih tzu");
        Pet petFather = new Pet("Kenzo", 2, "vuilnisbak");


        sabina.addParents(father,mother,sabina);
        sharenda.addParents(father,mother,sharenda);
        me.addParents(father, mother, me);
        me.addSibling(me,sharenda);
        me.addSibling(me,sabina);
        father.addChild(father,me);
        father.addChild(father,sharenda);
        father.addChild(father,sabina);
        mother.addChild(mother, me);
        mother.addChild(mother, sabina);
        mother.addChild(mother, sharenda);
    }


}
