package StaffMember;
import Employee.Employee;

public class StaffMember extends Employee {
    // Attributes
    private String jobTitle;
    private int workHours;

    // Constructor
    public StaffMember(String name, int id, String department, double salary,
                       String jobTitle, int workHours){
        super(name, id, department, salary);
        this.jobTitle = jobTitle;
        this.workHours = workHours;
    }

    // Other methods
    public double calculateOvertimePay(){
        if(workHours > 40){
            int overTime = workHours - 40;
            return 0.03 * this.salary;
        } else return 0;
    }

    @Override
    public void printReport(){
        System.out.println("===========Data Karyawan===========" );
        System.out.printf("Nama\t\t: %s\n", this.name);
        System.out.printf("ID\t\t\t: %d\n", this.id);
        System.out.printf("Departemen\t: %s\n", this.department);
        System.out.printf("Gaji pokok\t: Rp%.0f\n", this.salary);
        System.out.printf("Gaji total\t: Rp%.0f\n", this.salary + calculateOvertimePay());
        System.out.printf("Jabatan\t\t: %s\n", this.jobTitle);
        System.out.printf("Jam kerja\t: %d\n", this.workHours);
    }
}





