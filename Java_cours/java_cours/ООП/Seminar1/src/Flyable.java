public interface Flyable {
    void Fly();
    default double getFlySpeeed(){
        return 10.5;
    };
}
