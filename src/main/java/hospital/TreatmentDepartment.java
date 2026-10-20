
package hospital;

public class TreatmentDepartment {
    private TreatmentStrategy strategy;

    public TreatmentDepartment(TreatmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TreatmentStrategy strategy) {
        this.strategy = strategy;
    }

    public void treat(String patientName) {
        strategy.treatPatient(patientName);
    }
}
