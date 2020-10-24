public class App {
    public static void main(String[] args) throws Exception {
        Carro carroA = new Carro();
        carroA.cor = "prata";
        carroA.modelo = "polo gts";
        carroA.ano = 2020;
        carroA.estado = false;

        carroA.andar();
        System.out.println("Cor: " + carroA.cor);
        System.out.println("Modelo: " + carroA.modelo);
        System.out.println("Ano: " + carroA.ano);
        System.out.println("Estado do veiculo: " + carroA.estado + "\n");  
        
        Modem modem = new Modem();
        modem.cor = "preto";
        modem.modelo = "fibra";
        modem.estado = false;

        modem.ligar();
        System.out.println("Cor: " + modem.cor);
        System.out.println("Modelo: " + modem.modelo);
        System.out.println("Estado: " + modem.estado); 
    }
}
