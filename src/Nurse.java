import java.time.LocalDate;
import java.util.Date;

public class Nurse extends Personal {

    private Boolean accessToPharmacy = false; // имеет ли доступ к аптеке
    public Nurse(String name, LocalDate dateOfBirth, String specialization, String address, Boolean accessToPharmacy) {
        super(name, dateOfBirth, specialization, address);
        this.accessToPharmacy = accessToPharmacy;
    }

    @Override
    protected void toAction() {
        System.out.println("Медсестра " + getName() + " выполняет процедуру");
    }

    public String getAccessToPharmacy() {
        if(!accessToPharmacy)
            return "Медсестра " + getName() + " не имеет доступа к аптеке";
        else
            return "Медсестра " + getName() + " имеет доступ к аптеке";
    }

    public void setAccessToPharmacy(Boolean accessToPharmacy) {
        this.accessToPharmacy = accessToPharmacy;
    }
}