package shubhu.Office;

class Employee {

    private String empName ;
    private int empAge ;
    private int empSalary;

    Employee(String empName,int empAge,int empSalary){
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;

    }
    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int empAge){
        this.empAge = empAge;   
    }

    public int getEmpSalary(){
        return empSalary;
    }

    public void setEmpSalary(int empSalary){
        this.empSalary = empSalary;
    }

    String getEmployeeDetails(){
        return "Employees Name : "+ empName +" Age :"+ empAge +" Salary : " + empSalary ;
    
    }



}
