public class Pet {

    private String nome;
    private String raca;
    private float peso;
    private int id;

    public Pet() {
    }

    public Pet(String nome, String raca, float peso, int id) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.id = id;
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
