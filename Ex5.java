import employee.java;

public class Ex5{

    public static void main(String [] args){

        System.out.println(" \n\n******Employee pay calculator ******\n\n");
        Employee e1 = new Employee (7.50,35);
        e1.calPay();

        Employee e2 = new Employee (8.20,47);
        e2.calPay();

        Employee e3 = new Employee (10,73);
        e3.calPay();
        Employee e4= new Employee (11,54);
        e4.calPay();
        Employee e5 = new Employee (9,44);
        e5.calPay();
        Employee e6 = new Employee (8,59);
        e6.calPay();

    }

}