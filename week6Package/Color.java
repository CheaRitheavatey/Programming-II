package week6Package;

public enum Color {
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0),
    PURPLE(160, 32, 240);


    // data field
    private final int r;
    private final int g;
    private final int b;

    // constructor
    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getRGB() {
        return this.toString() + " " + this.r + " " + this.g +" "+ this.b;
    }


}
