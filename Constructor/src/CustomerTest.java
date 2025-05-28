public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer("Well", "Smith");
        Account account = new Account(1000, 2000, 0.0123);
        customer.setAccount(account);

        // 存取操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        // 输出信息
        System.out.println("Customer：" + customer.getFirstName() + " " + customer.getLastName() +
                "\t账户：" + customer.getAccount().getId() + "\t余额：" + customer.getAccount().getBalance() +
                "\t年利率：" + customer.getAccount().getAnnualInterestRate() * 100 + "%");
    }
}
