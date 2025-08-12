// cliar uma classe De um animal como privado
public class Animal {
    private String nome;
    private String especie;
// Construtor inicializa os atributos quando criamos um objeto
    public Animal (String nome,String especie){
        this.nome =nome;
        this.especie = especie;
    }
    // Método getter para pegar o nome do animal
    public String getNome() {
        return nome;
    }
    public String getEspecie(){
return  especie;
    }
public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void falar() {
        System.out.println(nome + " fez um som.");
    }
    public void comer() {
        System.out.println(nome + " estar comendo feliz.");
    }

}
