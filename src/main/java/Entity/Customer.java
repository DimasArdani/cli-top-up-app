package Entity;

public class Customer {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public Integer getPrevious_saldo() {
        return previous_saldo;
    }

    public void setPrevious_saldo(Integer previous_saldo) {
        this.previous_saldo = previous_saldo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String fullName;
    public Integer saldo = 100000;
    public Integer previous_saldo;
    public String userName;
    public String password;
}
