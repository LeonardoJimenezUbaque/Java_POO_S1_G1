package main;

public class Gato {
    String raza;
    private String color;
    int energia;
    int nivel_alimento;

// Constructor de la clase Gato
    public Gato(String raza, String color, int energia, int nivelalimento) {
        super();
        this.raza = raza;
        this.color = color;
        this.energia = energia;
        this.nivel_alimento = nivelalimento;
    }

// Método que permite acceder al atributo color
    public String getColor() {
        return color;
    }

// Método que permite modificar el atributo color
    public void setColor(String color) {
        this.color = color;
    }

    public void comer(int comida) {
        this.nivel_alimento=this.nivel_alimento+comida;
        if(this.nivel_alimento>100){
            this.nivel_alimento=100;
        System.out.println("El gato ha comido");
        System.out.println("Tu gato ha comido: "+comida+" Croquetas"+". Nivel de alimento actual: "+this.nivel_alimento+"\n");
        }
    }

    public void dormir(int horas) {
        this.energia+=horas*10;
        if(this.energia>100){
            this.energia=100;
        System.out.println ("El gato tomo una siesta");
        System.out.println("Tu gato ha dormido durante: "+horas+" Horas"+". Energia actual: "+this.energia+"\n");
        }
    }

    public void jugar(int juego_cantidad) {
        if (this.energia <= 0 || this.nivel_alimento <=1){
            System.out.println ("El gato no quiere jugar en este momento, esta cansado o tiene hambre");}
        else {
            for(int Contador=0;Contador<juego_cantidad;Contador++){
                this.energia -=5;
                this.nivel_alimento -= 5;
            }
            System.out.println ("Al gato le encanta jugar, ha jugado: "+juego_cantidad+" veces.");
            System.out.println("Energia actual: "+this.energia+" ,    "+"Nivel de alimento actual: "+this.nivel_alimento+"\n");
        }
        }

    public void acariciar() {
        System.out.println("prrrr");    	 
    }
    }
	
