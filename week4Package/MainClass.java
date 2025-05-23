package week4Package;

import java.util.Arrays;

import javax.swing.SpinnerDateModel;

public class MainClass {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Car carOne = new Car();
        
        // carOne.printState();
        
        // carOne.changeGear(2);
        // carOne.speedUp(80);
        
        // carOne.printState();
        /*
        Team teamOne = new Team("One", "Charlie");
        
        teamOne.getTeamMembers();
        
        teamOne.addMember("Jack");
        teamOne.addMember("Sally");
        teamOne.addMember("Lucy");
        
        teamOne.getTeamMembers();
        
        Team teamTwo = new Team("Two", "Monika");
        
        System.out.println(teamTwo.teamMembers);
        
        System.out.println(Team.allTeams);
        
        Team.howToTeam();
        */
        //Prac:
        /*
        Create a class named Member
        fields: name, age, specialization, 
        to create an instance, all field values should be passed
        >> a constructor to set all attributes
        
        a user should be able to create an instance 
            either by passing all field values
            or passing nothing
        */
        getallSpecialization();
        System.out.println();
        
        Member memberOne = new Member("Jack", 25, Specialization.TEACHER);
        Member memberTwo = new Member();
        
        System.out.println(memberOne.getSpecialization());
        memberOne.setAge(30);
        
        
        Team teamOne = new Team("One", memberOne);
        teamOne.addMember(memberTwo);
        
        teamOne.getTeamMembers();
        
        System.out.println(Team.allTeams);
        
        
        // Inheritance testObject = new Inheritance();
        // System.out.println(testObject.b);
        
        //a subclass will inherit all members(fields, methods, nested classes) of the parent class
        /*
        ExampleThree testExampleThree = new ExampleThree();
        System.out.println(testExampleThree.b);
        testExampleThree.test();
        */
        
        System.out.println(teamOne);
        
        TestDepartment.howToTeam();
        
        TestDepartment dep = new TestDepartment("new team", memberOne, Department.FINANCE);
        dep.getTeamMembers();
        
        Project projectOne = new Project("University Project", teamOne);
        System.out.println(projectOne.getStartDate());
        System.out.println(projectOne);
        
        ProjectIndividual projectTwo = new ProjectIndividual("Airplane", memberOne);
        System.out.println(projectTwo.getEstimatedLength());
        System.out.println(projectTwo);
        
        
    }

    // create a method to give a list of all specialization
    public static void getallSpecialization() {
        Specialization[] special = Specialization.values();
        System.out.println(Arrays.toString(special)); // print as a array list


        // for (Specialization i: special) {
        //     System.out.println(i + " index " + i.ordinal());
        // }
    }
    
}
