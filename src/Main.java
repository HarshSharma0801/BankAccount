public class Main {
    public static void main(String[] args) {
       Account bobsAccount = new Account();
       bobsAccount.setNumber("2134533");
       bobsAccount.setbalance(1000.0);
       bobsAccount.setCustomerName("Bob Green");
       bobsAccount.setCustomerEmail("myaccount@bob.com");
       bobsAccount.setCustomerPhone("(090-12535)");
       bobsAccount.withdrawFunds(100.0);
       bobsAccount.depositFunds(250.0);
       bobsAccount.withdrawFunds(50.0);
       bobsAccount.withdrawFunds(200.0);
        bobsAccount.depositFunds(100.0);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.55);
        bobsAccount.withdrawFunds(54.45);



    }
}