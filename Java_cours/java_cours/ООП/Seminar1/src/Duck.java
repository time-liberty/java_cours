import java.time.LocalDate;

public class Duck extends Animal{
    public Duck() {super();}
    public Duck(String name, Illness illness, String ownerName, LocalDate birthday){
        super(name, illness, ownerName, birthday);
    }

    @Override
    public String getName() {
        return name;
    }
}
