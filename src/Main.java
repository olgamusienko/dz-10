import exceptions.WrongAccountException;
import exceptions.WrongCurrencyException;
import exceptions.WrongOperationException;

public class Main {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();

        try {
            bankApplication.process("accountId000", 50, "USD");
//            bankApplication.process("accountId003", 250, "HRV");
//            bankApplication.process("accountId001", 50, "EUR");
//            bankApplication.process("accountId001", 50, "USD");

        } catch (WrongAccountException wrongAccountException) {
            System.out.println("This account does not exist");
        } catch (WrongCurrencyException wrongCurrencyException) {
            System.out.println("This bank account has another currency");
        } catch (WrongOperationException wrongOperationException) {
            System.out.println("This bank account does not have enough money");
        } catch (Exception e) {
            System.out.println("Error occurred while processing. Try again later");
        } finally {
            System.out.println("Thank you for using our service");
        }
    }
}