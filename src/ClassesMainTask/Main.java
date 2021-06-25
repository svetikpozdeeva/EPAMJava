package ClassesMainTask;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Action customers = new Action("ListCustomers");
        customers.addCustomerToShopList(new SubjectCustomer(1, "Андрей", "Сидоров", "Дмитриевич", 444938738, 77743839));
        customers.addCustomerToShopList(new SubjectCustomer(2, "Дмитрий", "Панов", "Алексеевич", 444984273, 77749384));
        customers.addCustomerToShopList(new SubjectCustomer(3, "Анна", "Хозеева", "Васильевна", 444237864, 77749554));
        customers.addCustomerToShopList(new SubjectCustomer(3, "Петр", "Ужов", "Владимирович", 444857463, 77742584));
        customers.addCustomerToShopList(new SubjectCustomer(3, "Мария", "Андреева", "Викторовна", 444864384, 77747983));
        customers.addCustomerToShopList(new SubjectCustomer(3, "Дарья", "Жиркова", "Петровна", 444947652, 77741875));
        System.out.println("\nКлиенты в алфавитном порядке:");
        List<SubjectCustomer> listSortByName = customers.getListByName();
        for (SubjectCustomer c : listSortByName) {
            System.out.println(c);
        }

        System.out.println("\nКлиенты с картами в заданном диапазоне:");
        List<SubjectCustomer> listSortByDiapazonCreditCard = customers.getListByDiapasonCreaditCard(77745000, 77749999);
        for (SubjectCustomer c : listSortByDiapazonCreditCard) {
            System.out.println(c);
        }
    }
}

