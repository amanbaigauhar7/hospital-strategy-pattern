
package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TreatmentStrategyTest {

    @Test
    void medicationStrategyWorks() {
        TreatmentStrategy strategy = new MedicationTreatment();

        assertInstanceOf(MedicationTreatment.class, strategy);
    }

    @Test
    void physiotherapyStrategyWorks() {
        TreatmentStrategy strategy = new PhysiotherapyTreatment();

        assertInstanceOf(PhysiotherapyTreatment.class, strategy);
    }

    @Test
    void surgicalStrategyWorks() {
        TreatmentStrategy strategy = new SurgicalTreatment();

        assertInstanceOf(SurgicalTreatment.class, strategy);
    }
}
