public class Main{

    public static void main(String[] args) {
        Accounts accounts = new Accounts();


        GUI loginGui = new GUI(accounts.getUserPassword());
    }
}