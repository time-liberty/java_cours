import java.time.LocalDate;

public class Lion extends Animal implements Goable{
    public Lion(){super();}
    public Lion(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    public void swim(){
        System.out.println("no swiming");
    }
    public void fly(){
        System.out.println("no flying");
    }

    @Override
    public void run() {
        return;
    }
}
