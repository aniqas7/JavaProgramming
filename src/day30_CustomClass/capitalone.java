package day30_CustomClass;

public class capitalone {
    public static void main(String[] args) {


        employee employee1 = new employee();
        employee employee2 = new employee();
        employee employee3 = new employee();
        employee employee4 = new employee();
        employee employee5 = new employee();

        employee1.setInfo("John",'M',25,2237,"SDET",125000,true);
        employee2.setInfo("Anna",'F',28,2287,"QA",85000,true);
        employee3.setInfo("David",'M',35,2256,"QA",45000,false);
        employee4.setInfo("Lina",'F',45,2290,"Manager",80000,true);
        employee5.setInfo("Kevin",'M',35,2298,"Senior QA", 110000,true);

        employee[] employees= {employee1,employee2,employee3,employee4,employee5};

                int countfulltime=0;
                double minsalary=employees[0].salary;
                double maxsalary=employees[0].salary;
        for (employee each : employees) {
            if(each.isFullTime){
                countfulltime++;
            }
            if(each.salary<minsalary){
                minsalary=each.salary;
            }
            if(each.salary>maxsalary){
                maxsalary=each.salary;
            }
        }
        System.out.println(countfulltime);
        System.out.println(minsalary);
        System.out.println(maxsalary);


    }
}
/*
CapitalOne Class:
	1. create 5 Employee objects
	2. store those 5 employee objects into an array
	3. how many employees are full time employees?
	4. What's the minimum salary
	5. what's the maximum salary
 */
