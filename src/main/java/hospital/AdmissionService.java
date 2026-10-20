
package hospital;

public class AdmissionService {
    private final PatientDataSource dataSource;
    private final AdmissionSelector selector;

    public AdmissionService(
            PatientDataSource dataSource,
            AdmissionSelector selector) {
        this.dataSource = dataSource;
        this.selector = selector;
    }

    public void admitPatient(Hospital hospital, String patientName) {
        String condition = dataSource.getPatientCondition(patientName);
        AdmissionStrategy strategy = selector.selectStrategy(condition);

        hospital.setStrategy(strategy);
        hospital.admit(patientName);
    }
}
