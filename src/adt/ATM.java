package adt;

public interface ATM {
    public abstract void deposite(double amt);
    public abstract double withdraw(double amt);
    public abstract void showBalance();
    public  abstract boolean verifyPin(int pin);

}
