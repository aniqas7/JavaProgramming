package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class scrumTeam {
    public String PO, BA, SM;
    public ArrayList<Tester>testersList=new ArrayList<>();
    public ArrayList<Developer>devopsList=new ArrayList<>();
    public int daysOfSprint;

    public scrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));

    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDevops(Developer[] devops){
        devopsList.addAll(Arrays.asList(devops));
    }
    public void removeTester(int employeeID){
    testersList.removeIf(p ->p.employeeID==employeeID);
    }
    public void removeDeveloper(int employeeID){
       devopsList.removeIf(p ->p.employeeID==employeeID);
    }

    public String toString() {
        return "scrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total testers=" + testersList.size() +
                ", total developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
