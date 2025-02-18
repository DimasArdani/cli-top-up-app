package Services;

import Services.BankAbstract.AbstractBank;

public class BRI extends AbstractBank {

    @Override
    public void name() {
        System.out.println("Bank BCA");
    }

    public Integer biayaAdmin(){
        return 2000;
    }

    public double point(){
        return 0.02;
    }
}
