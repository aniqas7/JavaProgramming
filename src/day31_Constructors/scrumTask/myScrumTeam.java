package day31_Constructors.scrumTask;

import java.util.ArrayList;

public class myScrumTeam {
    public static void main(String[] args) {
        //4 testers objects

        Tester tester1= new Tester("Layan",11, "QA" ,110000 );
        Tester tester2= new Tester("Ali",43, "SDET" ,142000 );
        Tester tester3= new Tester("Alex",44, "SE" ,13000 );
        Tester tester4= new Tester("Lala",12, "QA" ,11700 );
        Tester[] testers= {tester2,tester3,tester4};

        //4 developers objects
        Developer developer1= new Developer("Olga",22, "Java Developer" ,12000 );
        Developer developer2= new Developer("Aygun", 39, "Java Master", 185.000);
        Developer developer3 = new Developer("Muhtar", 9, " Senior Engineer", 250000);
        Developer developer4= new Developer("Sinem", 13, "Senior Developer",200.000);
        Developer[] developers= {developer2,developer3,developer4};
        //1 scrum team object
        scrumTeam scrum= new scrumTeam("Nigara","Husein","Aniqa",14);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevops(developers);

        System.out.println(scrum);

        for(Tester eachTester: scrum.testersList){
            System.out.println(eachTester.name+" : "+eachTester.salary);
        }

        for (Developer eachDeveloper : scrum.devopsList) {
            //scrum.devopslist for

            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);

        }
        scrum.removeTester( 23 );
        scrum.removeDeveloper( 22 );

        System.out.println(scrum);
    }
}
