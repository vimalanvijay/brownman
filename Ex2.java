import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        System.out.println("First num: ");
        double num1=cin.nextDouble();
        System.out.println("second num: ");
        double num2=cin.nextDouble();
        System.out.println("third num: ");
        double num3=cin.nextDouble();

        System.out.println("Smallest is "+ smallest(num1, num2, num3));
        System.out.println("Average is "+ average(num1, num2, num3));

        String num="3570";
        System.out.println("Middle of "+num+" is "+middleString(num));

        String s="w3resource";
        System.out.println(s+" has "+countVowels(s)+" vowels");

        String s2="hello world";
        System.out.println(s2+" has "+countWords(s2));

        System.out.println("Password should have 10 char, at least 2 digits");
        String pass="abcdwer4d6";
        System.out.println("Pass is "+pass);

        if(passwordCheck(pass)){
            System.out.println("Valid password");
        }else System.out.println("Invalid password");
    }

    public static double smallest(double x, double y, double z){
        return Math.min(Math.min(x, y),z);
    }

    public static double average(double x,double y, double z){
        return (x+y+z)/3;
    }

    public static String middleString(String s_in){
        if( (s_in.length()/2 )% 2 !=0){
            return Character.toString(s_in.charAt(s_in.length()/2));
        }else
            return s_in.substring((s_in.length()/2)-1,(s_in.length()/2)+1);  
    }

    public static int countVowels(String s){
        int count=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }else if(s.charAt(i)=='e'){
                count++;
            }
            else if(s.charAt(i)=='i'){
                count++;
            }
            else if(s.charAt(i)=='o'){
                count++;
            }
            else if(s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static int countWords(String s){
            int count=0;

            if(s==null){
                return count;
            }

            s.trim();

            if(s==""){
                return count;
            }

            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ')
                    count++;
            }
            return count;
    }

    public static boolean passwordCheck(String password){
        int numcount=0;
        int lettercount=0;

        if(password.length()<10){
            return false;
        }

        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            
            if((c>='0')&&(c<='9')){
                numcount++;
            }else if((c>='A')&&(c<='Z'))
                lettercount++;
        }

        if((numcount>=2) || (lettercount>=2))
            return true;
        else return false;
    }
}