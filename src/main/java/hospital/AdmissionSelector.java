
package hospital;

public class AdmissionSelector {

    public AdmissionStrategy selectStrategy(String condition) {
        switch (condition.toLowerCase()) {
            case "emergency":
                return new EmergencyAdmission();

            case "referral":
                return new ReferralAdmission();

            default:
                return new RegularAdmission();
        }
    }
}
