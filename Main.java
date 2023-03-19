import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner entrada = new Scanner(System.in);
        
        System.out.println("Infome a marca do carro/moto?");
        String marca = entrada.nextLine();
        
        System.out.println("Infome o modelo do carro/moto?");
        String modelo = entrada.nextLine();
        
        System.out.println("Infome o ano do carro/moto?");
        int ano = entrada.nextInt();
       
        System.out.println("Infome cor do carro/moto?");
        String cor = entrada.nextLine();

        System.out.println("Infome Cilindradas do moto?");
        int cilindradas = entrada.nextInt();

        System.out.println("Infome o numero das portas do carro?");
        int numPortas = entrada.nextInt();

        Veiculo veiculo = new Veiculo( marca,  modelo,  ano,  cor);
        Motocicleta moto = new Motocicleta( marca,  modelo,  cor,  ano,  cilindradas);
        Carro carro = new Carro( marca,  modelo,  cor,  ano,  numPortas);

        veiculo.imprimirInformacoes();
        moto.imprimirInformacoes();
        carro.imprimirInformacoes();

        entrada.close();

        
    }
    
}
