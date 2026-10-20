
package hospital;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class TreatmentStrategyParameterizedTest {

    static Stream<TreatmentStrategy> treatmentStrategies() {
        return Stream.of(
                new MedicationTreatment(),
                new PhysiotherapyTreatment(),
                new SurgicalTreatment()
        );
    }

    @ParameterizedTest
    @MethodSource("treatmentStrategies")
    void everyTreatmentStrategyHasCorrectType(TreatmentStrategy strategy) {
        assertInstanceOf(TreatmentStrategy.class, strategy);
    }
}
