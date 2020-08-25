package com.lab2.revisaopoo;

public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
        this.altura = 0;
        this.base = 0;
    }

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
}
