
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class HospitalInformationSystem {
    private static final String PATIENTS_FILE = "patients.txt";
    private List<Patient> patients = new ArrayList();

    public HospitalInformationSystem() {
    }

    private void loadPatientsFromFile() {
        try {
            BufferedReader var1;
            String var2;
            Patient var9;
            for (var1 = new BufferedReader(
                    new FileReader("patients.txt")); (var2 = var1.readLine()) != null; this.patients.add(var9)) {
                String[] var3 = var2.split(",");
                String var4 = var3[0];
                int var5 = Integer.parseInt(var3[1]);
                String var6 = var3[2];
                int var7 = Integer.parseInt(var3[3]);
                boolean var8 = Integer.parseInt(var3[4]) == 1;
                var9 = new Patient(var4, var5, var6, var7);
                if (var8) {
                    var9.admit();
                }
            }

            var1.close();
        } catch (IOException var10) {
            System.out.println("An error occurred while loading patient data.");
        }

    }

    private void savePatientsToFile() {
        try {
            BufferedWriter var1 = new BufferedWriter(new FileWriter("patients.txt"));
            Iterator var2 = this.patients.iterator();

            while (var2.hasNext()) {
                Patient var3 = (Patient) var2.next();
                var1.write(var3.toString());
                var1.newLine();
            }

            var1.close();
        } catch (IOException var4) {
            System.out.println("An error occurred while saving patient data.");
        }

    }

    public void admitPatient(String var1, int var2, String var3, int var4) {
        Patient var5 = new Patient(var1, var2, var3, var4);
        var5.admit();
        this.patients.add(var5);
        this.savePatientsToFile();
    }

    public void dischargePatient(int var1) {
        Iterator var2 = this.patients.iterator();

        while (var2.hasNext()) {
            Patient var3 = (Patient) var2.next();
            if (var1 == var3.getPatientId()) {
                var3.discharge();
                break;
            }
        }

        this.savePatientsToFile();
    }

    public void displayAllPatients() {
        System.out.println("Hospital Information System - All Patients");
        Iterator var1 = this.patients.iterator();

        while (var1.hasNext()) {
            Patient var2 = (Patient) var1.next();
            var2.displayInfo();
            System.out.println("----------------------");
        }

    }
}
