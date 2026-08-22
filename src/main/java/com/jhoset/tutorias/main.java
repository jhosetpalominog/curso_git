package com.jhoset.tutorias;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Registro de tutoría ===");

        System.out.print("Nombre del estudiante: ");
        String estudiante = scanner.nextLine();

        System.out.print("Curso solicitado: ");
        String curso = scanner.nextLine();

        System.out.print("Duración en horas: ");
        int duracion = scanner.nextInt();

        System.out.println("\nTutoría registrada");
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Curso: " + curso);
        System.out.println("Duración: " + duracion + " hora(s)");

        scanner.close();
    }
}