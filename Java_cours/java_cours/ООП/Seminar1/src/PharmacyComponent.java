import java.lang.module.FindException;

public class PharmacyComponent implements Comparable<PharmacyComponent>{
    private String name;
    private String weight;
    private int power;
    public PharmacyComponent(String name,String weight,int power){

        this.power = power;
        this.name = name;
        this.weight = weight;

    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PharmacyComponent{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}' ;
    }
    public int compareTo(PharmacyComponent o) {
        if (this.power > o.power){
            return -1;
        } else if (this.power < o.power){
            return 1;
        }
        return 0;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || hashCode() != o.hashCode()) return false;
        PharmacyComponent pharmacy = (PharmacyComponent) o;
        return (power == pharmacy.power);


    }



}
