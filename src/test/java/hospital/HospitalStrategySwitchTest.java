
package hospital;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HospitalStrategySwitchTest {

    @Test
    void canSwitchAdmissionStrategyAtRuntime() {
        Hospital hospital = new Hospital(new EmergencyAdmission());

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;

        try {
            System.setOut(new PrintStream(output));

            hospital.admit("Aruzhan");
            hospital.setStrategy(new RegularAdmission());
            hospital.admit("Aruzhan");

        } finally {
            System.setOut(originalOutput);
        }

        String result = output.toString();

        assertTrue(result.contains("Emergency admission: Aruzhan"));
        assertTrue(result.contains("Regular admission: Aruzhan"));
    }
}
