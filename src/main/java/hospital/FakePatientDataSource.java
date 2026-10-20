
package hospital;

public class FakePatientDataSource implements PatientDataSource {

    @Override
    public String getPatientCondition(String patientName) {
        switch (patientName.toLowerCase()) {
            case "aruzhan":
                return "emergency";

            case "dias":
                return "referral";

            default:
                return "regular";
        }
    }
}
