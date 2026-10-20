
package hospital;

public class EmergencyAdmission implements AdmissionStrategy {

    @Override
    public void admitPatient(String patientName) {
        System.out.println(
                "Emergency admission: " + patientName
        );
    }
}
