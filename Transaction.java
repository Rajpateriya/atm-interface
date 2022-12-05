import java.util.*;
public class Transaction{
    private double amount;//amount of this trasaction
    private Date timestamp;//time and date of this transcation 
    private String memo;//memo for this transaction
    private Account inAccount;//the account in which transaction is performed
    
    public Transaction(double amount,Account inAccount){
        this.amount = amount;
        this.inAccount = inAccount;
        this.timestamp = new Date();
        this.memo = "";
    }
    public Transaction(double amount,String memo,Account inAccount){
        //call two args constructor first
        this(amount,inAccount);
        //set the memo
        this.memo = memo;
    }
    public double getAmount(){
        return this.amount;
    }
    public String getSummaryLine(){
        if(this.amount >= 0){
            return String.format(this.timestamp.toString()+" : $"+this.amount+" : "+this.memo);
        }else{
            return String.format(this.timestamp.toString()+" : $("+this.amount+") : "+this.memo);
        }
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    public Account getInAccount() {
        return inAccount;
    }
    public void setInAccount(Account inAccount) {
        this.inAccount = inAccount;
    }

}