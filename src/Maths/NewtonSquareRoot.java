package Maths;

public class NewtonSquareRoot {
    public static void main(String[] args) {

    }

    static double sqrt(double n){
        double x = n;
        double root = 0.0;
        while (true){
            root = 0.5 * (x + n/x);

            if(Math.abs(root -x )<1){
                break;
            }

            x = root;
        }
        return  root;
    }
}
