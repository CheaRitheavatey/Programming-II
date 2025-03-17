package week4Package;

import java.util.ArrayList;



public class TestDepartment extends Team {
    
    private Department departmentName;
    
    public TestDepartment(String teamName, Member leader, Department departmentName) {
        
        super(teamName, leader);
        this.departmentName = departmentName;
        
    }
    
    public Department getDepartmentName () {
        return this.departmentName;
    }
    
    public void setDepartmentName(Department departmentName) {
        this.departmentName = departmentName;
    }
    
    static public void howToTeam() {
        
        System.out.println("You can create a new team by passing a team name and a leader to Team constructor!");
        System.out.println("Department name should be passed too!");
        
    }
    
    @Override
    public ArrayList<Member> getTeamMembers() {
        System.out.println("Department: " + this.departmentName);
        for(Member m: teamMembers) {
            System.out.println(m.getName() + ", ");
        }
        return this.teamMembers;
    }
    
    
}
