package Services;

import Entity.Customer;

import java.util.Scanner;

public class CustomerService {
    Scanner sc = new Scanner(System.in);
    Customer customer = new Customer();
    TopUp top = new TopUp();
    public Integer saldoAwal = 250000;
    public String user = "Dimas";
    String pass = "111";

    public boolean halamanLogin(){
        System.out.println("=============LOGIN==============");
        System.out.print("Masukkan Username : ");
        customer.userName = sc.nextLine();
        System.out.print("Masukkan Password : ");
        customer.password = sc.nextLine();
        if (isLogin(customer.userName, customer.password)){
            System.out.println("Login Berhasil");
            return true;
        } else {
            System.out.println("Login gagal");
            return false;
        }

    }
    public boolean isLogin(String userName, String password){
        return customer.userName.equals(user) && customer.password.equals(pass);
    }
}
