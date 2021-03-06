package com.prueba.carro;

public class Resultado {

    private String id;
    private String brand;
    private String model;
    private int numberOfCars;
    private int salesyear;
    private String descripcion;
    private String descriocion2;

    @Override
    public String toString() {
        return "Resultado{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfCars=" + numberOfCars +
                ", salesyear=" + salesyear +
                ", descripcion='" + descripcion + '\'' +
                ", descriocion2='" + descriocion2 + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public int getSalesyear() {
        return salesyear;
    }

    public void setSalesyear(int salesyear) {
        this.salesyear = salesyear;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescriocion2() {
        return descriocion2;
    }

    public void setDescriocion2(String descriocion2) {
        this.descriocion2 = descriocion2;
    }
}
