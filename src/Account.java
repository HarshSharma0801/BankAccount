public class Account {
    private String number ;
    private double balance ;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getNumber() {
        return number;
    }
    public Account(String number , double balance,String customerName,String email,String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance=balance;
        this.customerName=customerName;
        customerEmail = email;
        customerPhone = phone;

    }
    public Account (String customerName,String customerPhone, String customerEmail){
        this("999-999-999",1000000,customerName,customerPhone,customerEmail);
    }
    public void depositFunds(double depositAmount){
        balance+=depositAmount;
        System.out.println("Deposit of $"+depositAmount+" made. New balance is $"+balance);
    }
    public void withdrawFunds(double withdrawAmount){
        if (balance-withdrawAmount<0){
            System.out.println("Insufficient Funds ! " +"You only have $"+balance+" in your account ."  );
        }
        else {
            balance-=withdrawAmount;
            System.out.println("Withdrawal of $"+withdrawAmount+" processed, Remaining balance = $" +
                    balance);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
