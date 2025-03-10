package week5projectClass;

import java.lang.reflect.Member;

class ProjectIndividual extends Project{
    // data field
    private Member member;

    // constructor
    ProjectIndividual(String name, Member member) {
        super(name);
        this.member = member;
    }

    // getter and setter
    public Member getMember() {
        return this.member;
    }
    public void setMember(Member member) {
        this.member = member;
    }

    @Override
    public String toString() {
        return this.getName() + " is assigned to " + this.member.getName();
    }
}


public class TestProjectIndividual {
    public static void main(String[] args) {
        ProjectIndividual mem1 = new ProjectIndividual("Airplane project", null);
        System.out.println(mem1.getMember());
    }

    
}
