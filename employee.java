class Employee{
    public final double MIN_WAGE= 8.00;
    public final double MAX_OVERTIME= 60;
    public final double MAX_HOURS= 40;

    private double base_pay;
    private double hours;
    private double total_pay;
    private double overtime_pay;

    Employee(){
        base_pay=0;
        hours=0;
        total_pay=0;
        overtime_pay=0;
    }

    Employee(double pay, double worked){
        base_pay=pay;
        hours=worked;
    }

    double getPay(){
        return base_pay;
    }

    double getHours(){
        return hours;
    }

    void calPay(){
        System.out.println("\nEmployee: Pay: "+getPay()+" Hours Worked: "+getHours());

        if(base_pay>=8){
            if((hours>MAX_HOURS)&&(hours<MAX_OVERTIME)){
            overtime_pay=(hours-MAX_HOURS)*1.5*base_pay;
            total_pay=overtime_pay+(base_pay*MAX_HOURS);
            System.out.println("Total pay is: $"+total_pay+"\n");
            }else if(hours<=MAX_HOURS){
                total_pay=hours*base_pay;
                System.out.println("Total pay is: $"+total_pay+"\n");
            }else if(hours>=MAX_OVERTIME){
                System.out.println("Error! Hours worked is greater than "+MAX_OVERTIME+" hours\n");
            }
        }else{
            System.out.println("Error! Base pay is less than $"+MIN_WAGE);
        }

        

    }


}
