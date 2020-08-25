package com.lab2.revisaopoo;

import java.util.Scanner;

public class CalculoAreas {
    private double a;
    private double b;
    private double c;

    public CalculoAreas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("===Calculo de Areas===");
        System.out.print("\tA: ");
        this.a = sc.nextDouble();

        System.out.print("\n\tB: ");
        this.b = sc.nextDouble();

        System.out.print("\n\tC: ");
        this.c = sc.nextDouble();
    }

    public CalculoAreas(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double areaTriangulo() {
        return (this.a * this.b) / 2;
    }

    public double areaCirculo() {
        return Math.PI * Math.pow(this.c, 2);
    }

    public double areaTrapezio() {
        return ((this.a + this.b) * this.c) / 2;
    }

    public double areaQuadrado() {
        return Math.pow(this.b, 2);
    }

    public double areaRetangulo() {
        return this.a * this.b;
    }

    public double areaCubo() {
        return Math.pow(6 * this.c, 2);
    }

}
