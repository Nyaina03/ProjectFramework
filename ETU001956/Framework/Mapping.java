package etu001956.framework;
public class Mapping {
    private String className;
    private String method;

    public Mapping(String className, String method) {
        this.className = className;
        this.method = method;
    }

    // Getters et Setters pour les attributs className et method
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
