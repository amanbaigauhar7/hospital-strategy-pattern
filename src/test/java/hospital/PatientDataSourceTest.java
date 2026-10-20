
package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatientDataSourceTest {

    @Test
    void returnsEmergencyForAruzhan() {
        PatientDataSource dataSource = new FakePatientDataSource();

        String condition = dataSource.getPatientCondition("Aruzhan");

        assertEquals("emergency", condition);
    }

    @Test
    void returnsReferralForDias() {
        PatientDataSource dataSource = new FakePatientDataSource();

        String condition = dataSource.getPatientCondition("Dias");

        assertEquals("referral", condition);
    }

    @Test
    void returnsRegularForUnknownPatient() {
        PatientDataSource dataSource = new FakePatientDataSource();

        String condition = dataSource.getPatientCondition("Unknown");

        assertEquals("regular", condition);
    }
}
