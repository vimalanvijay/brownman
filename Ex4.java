import java.math.*;
public class Ex4{
    public static void main(String args[]){
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        
        System.out.println("The object's position after " + fallingTime +
        " seconds is " + finalPosition + " m.\n");
        System.out.println("Answer is "+finalDistace(initialPosition, gravity, fallingTime, initialVelocity)+" m");

    }

    public static double finalDistace(double x, double a, double t, double v){
        double finalx= (0.5 * a*Math.pow(t, 2)) + (v*t) + x;

        return finalx;
    }
}