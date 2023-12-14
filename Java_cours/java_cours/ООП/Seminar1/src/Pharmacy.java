import java.util.ArrayList;
                 import java.util.Iterator;
                 import java.util.List;
import java.util.Objects;


public class Pharmacy implements Iterator<PharmacyComponent>, Comparable<Pharmacy> {

    private int price;

    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmacyComponent component) {
        components.add(component);
        return this;
    }

    public List<PharmacyComponent> getComponents() {
        return components;
    }

    public void setComponents(List<PharmacyComponent> components) {
        this.components = components;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    public Iterator<PharmacyComponent> iterator() {
        return new Iterator<PharmacyComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public PharmacyComponent next() {
                return components.get(index++);
            }
        };

    }


    @Override
    public int compareTo(Pharmacy o) {
        if (this.price < o.price) {
            return -1;
        } else if (this.price > o.price) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public PharmacyComponent next() {
        return null;
    }

//    public boolean equals(Object o){
//        if (this ==o) return true;
//        if (o == null|| getClass() != o.getClass()) return false;
//        Pharmacy pharmacy = (Pharmacy) o;
//        return name == pharmacy.name;
//        return w
//    }
}