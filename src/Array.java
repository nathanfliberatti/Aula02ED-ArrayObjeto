public class Array {

    private Pet[] lista = new Pet[3];
    private int contador = 0;

    /**
     * Insere um objeto do tipo Pet no array lista
     * @param pet Pet
     */
    public void inserir(Pet pet) {
        if (contador == lista.length) {
            lista = alocarNovoArray();
        }
        lista[contador++] = pet;
    }

    /**
     * Exibir o conteúdo relevante do array lista
     */
    public void exibir() {
        for(int i = 0; i < contador; i++) {
            System.out.println(lista[i]);
        }
    }


    private Pet[] alocarNovoArray() {
        Pet[] novo = new Pet[lista.length+3];

        System.arraycopy(lista, 0, novo, 0, lista.length);

        return novo;
    }

    private int pesquisar(int id) {
        for(int i = 0; i<lista.length; i++) {
            if (lista[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean remover(int id) {
        int indice = pesquisar(id);

        if (indice >= 0) {
            for(int i = indice; i<contador-1; i++) {
                lista[i] = lista[i+1];
            }
            contador--;
            return true;
        }
        return false;
    }

    public boolean atualizarPeso(int id, float peso) {
        int indice = pesquisar(id);

        if (indice >= 0) {
            lista[indice].setPeso(peso);
            return true;
        }
        return false;
    }

    public Pet pesquisar(Integer id) {
        int indice = pesquisar(id.intValue());

        if (indice >= 0) {
            return lista[indice];
        }
        return null;
    }
}