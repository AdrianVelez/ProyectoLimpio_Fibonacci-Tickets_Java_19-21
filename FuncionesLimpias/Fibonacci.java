package FuncionesLimpias;

import java.util.stream.Stream;

public class Fibonacci {

    /**
     * Fibonacci con Programacion Imperativa.
     */
    public static void fibonacci(){
        int iNumero1=0;
        int iNumero2=1;
        int iResultado=1;
        for (int i = 0; i < 20; i++) {
            System.out.println(iResultado);
            //se aplica formula: fibonacci = F1 + F2
            iResultado = iNumero1 + iNumero2;
            //Se actualizan las posiciones de los numeros, para continuar con el recorrido.
            iNumero1 = iNumero2;
            iNumero2= iResultado;
        }
        System.out.println("Programacion Imperativa: Fibonacci");

    }
    /**
     * Fibonacci de con funcion de alto nivel, programacion funcional.
     * Refactorizacion de codigo.
     */
    public static void fibonacci2() {
        //Stream.Iterate: Itera el Arreglo declarado con esas dos posiciones
        Stream.iterate(new long[] { 0, 1}, p -> new long[] {p[1], p[0] + p[1] })
                .limit(21)
                .forEach(p -> System.out.println(p[0]));
        System.out.println("Programacion Funcional: Fibonacci");
    }



}
