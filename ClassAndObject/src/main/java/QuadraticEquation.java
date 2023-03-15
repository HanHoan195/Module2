public class QuadraticEquation {
    private double a, b , c;
    public QuadraticEquation(){

    }
    public QuadraticEquation (double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
    }
    public double getDiscriminant(){
        double delta = (this.b * this.b) - (4 * this.a * this.c);
         return delta;
    }
    public double getRoot1(){
        double r1 = -this.b + Math.sqrt( getDiscriminant());
        return r1;
    }
    public double getRoot2(){
        double r2 = -this.b - Math.sqrt( getDiscriminant());
        return r2;
    }
    public double getDoubleSolution(){
        double x = -this.b / 2 * this.a;
        return x;
    }
}
