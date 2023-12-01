import java.time.LocalDate;

public class Eagle extends Animal implements Flyable{
    public Eagle(){
        super();
    }
    public Eagle(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    public void toGo(){
        System.out.println("no run");
    }
    public void swim(){
        System.out.println("no swiming");
    }

    @Override
    public void Fly() {

    }
}
