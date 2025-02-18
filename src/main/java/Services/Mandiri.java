package Services;

import Services.BankAbstract.AbstractBank;

public class Mandiri extends AbstractBank {

    @Override
    public void name() {
        System.out.println("Bank Mandiri");
    }

    public Integer biayaAdmin(){
        return 2000;
    }
}
