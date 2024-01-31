import java.util.*;
import java.io.*;

class Person {
    String name;
    int age;
    String sex;
    String job;
    String city;

    Person(String name, int age, String sex, String job, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
        this.city = city;
    }

    public String toString() {
        return "Name: " + this.name + "\n" +
                "Age: " + this.age + "\n" +
                "Sex: " + this.sex + "\n" +
                "Job: " + this.job + "\n" +
                "City: " + this.city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name:");
        String name = scanner.nextLine();

        System.out.print("Your sex:");
        String sex = scanner.nextLine();

        System.out.print("Your job:");
        String job = scanner.nextLine();

        System.out.print("Your city:");
        String city = scanner.nextLine();

        System.out.print("Your age:");
        int age = scanner.nextInt();

        Person person = new Person(name, age, sex, job, city);

        try {
            File personFile = new File(name + ".txt");
            if (personFile.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            FileWriter personWriter = new FileWriter(name + ".txt");
            personWriter.write(person.toString());
            personWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}