package FacultyMember;

import Employee.Employee;

public class FacultyMember extends Employee {
    // Child attributes
    private String researchArea;
    private int numOfPublications;
    private int teachingLoad;

    // Constructor
    public FacultyMember(String name, int id, String department, double salary,
                         String researchArea, int numOfPublications, int teachingLoad){
        super(name,id,department,salary);
        this.researchArea = researchArea;
        this.numOfPublications = numOfPublications;
        this.teachingLoad = teachingLoad;
    }

    // Child method
    public double calculateResearchBonus(){
        return this.numOfPublications*1000000;
    }

    // Override parent method
    @Override
    public void printReport(){
        System.out.println("===============Data Karyawan===============" );
        System.out.printf("Nama\t\t\t\t: %s\n", this.name);
        System.out.printf("ID\t\t\t\t\t: %d\n", this.id);
        System.out.printf("Departemen\t\t\t: %s\n", this.department);
        System.out.printf("Gaji pokok\t\t\t: Rp%.0f\n", this.salary);
        System.out.printf("Gaji total\t\t\t: Rp%.0f\n", this.salary + calculateResearchBonus());
        System.out.printf("Research area\t\t: %s\n", this.researchArea);
        System.out.printf("Num of publications\t: %d\n", this.numOfPublications);
        System.out.printf("Teaching load\t\t: %d\n", this.teachingLoad);
    }


}







