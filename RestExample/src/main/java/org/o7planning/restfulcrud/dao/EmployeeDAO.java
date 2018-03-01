package org.o7planning.restfulcrud.dao;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import org.o7planning.restfulcrud.model.Employee;
 
public class EmployeeDAO {
 
    private static final Map<String, Employee> empMap = new HashMap<String, Employee>();
 
    static {
        initEmps();
    }
 
    private static void initEmps() {
        Employee emp1 = new Employee("6065653", "Mounika", "TechIntern");
        Employee emp2 = new Employee("6065660", "Subhadra", "TechIntern");
        Employee emp3 = new Employee("6065654", "Kumar,Prashanth", "TechIntern");
 
        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
    }
 
    public static Employee getEmployee(String empNo) {
        return empMap.get(empNo);
    }
 
    public static Employee addEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static Employee updateEmployee(Employee emp) {
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }
 
    public static void deleteEmployee(String empNo) {
        empMap.remove(empNo);
    }
 
    public static List<Employee> getAllEmployees() {
        Collection<Employee> c = empMap.values();
        List<Employee> list = new ArrayList<Employee>();
        list.addAll(c);
        return list;
    }
     
    List<Employee> list;
 
}
