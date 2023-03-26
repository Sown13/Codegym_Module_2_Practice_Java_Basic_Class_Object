public class QuadraticEquation {
    private final double a, b, c;
    private double delta;
    public QuadraticEquation (double para1, double para2, double para3){
        this.a = para1;
        this.b = para2;
        this.c = para3;
    }
    public double getDiscriminant(){
        return this.b * this.b - (4 * this.a * this.c);
    }
    public double getRoot1(){
        this.delta = getDiscriminant();
        if (this.delta >= 0) {
            return (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
        }
        else return 0;
    }
    public double getRoot2(){
        this.delta = getDiscriminant();
        if (this.delta >= 0) {
            return (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
        }
        else return 0;
    }
}
