import java.util.ArrayList;

public class Ex30 {
    public static void main(String[] args) {
        Person Kenn = new Person();
        Kenn.setHeight(6);
        Kenn.setWeight(200);

        Person Kevin = new Person();
        Kevin.setHeight(5);
        Kevin.setWeight(300);

        Person Erin = new Person();
        Erin.setHeight(7);
        Erin.setWeight(175);


        System.out.println(Kenn.bodyMassIndex());
        System.out.println(Kevin.bodyMassIndex());
        System.out.println(Erin.bodyMassIndex());

        ArrayList<Person> groupArray = new ArrayList<Person>();
        groupArray.add(Kenn);
        groupArray.add(Kevin);
        groupArray.add(Erin);

        groupArray.get(1).printPerson();
        System.out.print(groupArray.get(0).bodyMassIndex());
    }
}
