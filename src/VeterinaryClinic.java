import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();  // список пациентов
    private List<Personal> personals = new ArrayList<>(); // список персонала

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){
        Collections.addAll(patients, animals);
    }
    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

    // Получение всех плавающих животных
    public List<Swimble> getSwimble(){
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimble)
                result.add((Swimble) animal);
        }
        return result;
    }

    // Получение всех летающих животных
    public List<Flyble> getFlyble(){
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyble)
                result.add((Flyble) animal);
        }
        return result;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    // Методы работы с персоналом клиники
    public List<Personal> getPersonal() { // получение списка сотрудников клиники
        return personals;
    }

    public void addPersonal(Personal personal){ // Добавление одного сотрудника
        personals.add(personal);
    }
    public void addPersonal(Personal ... personal){ // Добавление нескольких сотрудников
        Collections.addAll(personals, personal);
    }

    public List<Doctor> getAllDoctors(){ // Получение всех докторов клиники
        List<Doctor> result = new ArrayList<>(personals.size());
        for (Personal personal:personals) {
            if(personal instanceof Doctor)
                result.add((Doctor) personal);
        }
        return result;
    }
    public List<Nurse> getAllNurses(){ // Получение всех медсестер клиники
        List<Nurse> result = new ArrayList<>(personals.size());
        for (Personal personal:personals) {
            if(personal instanceof Nurse)
                result.add((Nurse) personal);
        }
        return result;
    }



}