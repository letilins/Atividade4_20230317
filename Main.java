public class Main {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("Honda", "New City", 2023, "Prata");
        Carro carro = new Carro("Chevrolet", "Montana", 2023, "Preto", 4);
        Motocicleta moto = new Motocicleta("Yamaha", "R3 ABS", 2023, "Azul", 321);

        veiculo.imprimirInformacoes();
        System.out.println();
        moto.imprimirInformacoes();
        System.out.println();
        carro.imprimirInformacoes();
        System.out.println();

    }
    
}
