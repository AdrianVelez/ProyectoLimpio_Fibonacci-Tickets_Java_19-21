package FuncionesLimpias;

import java.util.Arrays;

public class NumerosPares {
    String args[];

    /**
     * @param args: Recibe como parametro a nuestra variable String args del metodo main principal.
     * @return Regresa la conversion de args[] en tipo int[], para poder iterar sobre el.
     */
    public int[] conversionArgs(String[] args){
        int []arregloInt = new int[args.length];
        for (int i = 0; i <arregloInt.length ; i++) {
            arregloInt[i] = Integer.parseInt(args[i]); //Integer.valueOf(args[]);
        }
        //Arrays.stream(args).forEach(System.out::println);
        return arregloInt;
    }

    public void parIperativo(int ...numero){
        System.out.println("Programacion Iperativa: ");
        for (int i:numero){
            if (i%2==0){
                System.out.println("par = " + i);
            }
        }
    }

    public void parFuncional(int ...numero) {
        System.out.println("Programacion Funcional: ");
        Arrays.stream(numero).filter(x -> x % 2 == 0).forEach(x-> System.out.println("par = "+x));
    }



}
