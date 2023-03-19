public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String marca, String modelo, int ano, String cor, int cilindradas) {
        super(marca, modelo, ano, cor);
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas() {
        return cilindradas;
    }
    
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
        
}
