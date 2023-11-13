
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

class Patient extends Person {
    private int patientId;
    private boolean isAdmitted;

    public Patient(String var1, int var2, String var3, int var4) {
        super(var1, var2, var3);
        this.patientId = var4;
        this.isAdmitted = false;
    }

    public int getPatientId() {
        return this.patientId;
    }

    public void admit() {
        this.isAdmitted = true;
    }

    public void discharge() {
        this.isAdmitted = false;
    }

    public boolean isAdmitted() {
        return this.isAdmitted;
    }

    public void displayInfo() {
        System.out.println("Patient Information");
        int var10001 = this.patientId;
        System.out.println("Patient ID: " + var10001);
        PrintStream var10000 = System.out;
        String var1 = this.getName();
        var10000.println("Name: " + var1);
        var10000 = System.out;
        var10001 = this.getAge();
        var10000.println("Age: " + var10001);
        var10000 = System.out;
        var1 = this.getGender();
        var10000.println("Gender: " + var1);
        System.out.println("Admitted: " + (this.isAdmitted ? "Yes" : "No"));
    }

    public String toString() {
        String var10000 = this.getName();
        return var10000 + "," + this.getAge() + "," + this.getGender() + "," + this.patientId + ","
                + (this.isAdmitted ? "1" : "0");
    }
}
