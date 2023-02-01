public class Main {
    public static void main(String[] args) {
       Account bobsAccount = new Account();
       bobsAccount.setNumber("2134533");
       bobsAccount.setbalance(1000.0);
       bobsAccount.setCustomerName("Bob Green");
       bobsAccount.setCustomerEmail("myaccount@bob.com");
       bobsAccount.setCustomerPhone("(090-12535)");
        System.out.println("Name - "+bobsAccount.getCustomerName());
        System.out.println("Balance - "+bobsAccount.getbalance());
        bobsAccount.depositFunds(1000.0);

       bobsAccount.withdrawFunds(100.0);





    }
}