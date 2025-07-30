package shubhu.Office;

public class EmployeesDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Shubham", 22, 122200);
        System.out.println(emp1.getEmployeeDetails());
        emp1.setEmpSalary(2546654);
        emp1.setEmpName("ahaha");
        System.out.println(emp1.getEmployeeDetails());
    }
}
