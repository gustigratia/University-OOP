package Employee;

public class Employee {
    // Attributes
    protected String name;
    protected int id;
    protected String department;
    protected double salary;

    // Constructor
    public Employee(String name, int id, String department, double salary){
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Getter methods
    public String getName(){
        return this.name;
    }
    public int getID(){
        return this.id;
    }
    public String getDepartment(){
        return this.department;
    }
    public double getSalary(){
        return this.salary;
    }

    // Setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Other methods
    public void printReport(){
        System.out.println("===========Data Karyawan===========" );
        System.out.printf("Nama\t\t: %s\n", this.name);
        System.out.printf("ID\t\t\t: %d\n", this.id);
        System.out.printf("Departemen\t: %s\n", this.department);
        System.out.printf("Gaji\t\t: Rp%.0f\n", this.salary);
    }

    public double calculateSalary(){
        return this.salary;
    }
}













