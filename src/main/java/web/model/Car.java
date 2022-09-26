package web.model;

public class Car {

    private final int id;
    private final String model;
    private final int series;

    public Car(int id,String model,int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getId() != car.getId()) return false;
        if (getSeries() != car.getSeries()) return false;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getModel().hashCode();
        result = 31 * result + getSeries();
        return result;
    }
}
