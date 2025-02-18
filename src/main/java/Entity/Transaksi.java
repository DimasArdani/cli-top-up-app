package Entity;

import java.time.LocalDate;

public class Transaksi {
    private Integer trxID;
    private Integer amount;
    private String bankName;
    private LocalDate createdDate;
    private String status;
    private Integer admin;

    public Integer getTrxID() {
        return trxID;
    }

    public void setTrxID(Integer trxID) {
        this.trxID = trxID;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    private Integer total;

}
