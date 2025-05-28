package Team.JUnit;

import Team.domain.Employee;
import Team.service.NameListService;
import Team.service.TeamException;
import org.junit.Test;

public class NameListServiceTest {

    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();

        Employee[] employees = nameListService.getAllEmployees();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
