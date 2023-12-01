public class Doctor extends Personnel{
    @Override
    public String getNamePersonnel() {
        return namePersonnel;
    }

    @Override
    public String getSurnamePersonnel() {
        return surnamePersonnel;
    }
    public void reception(){
        System.out.println("start reception");
    }
}

