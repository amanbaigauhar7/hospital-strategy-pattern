
package hospital;

public class AdmissionProcessorBeforeRefactoring {

 public void admitPatient(String patientName, String condition) {
  switch (condition.toLowerCase()) {
   case "emergency":
    System.out.println("Emergency admission: " + patientName);
    break;

   case "referral":
    System.out.println("Referral admission: " + patientName);
    break;

   default:
    System.out.println("Regular admission: " + patientName);
    break;
  }
 }
}
