package packJava;

import javax.inject.Inject;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "patientBean")
@RequestScoped
public class PatientBean {

    @Inject
    DataAccessPatient dao;

    private long id;
    private String firstName;
    private String lastName;
    private String medicalCondition;
    private String scaleOfPain;
    private String bloodType;
    private Patient patient;

    public PatientBean() {
        patient = new Patient();
    }

    public DataAccessPatient getDao() {
        return dao;
    }

    public void setDao(DataAccessPatient dao) {
        this.dao = dao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getScaleOfPain() {
        return scaleOfPain;
    }

    public void setScaleOfPain(String scaleOfPain) {
        this.scaleOfPain = scaleOfPain;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String addPatient() {
        dao.addPatient(patient);
        return "registrationConfirmation";
    }

}
