public class Carro {
    String cor;
    String modelo;
    int ano;
    boolean estado;

void andar () {
    System.out.println("O veiculo está andando");
    this.estado = true;
}

void parar () {
    System.out.println("O veiculo está parado");
    this.estado = false;
}

}
