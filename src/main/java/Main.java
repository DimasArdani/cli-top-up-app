import Entity.Customer;
import Services.CustomerService;
import Services.InVoice;
import Services.TopUp;

public class Main {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService();
        TopUp top = new TopUp();
        InVoice iv = new InVoice();

        if(cs.halamanLogin()){
            top.getMenu();
            iv.cetakTransaksi(cs.user, cs.saldoAwal, top.nominal, top.namaBank);
        } else {
            System.exit(0);
        }

    }
}
