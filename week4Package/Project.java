package week4Package;

import java.util.Date;

public class Project {
     private String name;
    private int estimatedLength = 30;
    private Date startDate = new Date();
    private Team team;
    
    protected Project(String name) {
        this.name = name;
    }
    
    public Project(String name, Team team) {
        this.name = name;
        this.team = team;
    }
    
    public Project(String name, Team team, int estimatedLength) {
        this.name = name;
        this.team = team;
        this.estimatedLength = estimatedLength;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getEstimatedLength() {
        return this.estimatedLength;
    }
    
    public Date getStartDate() {
        return this.startDate;
    }
    
    public Team getTeam() {
        return this.team;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setEstimatedLength(int estimatedLength) {
        this.estimatedLength = estimatedLength;
    }
    
    public void setTeam() {
        this.team = team;
    }
    
    @Override
    public String toString() {
        return(this.name + " project is assigned to team " + this.team.teamName);
    }
    
}
