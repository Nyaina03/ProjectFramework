package etu001956.test_framework;

import etu001956.framework.annotation.Url;

@Scope("singleton")
public class Emp {
    private String name;
    private int age;
    private String dept;
    private double salaire;
    private UploadFile uploadFile;

    @Url("/url3")
    public void myMethod() {
        // Code de la méthode
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
    }

    public UploadFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(UploadFile uploadFile) {
        this.uploadFile = uploadFile;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
