package domain;

import java.util.Objects;

public abstract class Vehicle implements Comparable<Vehicle>{

    private String license;
    private String model;
    private int maxSpeed;

    public Vehicle(String license, String model, int maxSpeed) {
        this.license = license;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void modifyLicense(String license){
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int hashCode() {
        return license.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!this.license.equals(other.getLicense())){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return license;
    }

    @Override
    public int compareTo(Vehicle other) {
        return maxSpeed - other.getMaxSpeed();
    }
}
