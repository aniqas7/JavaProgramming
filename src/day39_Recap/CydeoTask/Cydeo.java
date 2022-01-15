package day39_Recap.CydeoTask;

public class Cydeo {

    public static void main(String[] args) {
        Developer developer= new Developer("Aniqa",24,'F',1,"Java Developer",14000);
        Tester tester=new Tester("lia",27,'F',2,"SDET",80823);
        Teacher teacher= new Teacher("mia",43,'F',3,"Teacher",11000);
        Student student= new Student("hiya",19,'F',4,"science");
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("------");

        developer.setAge(30);
        developer.getAge();
        System.out.println(developer.getAge());
        System.out.println(developer);
        System.out.println("-------");

        developer.work();
        teacher.work();
        tester.work();
        student.study();
        System.out.println("----------");

        developer.eat();
        developer.drink();
        developer.sleep();
        developer.fixingBugs();

        System.out.println("----------");
        tester.eat();
        tester.drink();
        tester.sleep();
        tester.createTicket();

        System.out.println("------");
        teacher.eat();
        teacher.drink();
        teacher.sleep();

        System.out.println("------");
        student.eat();
        student.drink();
        student.sleep();
        student.study();

    }
}
