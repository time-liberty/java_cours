import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); //экземпляр класса
        cat.setName("barsic");
        System.out.println(cat.getName());
        Dog dog = new Dog("max",new Chumka("chumka"), "petr",
                LocalDate.of(3,12,21));
        System.out.println(dog.getName());
        System.out.println(dog.getIllness());
        dog.getIllness().heal();
//        dog.toWakeUp("13:22");
//        cat.toWakeUp();
        ArrayList <Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        cat.liveCycle();
        dog.breathe();
        Lion lion = new Lion();
        lion.swim();
        Fish fish = new Fish();
        fish.fly();
        Eagle eagle = new Eagle();
        Otter otter = new Otter();
        Sparrow sparrow = new Sparrow();
        Duck duck = new Duck();
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(cat).addPatients(dog).addPatients(fish).addPatients(eagle).addPatients(sparrow).addPatients(otter).addPatients(duck);
        //System.out.println(clinic.getPatients());
        System.out.println(clinic.getGoable());
        Doctor doctor = new Doctor();
        ArrayList<Personnel> personnels = new ArrayList<>();
        doctor.setNamePersonnel("Vova");
        Personnel nurse = new Nurse();
        nurse.setSurnamePersonnel("lida");
        System.out.println(clinic.getFlyable());



    }
}