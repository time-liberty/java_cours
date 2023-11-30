import java.time.LocalDate;

public class Fish extends Animal{
    public Fish(){super();}
    public Fish(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);

    }

    @Override
    public String getName() {
        return name;
    }

    public void toGo(){
        System.out.println("no run");
    }
    public void fly(){
        System.out.println("no flying");
    }
}
