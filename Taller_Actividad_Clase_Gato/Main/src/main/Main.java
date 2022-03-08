package main;
// Taller_Actividad_Clase_Gato
/*
Teniendo en cuenta el código de la clase Gato-1.java
Descargar Gato-1.java(El nombre de la clase debe ser Gato), realice el siguiente ejercicio:

Pregunte cuánta energía y comida quiere darle al gato, ponga a jugar el gato hasta que su nivel 
de energía o nivel de alimento se agote, cuando se agote pregunte al usuario si quiere que el 
gato vuelva o no a jugar, en caso afirmativo realice el proceso correspondiente para que el gato
pueda volver a jugar. Use ciclos para resolver el problema.  

Realice el ejercicio usando la clase Main. 
*/
import java.util.Scanner;

public class Main {
    
    private static Scanner Entrada_Int;
    private static Scanner Entrada_String;
    
    public static void main(String[] args) {
        String Dato_01;
        String Dato_02;
        int Dato_03;
        int Dato_04;
        int opcion;
        int comida;
        int horas;
        int juego_cantidad;
        Entrada_Int=new Scanner(System.in);
        Entrada_String=new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingrese los siguientes atributos de su gato: ");
        System.out.print("Raza: ");
        Dato_01=Entrada_String.nextLine();
        System.out.print("Color: ");
        Dato_02=Entrada_String.nextLine();
        System.out.print("Nivel de energía: ");
        Dato_03=Entrada_Int.nextInt();
        System.out.print("Nivel de comida: ");
        Dato_04=Entrada_Int.nextInt();

// Creación del objeto Gato_00 que pertenece a la clase Gato (Instancia)
        Gato Gato_00=new Gato(Dato_01,Dato_02,Dato_03,Dato_04);
        System.out.println("\n"+"Los atributos que le asigno a su gato son los siguientes: "+Gato_00.raza+","+Gato_00.getColor()+","+Gato_00.energia+","+Gato_00.nivel_alimento+"\n");
        
        do{
            System.out.println("¿Que deseas hacer?");
            System.out.println("1. Alimentar al Gato.");
            System.out.println("2. Enviar a descansar al Gato.");
            System.out.println("3. Jugar con el Gato.");
            System.out.println("4. Acariciar el Gato");
            System.out.println("5. Cerrar programa");

            opcion=Entrada_Int.nextInt();
            switch(opcion){
                case 1:{
                    System.out.println("¿Cuanta comida desea dar a su gato?");
                    comida=Entrada_Int.nextInt();
                    Gato_00.comer(comida);
                    break;
                }
                case 2:{
                    System.out.println("¿Cuantas horas quiere que su gato descanse?");
                    horas=Entrada_Int.nextInt();
                    Gato_00.dormir(horas);
                    break;
                }
                case 3:{
                    System.out.println("¿Cuantas veces quiere jugar con su gato?");
                    juego_cantidad=Entrada_Int.nextInt();
                    Gato_00.jugar(juego_cantidad);
                    break;
                }
                case 4:{
                    Gato_00.acariciar();
                    break;
                }
                case 5:{
                    opcion=5;
                    break;
                }
                default:
                    System.out.println("Opción Invalida");
            }
        }while(opcion!=5);
        
     
        }    
    }
    
/*
preguntar al usuario cuantas veces quiere que el gato juegue y ponerlo a jugar esa cantidad de veces con un ciclo
*/
