package com.lab2.revisaopoo;

import java.util.Scanner;

public class Circulo {
    private int raio;
    private Ponto origem;

    public Circulo(Ponto or) {
        Scanner sc = new Scanner(System.in);
        this.raio = sc.nextInt();
        this.origem = or;
        sc.close();
    }
    public double calculaArea() {
        return raio * raio * Math.PI;
    }

    public double calculaCircunferencia() {
        return 2 * Math.PI * raio;
    }
}
