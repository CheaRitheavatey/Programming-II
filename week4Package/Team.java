package week4Package;

import java.util.ArrayList;
import java.util.HashSet;

public class Team {
    
    String teamName;
    Member leader;
    ArrayList<Member> teamMembers = new ArrayList<>();
    
    static HashSet<String> allTeams = new HashSet<>();
    
    public Team(String teamName, Member leader) {
        this.teamName = teamName;
        this.leader = leader;
        this.teamMembers.add(leader);
        this.allTeams.add(teamName);
    }
    
    public void addMember(Member newMember) {
        teamMembers.add(newMember);
        System.out.println(newMember.getName() + " is added to " + this.teamName  + " team.");
    }
    
    public void removeMember(Member member) {
        teamMembers.remove(member);
        System.out.println(member + " is remove from " + this.teamName + " team.");
    }
    
    public ArrayList<Member> getTeamMembers() {
        //Collections.sort(teamMembers);
        //System.out.println(teamMembers);
        for(Member m: teamMembers) {
            System.out.print(m.getName() + ", ");
        }
        
        return this.teamMembers;
    }
    
    static public void howToTeam() {
        System.out.println("You can create a new team by passing a team name and a leader to Team constructor!");
    }
    
    @Override
    public String toString() {
        return this.teamName;
    }
    
    
    
}
