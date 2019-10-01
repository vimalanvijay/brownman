import java.util.Scanner;
import java.math.*;

public class bmi{
    public static void main(String args[]){
        double weight;
        double height;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your weight in kg: ");
        weight=scan.nextDouble();

        System.out.println("Enter your height in cm: ");
        height=scan.nextDouble();

        bmiCalc(weight, height);
        scan.close();

    }

    public static double bmiCalc(double w, double h){
        double bmi;
        h=h/100;
        bmi=w/(Math.pow(h,2));
        System.out.println("BMI is: "+(int)bmi);
        

        if(bmi<=18.5){
            System.out.println("You are underweight!");
            
        }else if((bmi>18.5)&&(bmi<25)){
            System.out.println("You are normal weight!");
            System.out.println("You are "+(int)(25-bmi)+" BMI points away from being overweight");

            double maxWeight=24.99*(Math.pow(h,2));
            double minWeight=18.6*(Math.pow(h,2));
            System.out.println("Min weight to remain in normal BMI: "+(int)minWeight+"kgs.");
            System.out.println("Max weight to remain in normal BMI: "+(int)maxWeight+"kgs.");
            System.out.println("That is a difference of "+(int)(maxWeight-w)+"kgs to overweight.");







        }else if((bmi>25)&&(bmi<30) ){
            System.out.println("You are overweight!");
        }else if(bmi>30){
            System.out.println("You are obese!");
        }

        return bmi;
    }

}