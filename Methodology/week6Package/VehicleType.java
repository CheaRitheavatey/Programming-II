package Methodology.week6Package;

public enum VehicleType {
    CAR(4,"private",true),
    MOTORCYCLE(2, "private",true),
    BICYCLE(2, "private",false),
    PLANE(8, "public", true);   

    // data field
    private int numWheel;
    private String dutyKind;
    private boolean isMotorized;

    // constructor
    VehicleType(int numWheel, String dutyKind, boolean isMotorized) {
        this.numWheel = numWheel;
        this.dutyKind = dutyKind;
        this.isMotorized = isMotorized;
    }

    public String toString() {
        return this.toString() + " " + this.numWheel + " " + this.dutyKind + " " + this.isMotorized;
    }


    public int getNumWheel() {
        return numWheel;
    }
    public void setNumWheel(int numWheel) {
        this.numWheel = numWheel;
    }

    
    public String getDutyKind() {
        return dutyKind;
    }

    public void setDutyKind(String dutyKind) {
        this.dutyKind = dutyKind;
    }

    public boolean isIsMotorized() {
        return isMotorized;
    }

    public void setIsMotorized(boolean isMotorized) {
        this.isMotorized = isMotorized;
    }

}