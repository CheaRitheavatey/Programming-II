package week5projectClass;

import java.util.Date;

class Project {
    // data field
    private String name;
    private int deadline = 30;
    private Date startDate;
    private Team team;

    Project(String name, int deadline, Date startDate) {
        this.name = name;
        this.deadline = deadline;
        startDate = new Date();   
    }

    Project(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    Project(String name) {
        this.name = name;
    }
    

    // getter setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
    public void setTeamName(Team team) {
        this.team = team;
    }


    public String getName() {
        return this.name;
    }
    public int getDeadline() {
        return this.deadline;
    }
    public Team getTeamName() {
        return this.team;
    }
    public Date getStartdate() {
        return this.startDate;
    }
}

public class TestProject {
    public static void main(String[] args) {
        Project pro = new Project(null, 0, null);
        System.out.println(pro.toString());
    }
    
}