package com.colegio.mantener;

public class Teacher extends Person{
    private String materia; 
    private String cargo;

    public Teacher(){

    }

    public Teacher(String materia, String cargo,int edad, String nombre){
        super(nombre,edad);
        this.materia = materia;
        this.cargo = cargo;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getMateria(){
        return materia;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public String getCargo(){
        return cargo;
    }
}
