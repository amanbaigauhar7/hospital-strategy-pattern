
package hospital;

public class Hospital {

    private AdmissionStrategy strategy;

    public Hospital(AdmissionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AdmissionStrategy strategy) {
        this.strategy = strategy;
    }

    public void admit(String patientName) {
        strategy.admitPatient(patientName);
    }
}
