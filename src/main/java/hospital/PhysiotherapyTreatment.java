
package hospital;

public class PhysiotherapyTreatment implements TreatmentStrategy {

    @Override
    public void treatPatient(String patientName) {
        System.out.println("Physiotherapy treatment for " + patientName);
        System.out.println("Planning physical exercises and recovery sessions.");
    }
}
