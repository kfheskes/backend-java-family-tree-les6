package nl.novi;

public class Main {

    public static void main(String[] args) {

        Person father = new Person("Theo", "Hoogendijk", 67, 'm');
        Person mother = new Person("Hennie", "Heskes", 66, 'f');
        Person me = new Person("Kay-Arne", "Fratheo", "Heskes", 31, 'm');


        me.addParents(father, mother, me);
    }


}
