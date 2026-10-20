
package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TreatmentSelectorTest {

    @Test
    void selectsMedicationForMedicationType() {
        TreatmentSelector selector = new TreatmentSelector();

        TreatmentStrategy strategy = selector.selectStrategy("medication");

        assertInstanceOf(MedicationTreatment.class, strategy);
    }

    @Test
    void selectsPhysiotherapyForPhysiotherapyType() {
        TreatmentSelector selector = new TreatmentSelector();

        TreatmentStrategy strategy = selector.selectStrategy("physiotherapy");

        assertInstanceOf(PhysiotherapyTreatment.class, strategy);
    }

    @Test
    void selectsSurgeryForSurgeryType() {
        TreatmentSelector selector = new TreatmentSelector();

        TreatmentStrategy strategy = selector.selectStrategy("surgery");

        assertInstanceOf(SurgicalTreatment.class, strategy);
    }

    @Test
    void selectsMedicationForUnknownType() {
        TreatmentSelector selector = new TreatmentSelector();

        TreatmentStrategy strategy = selector.selectStrategy("unknown");

        assertInstanceOf(MedicationTreatment.class, strategy);
    }
}
