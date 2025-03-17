package week4Package;

public class Member {
    
    private String name;
    private int age;
    private String specialization;
    
    public Member(){
        
    }
    
    public Member(String name, int age, String specialization) {
        this.name = (!name.trim().equals("")) ? name.trim() : "Unknown";
        this.age = age;
        this.specialization = specialization;
    }
    
    //getters
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getSpecialization() {
        return this.specialization;
    }
    
    //Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    
    
    
    
    
}
