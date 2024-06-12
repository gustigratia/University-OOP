package University;

import Administrator.Administrator;
import Employee.Employee;
import FacultyMember.FacultyMember;
import StaffMember.StaffMember;

public class University {
    public static void main(String[] args) {
        Employee rusdianto = new Employee("Agus Rusdianto", 2413,
                "Teknik Nuklir", 7000000);
        FacultyMember budiono = new FacultyMember("Budiono Siregar", 2552,
                "Teknik Kelautan", 10000000, "Engineering", 12, 10);
        StaffMember jovita = new StaffMember("Jovita Marcus", 2598,
                "Teknik Perikanan", 5000000, "Petugas Kebersihan", 45);
        Administrator farrel = new Administrator("Farrel Ganendra", 2105,
                "Teknik Mesin", 4500000, "Kepala TU", 40000000);


        rusdianto.printReport();
        budiono.printReport();
        jovita.printReport();
        farrel.printReport();

    }
}
