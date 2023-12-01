public abstract class Personnel {
    public String namePersonnel;
    public String surnamePersonnel;
    public String post;

    public Personnel(){
    }
    public Personnel(String namePersonnel,String surnamePersonnel,String post) {
        this.namePersonnel = namePersonnel;
        this.surnamePersonnel = surnamePersonnel;
        this.post = post;

    }
    public void setNamePersonnel(String name){
        this.namePersonnel = namePersonnel;
    }
    public abstract String getNamePersonnel();
    public void setSurnamePersonnel(String name){
        this.surnamePersonnel = surnamePersonnel;
    }
    public abstract String getSurnamePersonnel();

    private void goToJob(){
        System.out.println("on Job");
    }
    private void toWork(){
        System.out.println("Woriking");
    }
    private void goToHome(){
        System.out.println("going to home");
    }


}

