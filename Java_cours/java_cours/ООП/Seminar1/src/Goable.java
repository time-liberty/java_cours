public interface Goable {
    public static final String type = "Goable";
    void run();
    default double getRunSpeeed(){
        return 5.5;
    };

}
