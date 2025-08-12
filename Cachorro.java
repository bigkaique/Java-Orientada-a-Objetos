
// Classe Cachorro herdando de Animal
public class Cachorro  extends Animal{
  // Construtor que chama o construtor da classe pai
 public Cachorro(String nome, String especie) {
        super(nome, especie);
    }
    // Sobrescrevendo o método falar com comportamento específico para cachorro
    @Override
    public void falar() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
    public void abanaOrrabo(){
        System.out.println(getNome() +" ele esta abando o rabo");
    }
}

