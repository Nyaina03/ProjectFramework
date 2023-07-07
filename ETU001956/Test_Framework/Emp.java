package etu001956.test_framework;

import etu001956.framework.annotation.Url;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Emp {
    private String name;
    private int age;
    private String dept;
    private double salaire;

    @Url("/url3")
    public void myMethod() {
        // Code de la méthode
    }

    // Getters and setters for the attributes
    public String getName() {
        return name;
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

    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept = dept;
    }

    public double getSalaire(){
        return salaire;
    } 
    public void setSalaire(double salaire){
        this.salaire = salaire;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameParam = request.getParameter("name");
        String ageParam = request.getParameter("age");
        String deptParam = request.getParameter("dept");
        String salaireParam = request.getParameter("salaire");

        if (nameParam != null) {
            this.name = nameParam;
        }

        if (ageParam != null) {
            try {
                this.age = Integer.parseInt(ageParam);
            } catch (NumberFormatException e) {
                // Gérer l'erreur de 
                System.out.println("erreur");
            }
        }

        if(deptParam != null){
            this.dept = deptParam;
        }

        if(salaireParam != null){
            try{
                this.salaire = Double.parseDouble(salaireParam);
            }catch(NumberFormatException e){
                System.out.println("erreur");
            }
        }

        // Autres traitements ou redirection vers une autre page
    }
}
