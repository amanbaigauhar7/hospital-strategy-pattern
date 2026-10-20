
package hospital;

public class MedicationTreatment implements TreatmentStrategy {

    @Override
    public void treatPatient(String patientName) {
        System.out.println("Medication treatment for " + patientName);
        System.out.println("Prescribing medicine and monitoring dosage.");
    }
}
