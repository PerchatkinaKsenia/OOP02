import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Vasy", LocalDate.of(1991, 1, 5), new ArrayList<>(), "Coty", "King", 4);
        System.out.println(vasy);
        System.out.println(vasy.getLegsCount());
        Animal eagle = new Eagle("Papi", LocalDate.of(1991, 1, 5), new ArrayList<>(), "Coty", "King");


        List<Animal> animals = new ArrayList<>();
        animals.add(vasy);
        animals.add(eagle);
        Duck duck = new Duck("Rex", LocalDate.of(1940, 2, 1), new ArrayList<>(), "Bigi", "Popai");
        Penguin penguin = new Penguin("Moty", LocalDate.of(1990, 2, 23), new ArrayList<>(), "Bigi", "Gosha");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(vasy, eagle, penguin, duck, new Fish("Dory", LocalDate.of(1999, 5, 2), new ArrayList<>(), "Bigi", "Petr"));
        System.out.println(clinic.getPatients());

        System.out.println(clinic.getGoables());
        System.out.println(clinic.getFlyble());
        System.out.println(clinic.getSwimble());

        // персонал клиники и проверка методов работы с персоналом
        System.out.println("---------------------------------");

        Nurse nurse1 = new Nurse("Елена", LocalDate.of(1992, 3, 1),
                "Диетолог", "СПБ 1", true);

        Doctor doctor1 = new Doctor("Виктор", LocalDate.of(1989,4, 25),
                "Травматолог", "СПБ 2", null ); // без медсестры

        Doctor doctor2 = new Doctor("Владимир", LocalDate.of(1985, 12, 15),
                "Диетолог", "СПБ 3", nurse1); // с медсестрой Еленой
        clinic.addPersonal(doctor1, doctor2, nurse1); // добавляем персонал клиники

        System.out.println(clinic.getAllDoctors()); // выводим всех докторов
        System.out.println(clinic.getAllNurses()); // выводим всех медсестер

        doctor1.toAction(); // проверка переопределенного абстрактного метода
        nurse1.toAction();
        System.out.println(nurse1.getAccessToPharmacy()); // проверка наличия прав у сестры к аптеке

    }
}