
package hospital;

public class ReferralAdmission implements AdmissionStrategy {

    @Override
    public void admitPatient(String patientName) {
        System.out.println(
                "Referral admission: " + patientName
        );
    }
}
