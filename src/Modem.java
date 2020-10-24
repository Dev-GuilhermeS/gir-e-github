public class Modem {
    String cor;
    String modelo;
    boolean estado;  

    void ligar () {
       System.out.println("Modem Ligado");
       this.estado = true;
    }
    
    void desligar () {
       System.out.println("Modem Desligado"); 
       this.estado = false;

    }
}
