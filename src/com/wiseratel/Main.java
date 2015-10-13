package com.wiseratel;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Mostrar los valores originales

        System.out.println("Valores originales: ");

        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));

        System.out.println();

        // Ejecución de las funciones count, min, max, sum y average sobre los valores

        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());

        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());

        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        // Suma de los valores con el método reduce

        System.out.printf("%nSuma usando el método reduce: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y));

        // Suma de los cuadrados de los valores usando el método reduce

        System.out.printf("Suma de los cuadrados usando el método reduce: %d%n", IntStream.of(values).reduce(0, (x, y) -> x + y * y));

        // Producto de los valores usando el método reduce

        System.out.printf("Productos usando el método reduce: %d%n", IntStream.of(values).reduce(1, (x, y) -> x * y));

        // Números pares mostrados de manera ordenada

        System.out.println();

        System.out.println("Números pares mostrados de manera ordenada: ");

        IntStream.of(values).filter(value -> value % 2 == 0).sorted().forEach(value -> System.out.printf("%d ", value));

        System.out.println();

        System.out.println("Números impares multiplicados por 10 y mostrados de manera ordenada: ");

        IntStream.of(values).filter(value -> value % 2 != 0).map(value -> value * 10).sorted().forEach(value -> System.out.printf("%d ", value));

        System.out.println();

        // Suma los valores del 1 al 10, exclusivo

        System.out.printf("%nSuma los valores del 1 al 9, exclusivo: %d%n", IntStream.range(1, 10).sum());

        // Suma los valores del 1 al 10, inclusivo

        System.out.printf("Suma los valores del 1 al 10, inclusivo: %d%n", IntStream.rangeClosed(1, 10).sum());

    } // main

} // Mains