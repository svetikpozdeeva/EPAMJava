package ClassesMainTask;
import java.util.*;

public class Action {
    private String actionName;
    private ArrayList<SubjectCustomer> customersList = new ArrayList<>();

    Action(String actionName) {
        this.actionName = actionName;
    }

    void addCustomerToShopList(SubjectCustomer customer) {
        customersList.add(customer);
    }

    List<SubjectCustomer> getListByName() {
        List<SubjectCustomer> list = new ArrayList<>(customersList);
        Collections.sort(list, new Comparator<SubjectCustomer>() {
            @Override
            public int compare(SubjectCustomer o1, SubjectCustomer o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        return list;
    }
    List<SubjectCustomer> getListByDiapasonCreaditCard(int diapazonStart, int diapazonEnd) {
        List<SubjectCustomer> list = new ArrayList<>();
        for (SubjectCustomer c : customersList) {
            if (c.getNumcard() >= diapazonStart && c.getNumcard() <=diapazonEnd) {
                list.add(c);
            }
        }
        return list;
    }
}
