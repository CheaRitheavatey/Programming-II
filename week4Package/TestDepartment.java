package week4Package;

import java.util.ArrayList;

class Deparment extends Team {
    // data field
    private String deparment;
    // constructor
    Deparment(String teamName, Member member, String deparment) {
        super(teamName, member);
        this.deparment = deparment;
    }

    public String getDeparment() {
        return deparment;
    }
    public void setDeparment(String department) {
        this.deparment = department;
    }

    @Override
    public String toString() {
        return super.toString() + this.deparment;
    }

    @Override
    public ArrayList<Member> getMember() {
        for (Member m: super.teamMember) {
            System.out.println(m.getName() + " ");
        }        
        return this.teamMember;
    }

}


public class TestDepartment {
    public static void main(String[] args) {
        Deparment dep = new Deparment("team name", new Member("joe",17,"IT"), null);
        System.out.println(dep.getLeader());

        System.out.println(dep.toString());
    }
}