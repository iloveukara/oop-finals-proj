
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Main {
    private static int patientId;

    public Main() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        HospitalInformationSystem var2 = new HospitalInformationSystem();
        patientId = 2000;

        int var3;
        do {
            System.out.println("Hospital Information System");
            System.out.println("1. Admit Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display All Patients");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            var3 = var1.nextInt();
            switch (var3) {
                case 1:
                    System.out.print("Enter patient name: ");
                    var1.nextLine();
                    String var4 = var1.nextLine();
                    System.out.print("Enter patient age: ");
                    int var5 = var1.nextInt();
                    System.out.print("Enter patient gender: ");
                    var1.nextLine();
                    String var6 = var1.nextLine();
                    System.out.println("Patient ID: " + patientId);
                    var2.admitPatient(var4, var5, var6, patientId++);
                    System.out.println("Patient admitted successfully!");
                    break;
                case 2:
                    System.out.print("Enter patient ID to discharge: ");
                    int var7 = var1.nextInt();
                    var2.dischargePatient(var7);
                    System.out.println("Patient discharged successfully!");
                    break;
                case 3:
                    var2.displayAllPatients();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        } while (var3 != 4);

        savePatientsToFile();
        System.out.println("_________________________________");
        loadPatientsFromFile();
    }

    private static void loadPatientsFromFile() {
    }

    private static void savePatientsToFile() {
    }
}
