package FuncionesLimpias;

import java.util.Arrays;
import java.util.stream.Stream;

public class Funciones {

    public static void main(String[] args) {
        //Se separan los metodos en diferentes clases, fuera del main, para solo instanciar y cada una hace solo una funcion
        //compliendo con la norma S de SOLID
        Fibonacci funcionFibo = new Fibonacci();
        funcionFibo.fibonacci();
        funcionFibo.fibonacci2();

        //Dependencias por separado, evitando patron Singleton.
       NumerosPares numerosPares = new NumerosPares();

       //Utilizando argumentos de la funcion principal main.
       int arrayNumeros[] = numerosPares.conversionArgs(args);
       numerosPares.parIperativo(arrayNumeros);
       numerosPares.parFuncional(arrayNumeros);

    }

}
