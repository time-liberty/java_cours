public interface Swimable {
    void Swim();
    default double getSwimSpeeed(){
        return 2.5;
    };

}
