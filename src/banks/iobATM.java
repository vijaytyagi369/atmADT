package banks;

import adt.ATM;

public class iobATM implements ATM {
    private String usr= "Vijay Tyagi";
    private double amt=100000.0;
    private int pin=753951;
    private boolean response=false;


    public String getName(){
        return usr;
    }


    @Override
    public void deposite(double amt) {
        if (amt >= 0) {
            this.amt=this.amt+amt;
            System.out.println("Your Balance After Deposition =" + this.amt);

        }
    }
    @Override
    public double withdraw(double amt) {
        if(amt<this.amt && amt>=0) {
            this.amt=this.amt-amt;
            System.out.println("Your Balance After Withdrawl = " +this.amt);
        }
        return amt;
    }

    @Override
    public void showBalance() {
        System.out.println("Your Balance is "+this.amt);

    }

    @Override
    public boolean verifyPin(int pin) {
        if(this.pin==pin){
            response=true;
        }
        return response;
    }
}
