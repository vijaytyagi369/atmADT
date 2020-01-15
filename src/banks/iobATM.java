package banks;

import adt.ATM;

public class iobATM implements ATM {

    @Override
    public double deposite(double amt) {
        return 0;
    }

    @Override
    public double withdraw(double amt) {
        return 0;
    }

    @Override
    public void showBalance() {

    }

    @Override
    public boolean verifyPin(int pin) {
        return false;
    }
}
