public class MyRoom {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setColor("blue");
        fan1.setRadius(10);
        fan2.setColor("yellow");
        fan2.setRadius(5);
        fan1.showStatus();
        fan2.showStatus();
    }
}
