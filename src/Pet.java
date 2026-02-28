public class Pet {

    /**
     * static pois é um atributo da classe, não do objeto
     * então caso não tivesse o static o atributo pertenceria ao objeto,
     * e não conseguiria incrementar para o próximo
     * objeto que será instanciado
     */
    private static int i = 1;

    private String nome;
    private String raca;
    private float peso;
    private int id;

    public Pet() {
    }

    public Pet(String nome, String raca, float peso) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.id = i++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + ", Raça: " + raca + ", Peso: " + peso + ", Id: " + id;
    }
}
