package Homework5;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMan() {
        return isMan;
    }
    public void setMan(boolean isMan) {
        this.isMan = isMan;
    }

    public String showPersonInfo() {

        return "name: " + name + ", age: " + age + ", isMan: " + isMan;
    }
}

class Student extends Person {
    private double score;
    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if (score >= 2.0 && score <= 6.0) {
            this.score = score;
        } else {
            System.out.println("The score should be between 2 and 6.");
        }
    }

    public String showStudentInfo() {
        return "name: " + getName() + ",age: " + getAge() + ", isMan: " + isMan() + ",score: " + getScore();
    }

}

class Employee extends Person {
     private double daySalary;

     public Employee(String name, int age, boolean isMan, double daySalary) {
         super(name, age, isMan);
         this.daySalary = daySalary;
     }
     public double getDaySalary() {

         return daySalary;
     }
     public  void setDaySalary(double daySalary) {
         this.daySalary = daySalary;
     }

     public double calculateOvertime(double hours) {
         if (getAge() < 18) {
             return 0;
         } else {
             double hourlyRate = daySalary / 8;
             return hours * hourlyRate * 1.5;
             }
         }

         public String showEmployeeInfo() {
         return super.showPersonInfo() + ", daySalary: " + daySalary;
     }
}
