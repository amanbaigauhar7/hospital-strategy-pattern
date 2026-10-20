
package hospital;

public class SurgicalTreatment implements TreatmentStrategy {

    @Override
    public void treatPatient(String patientName) {
        System.out.println("Surgical treatment for " + patientName);
        System.out.println("Preparing the patient for surgery and post-operative care.");
    }
}
