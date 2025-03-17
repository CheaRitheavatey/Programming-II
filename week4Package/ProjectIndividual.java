package week4Package;

public class ProjectIndividual extends Project{
    
    private Member member;
    
    public ProjectIndividual(String name, Member member) {
        super(name);
        this.member = member;
    }
    
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    @Override
    public String toString() {
        return(this.getName() + " project is assigned to " + this.member.getName());
    }
    
    
}

