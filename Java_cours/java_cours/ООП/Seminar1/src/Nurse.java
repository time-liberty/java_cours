public class Nurse extends Personnel{
    @Override
    public String getNamePersonnel() {
        return namePersonnel;
    }

    @Override
    public String getSurnamePersonnel() {
        return surnamePersonnel;
    }
    public void injection(){
        System.out.println("give an injection");
    }
}
