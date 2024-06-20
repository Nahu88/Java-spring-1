package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStream {

    public void muestraEjemplo(){
        List<String>nombres = Arrays.asList("Brenda","Luis","Maria Fernanda","Eric");
        nombres.stream()
                .sorted()
                .limit(2)
                .filter(n -> n.startsWith("B"))
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
