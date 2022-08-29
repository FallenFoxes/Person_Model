package persongenerator;

import java.io.*;

import java.util.*;

public class PersonGenerator {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Person p1 = new Person();

        String id, fname, lname, title;

        int yob;

        // taking user input

        System.out.println("Enter ID:");

        id = br.readLine();

        System.out.println("Enter first name:");

        fname = br.readLine();

        System.out.println("Enter last name:");

        lname = br.readLine();

        System.out.println("Enter title like Mr. Mrs. Prof. Ms. etc:");

        title = br.readLine();

        System.out.println("Enter year of birth:");

        yob = Integer.parseInt(br.readLine());

        // initializing the object with userdefiend values

        Person p1 = new Person(id, fname, lname, title, yob);

        // arraylist of type Person to store all the objects

        ArrayList<Person> l = new ArrayList<Person>();

        l.add(p1);

        // writing data to csv file and also be a text file with no issue

        FileWriter writer = new FileWriter("MyFile.csv", true);

        for (Person p : l) {

            writer.write(p.toCSVDataRecord());

        }

        writer.close();

    }

}