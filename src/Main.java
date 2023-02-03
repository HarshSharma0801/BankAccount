public class Main {
    public static void main(String[] args) {
       Account bobsAccount = new Account("2134533",1000.0,"Bob Green",
               "myaccount@bob.com","(090-12535)");

       //bobsAccount.setNumber("2134533");
       //bobsAccount.setbalance(1000.0);
       //bobsAccount.setCustomerName("Bob Green");
       //bobsAccount.setCustomerEmail("myaccount@bob.com");
       //bobsAccount.setCustomerPhone("(090-12535)");
        System.out.println("Name - "+bobsAccount.getCustomerName());
        System.out.println("Balance - "+bobsAccount.getbalance());
       bobsAccount.withdrawFunds(1000.0);
        bobsAccount.depositFunds(2500.0);

    }
}