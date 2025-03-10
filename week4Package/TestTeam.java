package week4Package;

import java.util.ArrayList;
import java.util.HashSet;

class Team {
    // data field
    // team name; leader; list of teammmate
    private String teamName;
    private Member leader;
    protected ArrayList<Member> teamMember = new ArrayList<>();

    // dont want team to have the same namel
    static HashSet<String> allteam = new HashSet<>();

    // constructor
    Team(String teamName, Member leader) {
        this.teamName = teamName;
        this.leader = leader;
        this.teamMember.add(leader);
        this.allteam.add(teamName);

    }

    // method
    public void addTeammate(Member member) {
        this.teamMember.add(member);

    }
    public void removeTeammate(Member member) {
        if (this.teamMember.size() < 1) {
            System.out.println("No one in the team");
        } else {
            this.teamMember.remove(member);
        }
        
    }

    // getter setter
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void setLeader(Member leader) {
        this.leader = leader;
        this.teamMember.add(this.leader);
    }
    
    public String getTeamNate() {
        return this.teamName;
    }
    public Member getLeader() {
        if (!this.teamMember.contains(this.leader)) {
            System.out.println("Leader has been removed add a new leader");
        }
        System.out.println("Add new leader");
        return this.leader;
    }
    public ArrayList<Member> getMember() {
        // Collections.sort(this.teamMember);
        return this.teamMember;
    }
    
    public static void a() {
        System.out.println("static method");
    }

    @Override
    public String toString() {
        return teamName;
    }
    
}

public class TestTeam {
    public static void main(String[] args) {
        Member joe = new Member("joe", 12, "football");
        Member john = new Member("johnn", 17, "basketball");
        Member newleader = new Member("new leader", 17, "baseball");
        Member yoyo = new Member("yoyo", 15, "tennis");
        Team team1 = new Team("Team 1", joe);
        team1.addTeammate(john);
        System.out.println(team1.getMember());

        // remove team leader
        team1.removeTeammate(joe);
        System.out.println(team1.getMember());
        team1.getLeader();

        team1.setLeader(newleader);
        team1.addTeammate(yoyo);
        
        System.out.println("This team name: "+ team1.getTeamNate() + " with " + team1.getMember().size() + " members. team leader is " + team1.getLeader().toString() + " all the name inside: " + team1.getMember());

        
        Team.a(); // when using static u dont need an instance or object to access it
    }

    
}
