public class Main {
    public static void main(String[] args) {
        int nota = 0;
        switch (nota) {
            case 1:
            case 2:
                System.out.println("Su calificacion es: F");
                break;
            case 3:
            case 4:
                System.out.println("Su calificacion es: D");
                break;
            case 5:
            case 6:
                System.out.println("Su calificacion es: C");
                break;
            case 7:
            case 8:
                System.out.println("Su calificacion es: B");
                break;
            case 9:
            case 10:
                System.out.println("Su calificacion es: A");
                break;
            case 0:
            case 11:
            case 12:
            case 13:
                System.out.println("Numero no valido, por favor verifique");
                break;
        }
    }
}

//

Algoritmo Taller1
        definir i, suma como entero
        suma=0
        para  i = 1 hasta 10
        suma = suma + i
        FinPara
        Escribir " la  suma  de los numeros  del 1 al 10 es" : ",suma
FinAlgoritmo
