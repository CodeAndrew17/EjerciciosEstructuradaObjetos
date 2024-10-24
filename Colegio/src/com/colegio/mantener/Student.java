package com.colegio.mantener;

public class Student extends Person {
    private String carrera;
    private int legajo; /*codigo unico */

    public Student() {

    }

    public Student(String carrera,int legajo, String nombre, int edad){
        super(nombre,edad);
        this.carrera = carrera;
        this.legajo = legajo;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setLegajo(int legajo){
        this.legajo = legajo;
    }

    public int getLegajo(){
        return legajo;
    }

}
