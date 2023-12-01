import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    public List<Animal> getPatients(){
        return patients;
    }
//    public void addPatients(Animal patient){
//        patients.add(patient);
//    }
    public VeterinaryClinic addPatients(Animal patient){
        patients.add(patient);
        return this;
    }
    public void removePatients(Animal patient){
        patients.remove(patient);
    }
    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }

        }
        return result;
    }
    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Flyable){
                result.add((Flyable) animal);
            }

        }
        return result;
    }
    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }

        }
        return result;
    }


}