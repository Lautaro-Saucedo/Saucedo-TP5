package saucedo.tp5;
/*En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos estáticos (static):
a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma y promedio de los mismos.
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el carácter recibido.
Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos de la clase Arreglo creada por usted*/
public class Arreglo {
    
    
    static void sumarLista(int[] a){
        int aux=0;
        for (int k:a){
            aux+=k;
        }
        System.out.println("La suma de los numeros del arreglo es "+aux+" y el promedio es "+aux/(a.length));
    }
    
    static int buscarMayor(int[][] a){
        int aux=0;
        for (int[] k:a){
            for (int j:k){
                if(j>aux){
                    aux=j;
                }
            }
        }
        return aux;
    }
    
    static int cuentaVocales(String a){
        int aux=0;
        for (int i=0; i<a.length();i++){
            if (Character.toLowerCase(a.charAt(i))=='a' ||
                Character.toLowerCase(a.charAt(i))=='e' ||
                Character.toLowerCase(a.charAt(i))=='i' ||
                Character.toLowerCase(a.charAt(i))=='o' ||
                Character.toLowerCase(a.charAt(i))=='u') {
                aux++;
            }
        }
        return aux;
    }
    
    static int cuentaCaracter(String a, char b){
        int aux=0;
        for (int i=0; i<a.length();i++){
            if(Character.toLowerCase(a.charAt(i)) == Character.toLowerCase(b)){
                aux++;
            }
        }
        return aux;
    }
}
