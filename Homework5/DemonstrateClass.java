package Homework5;

public class DemonstrateClass {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        people[0] = new Person("Dimitar Marinov", 28, true);
        people[1] = new Person("Boncho Bonev", 55, true);

        people[2] = new Student("Arsen Zlatev", 17, true, 4.5);
        people[3] = new Student("Anastasia A.", 19, false, 6.0);

        people[4] = new Employee("Bistra Ivanova", 33, false, 300);
        people[5] = new Employee("Edvin Spiridonov", 31, true, 355.50);

        for (Person person: people) {
            if (person == null) {
                continue;
            }
            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println(student.showStudentInfo());
            } else if (person instanceof Employee) {
                Employee employee = (Employee) person;
                System.out.println(employee.showEmployeeInfo());
            } else if (person instanceof Person) {
                System.out.println(person.showPersonInfo());
            }
        }
        for (Person person : people) {
            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                double overtimePay = employee.calculateOvertime(2);
                System.out.println(employee.getName() + " will receive: " + overtimePay + " for 2 hours overtime.");
            }
        }

    }
}
