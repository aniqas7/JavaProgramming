package day41_exceptions;

import day30_CustomClass.employee;
import day39_Recap.CydeoTask.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {
        Employee employee = null;
        try {
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("index out of bounds");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("arithmetic exception");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("null pointer exception");
        } catch(RuntimeException e) {
            System.out.println("run time exception");
        }

        System.out.println("------------");

        try {
            System.out.println("java".charAt(-1));
        }catch(RuntimeException e){
            e.printStackTrace();
            System.out.println("caught");
        }

    }
}
