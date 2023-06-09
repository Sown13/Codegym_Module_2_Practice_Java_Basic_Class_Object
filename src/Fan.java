public class Fan {
    private final int SLOW = 1 , MEDIUM = 2 , FAST = 3 ;
    private int speed = SLOW ;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }
    public void showStatus(){
        if (isOn()){
            System.out.printf("Fan is on; Radius = %f; Color = %s; Speed is %s \n", getRadius(), getColor(), getSpeed());
        }
        else {System.out.printf("Fan is off; Radius = %f; Color = %s \n", getRadius(), getColor());}
    }
}
