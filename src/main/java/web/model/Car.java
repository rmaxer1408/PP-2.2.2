package web.model;

public class Car {
    private String model;
    private Transmission transmission;
    private Color color;

    public Car() {}

    public Car(String model, Transmission transmission, Color color) {
        this.model = model;
        this.transmission = transmission;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", transmission=" + transmission +
                ", color=" + color +
                '}';
    }
}
