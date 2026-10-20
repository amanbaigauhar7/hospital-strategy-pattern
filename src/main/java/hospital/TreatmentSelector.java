
package hospital;

public class TreatmentSelector {

    public TreatmentStrategy selectStrategy(String treatmentType) {
        switch (treatmentType.toLowerCase()) {
            case "medication":
                return new MedicationTreatment();

            case "physiotherapy":
                return new PhysiotherapyTreatment();

            case "surgery":
                return new SurgicalTreatment();

            default:
                return new MedicationTreatment();
        }
    }
}
