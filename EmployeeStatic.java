 class EmployeeStatic {
    static String companyName = "TCS";

    String empName = "Ram";
    int salary = 25000;
 
    public static void companyInfo()
    {
        System.out.println("Company Name: " + companyName);
    }
    public void employeeInfo()
    {
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String args[])
    {
        

        System.out.println("Company: " + EmployeeStatic.companyName);
        EmployeeStatic.companyInfo();

        
        EmployeeStatic ref;
        ref = new EmployeeStatic();
        ref.employeeInfo();
    }
}
