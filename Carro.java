public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, String cor, int numPortas) {
        super(marca, modelo, ano, cor);
        this.numPortas = numPortas;
    }
    
    public int getNumPortas() {
        return numPortas;
    }
    
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de portas: " + numPortas);
    }  
    
}
