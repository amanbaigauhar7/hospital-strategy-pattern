
package hospital;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== PATIENT ADMISSION ===");

        Hospital hospital = new Hospital(new EmergencyAdmission());
        String patientName = "Aruzhan";

        System.out.println("\nManual strategy selection:");

        hospital.setStrategy(new EmergencyAdmission());
        hospital.admit(patientName);

        hospital.setStrategy(new RegularAdmission());
        hospital.admit(patientName);

        hospital.setStrategy(new ReferralAdmission());
        hospital.admit(patientName);

        System.out.println("\nSelector selection:");

        AdmissionSelector admissionSelector = new AdmissionSelector();
        AdmissionStrategy selectedAdmission =
                admissionSelector.selectStrategy("emergency");

        hospital.setStrategy(selectedAdmission);
        hospital.admit("Dias");

        System.out.println("\nAutomatic selection using patient data:");

        PatientDataSource dataSource = new FakePatientDataSource();

        AdmissionService admissionService =
                new AdmissionService(dataSource, admissionSelector);

        admissionService.admitPatient(hospital, "Aruzhan");
        admissionService.admitPatient(hospital, "Dias");

        System.out.println("\n=== TREATMENT STRATEGIES ===");

        TreatmentDepartment department =
                new TreatmentDepartment(new MedicationTreatment());

        String treatmentPatient = "Aruzhan";

        department.setStrategy(new MedicationTreatment());
        department.treat(treatmentPatient);

        department.setStrategy(new PhysiotherapyTreatment());
        department.treat(treatmentPatient);

        department.setStrategy(new SurgicalTreatment());
        department.treat(treatmentPatient);

        System.out.println("\nTreatment selector:");

        TreatmentSelector treatmentSelector = new TreatmentSelector();

        TreatmentStrategy selectedTreatment =
                treatmentSelector.selectStrategy("physiotherapy");

        department.setStrategy(selectedTreatment);
        department.treat("Dias");
    }
}
