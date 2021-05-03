package saucedo.tp5;

import static saucedo.tp5.Arreglo.*;



public class PruebaArreglo {

    public static void main(String[] args) {
        int[] a = {22,33,44,1000,321,999};
        int[][] b = { {100,2,3,4,5},{342,123,9,6},{4,355},{95}};
        sumarLista(a);
        System.out.println("el numero mayor en el arreglo b es:"+buscarMayor(b));
        System.out.println("cantidad de vocales en Esternocleidomastoideo:"+cuentaVocales("Esternocleidomastoideo"));
        System.out.println("cantidad de r en Desoxirribonucleótido:"+cuentaCaracter("Desoxirribonucleótido",'r'));
    }
    
}
