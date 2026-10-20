
package hospital;

public class RegularAdmission implements AdmissionStrategy {

    @Override
    public void admitPatient(String patientName) {
        System.out.println(
                "Regular admission: " + patientName
        );
    }
}
