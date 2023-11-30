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
}