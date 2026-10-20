
package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class AdmissionStrategyTest {

    @Test
    void emergencyConditionSelectsEmergencyAdmission() {
        AdmissionSelector selector = new AdmissionSelector();

        AdmissionStrategy strategy = selector.selectStrategy("emergency");

        assertInstanceOf(EmergencyAdmission.class, strategy);
    }

    @Test
    void referralConditionSelectsReferralAdmission() {
        AdmissionSelector selector = new AdmissionSelector();

        AdmissionStrategy strategy = selector.selectStrategy("referral");

        assertInstanceOf(ReferralAdmission.class, strategy);
    }

    @Test
    void regularConditionSelectsRegularAdmission() {
        AdmissionSelector selector = new AdmissionSelector();

        AdmissionStrategy strategy = selector.selectStrategy("regular");

        assertInstanceOf(RegularAdmission.class, strategy);
    }
}
