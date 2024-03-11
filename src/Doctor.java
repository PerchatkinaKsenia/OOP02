import java.time.LocalDate;
import java.util.Date;

public class Doctor extends Personal {

    private Nurse nurse = null;

    public Doctor(String name, LocalDate dateOfBirth, String specialization, String address, Nurse nurse) {
        super(name, dateOfBirth, specialization, address);
        this.nurse = nurse;
    }

    @Override
    protected void toAction() {
        System.out.println("Доктор " + getName() + " лечит");
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
}