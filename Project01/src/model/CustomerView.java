package model;

public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n-------客户管理系统------\n");
            System.out.println("         1 添加客户");
            System.out.println("         2 修改客户");
            System.out.println("         3 删除客户");
            System.out.println("         4 客户列表");
            System.out.println("         5 退   出\n");
            System.out.println("         请选择(1-5)");
            char key =CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认退出(Y/N)");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    public void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readKeyBoard(4, false);
        System.out.print("性别：");
        char gender = CMUtility.readKeyBoard(1, false).charAt(0);
        System.out.print("年龄：");
        int age = Integer.parseInt(CMUtility.readKeyBoard(2, false));
        System.out.print("电话：");
        String phone = CMUtility.readKeyBoard(11, false);
        System.out.print("邮箱：");
        String email = CMUtility.readKeyBoard(20, false);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");
        }
    }

    public void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        Customer cust;
        int number;
        for (;;) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            number = Integer.parseInt(CMUtility.readKeyBoard(2, false));
            if (number == -1) {
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }

        System.out.print("姓名(" + cust.getName() + ")：");
        String name = CMUtility.readKeyBoard(4, true);
        if (name.length() == 0) {
            name = cust.getName();
        }

        System.out.print("性别(" + cust.getGender() + ")：");
        char gender = CMUtility.readKeyBoard(1, true).charAt(0);
        if (gender == '\u0000') {
            gender = cust.getGender();
        }

        System.out.print("年龄(" + cust.getAge() + ")：");
        String ageStr = CMUtility.readKeyBoard(2, true);
        int age = ageStr.length() == 0 ? cust.getAge() : Integer.parseInt(ageStr);

        System.out.print("电话(" + cust.getPhone() + ")：");
        String phone = CMUtility.readKeyBoard(11, true);
        if (phone.length() == 0) {
            phone = cust.getPhone();
        }

        System.out.print("邮箱(" + cust.getEmail() + ")：");
        String email = CMUtility.readKeyBoard(20, true);
        if (email.length() == 0) {
            email = cust.getEmail();
        }

        Customer newCust = new Customer(name, gender, age, phone, email);
        boolean isSuccess = customerList.replaceCustomer(number - 1, newCust);
        if (isSuccess) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("---------------------修改失败---------------------");
        }
    }

    public void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");
        int number;
        for (;;) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            number = Integer.parseInt(CMUtility.readKeyBoard(2, false));
            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N)：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean isSuccess = customerList.deleteCustomer(number - 1);
            if (isSuccess) {
                System.out.println("---------------------删除完成---------------------");
            } else {
                System.out.println("---------------------删除失败---------------------");
            }
        }
    }

    public void listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        Customer[] customers = customerList.getAllCustomer();
        if (customers.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            for (int i = 0; i < customers.length; i++) {
                Customer cust = customers[i];
                System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
