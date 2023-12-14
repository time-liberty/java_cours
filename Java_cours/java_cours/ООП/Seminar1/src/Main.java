import java.time.LocalDate;
import java.util.*;

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

        PharmacyComponent azitroment = new Azitronit("Azitronit", "10 Мг", 50);
        PharmacyComponent azitroment1 = new Azitronit("Azitronit", "10 Мг", 50);
        PharmacyComponent pinicilin = new Pinicilin("Pinicilin", "10 Мг", 120);
        PharmacyComponent water = new Water("Water", "10 Мг", 20);
        PharmacyComponent water2 = new Water("Water", "10 Мг", 20);

        List<PharmacyComponent> pharmancyComponents = new ArrayList<>();
        pharmancyComponents.add(azitroment);
        pharmancyComponents.add(water2);
        pharmancyComponents.add(water);
        pharmancyComponents.add(pinicilin);

        System.out.println(pharmancyComponents);

        Collections.sort(pharmancyComponents);
        System.out.println(pharmancyComponents);

        Pharmacy pharmacy = new Pharmacy().addComponent(azitroment).addComponent(water);
        Pharmacy pharmacy1 = new Pharmacy().addComponent(pinicilin).addComponent(water);
Pharmacy pharmacy2 = new Pharmacy().addComponent(pinicilin).addComponent(azitroment);
Pharmacy pharmacy3 = new Pharmacy().addComponent(azitroment).addComponent(water);
        for (Pharmacy it = pharmacy1; it.hasNext(); ) {
            PharmacyComponent comp = it.next();
            System.out.println(comp.getName());
        }


        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(pharmacy);
        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);
        System.out.println(pharmacies);
//for (Pharmacy pharmacy : pharmacies){
//    System.out.println(pharmacy);
//}




        Set<PharmacyComponent> set = new HashSet<>();
        set.add(azitroment);
        set.add(azitroment1);
        set.add(azitroment);

        System.out.println("/////////////////////////");
        System.out.println(set);
        Set<Pharmacy> result = new HashSet<>(pharmacies);


        System.out.println(result.size());


        //Collections.sort(pharmacies, new );


        //Iterator<PharmancyComponent> iterator = pharmacy1;

//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        while (((Iterator<PharmancyComponent>) pharmacy1).hasNext()) {
//            System.out.println(((Iterator<PharmancyComponent>) pharmacy1).next());
//        }

    }



    }
