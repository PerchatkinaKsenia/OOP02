import java.time.LocalDate;
import java.util.Date;

public abstract class Personal {

    protected String name;
    protected LocalDate dateOfBirth;
    protected String specialization;
    protected String address = null;

    public Personal(String name, LocalDate dateOfBirth, String specialization, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.specialization = specialization;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", specialization='" + specialization + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    protected abstract void toAction();
}