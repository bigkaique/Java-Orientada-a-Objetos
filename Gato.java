
// Classe Gato herdando de Animal
public class Gato  extends Animal{
    public Gato (String nome, String especie){
        super(nome,especie);
    }

    // Sobrescrevendo o método falar com comportamento específico para o Gato
    @Override
    public void falar(){
        System.out.println(getNome()+ " estar miando: miu miu miu ");
    }
    
}
