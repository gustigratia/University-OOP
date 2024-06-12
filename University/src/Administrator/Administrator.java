package Administrator;
import Employee.Employee;

public class Administrator extends Employee {
    // Attributes
    private String adminRole;
    private double budgetResponsibility;

    // Constructor
    public Administrator(String name, int id, String department, double salary,
                         String adminRole, double budgetResponsibility){
        super(name,id,department,salary);
        this.adminRole = adminRole;
        this.budgetResponsibility = budgetResponsibility;
    }

    // Other methods
    @Override
    public void printReport(){
        System.out.println("===========Data Karyawan===========" );
        System.out.printf("Nama\t\t: %s\n", this.name);
        System.out.printf("ID\t\t\t: %d\n", this.id);
        System.out.printf("Departemen\t: %s\n", this.department);
        System.out.printf("Gaji\t\t: Rp%.0f\n", this.salary);
        System.out.printf("Wewenang\t: %s\n", this.adminRole);
        System.out.printf("Anggaran\t: Rp%.0f\n", this.budgetResponsibility);
    }

    public double calculateBudgetVariance(){
        return budgetResponsibility * 0.05;
    }
}










