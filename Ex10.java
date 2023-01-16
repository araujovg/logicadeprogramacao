package io.github.jiangdequan;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a largura da parede: ");
        float largura = scan.nextFloat();

        System.out.println("Digite a altura da parede: ");
        float altura = scan.nextFloat();

        float areaParede = largura * altura;

        float qtdTinta = areaParede / 2;

        System.out.println("A quantidade de litros de tinta necessária para pintar uma parede de " + areaParede + "metros quadrados é: " + qtdTinta + " Litros");

    }
    
}