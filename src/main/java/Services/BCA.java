package Services;

import Services.BankAbstract.AbstractBank;

public class BCA extends AbstractBank {
    @Override
    public void name() {
        System.out.println("Bank BCA");
    }
}
