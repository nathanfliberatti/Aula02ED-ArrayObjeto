//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciar a classe Array
        Array array = new Array();
        Pet pet1 = new Pet("Bob", "Golden", 30.2f);
        Pet pet2 = new Pet("Mel", "Labrador", 20.5f);
        Pet pet3 = new Pet("Thor", "São Bernardo", 60f);

        array.inserir(pet1);
        array.inserir(pet2);
        array.inserir(pet3);
        array.exibir();

        System.out.println("=== Remover ===");

        if (array.remover(2)) {
            System.out.println("Foi removido com sucesso \nLista atual: ");
            array.exibir();
        } else {
            System.out.println("Não foi removido");
        }
        System.out.println();

        if (array.atualizarPeso(3, 65)) {
            System.out.println("Peso do Pet atualizado com sucesso");
        } else {
            System.out.println("Não foi atualizado");
        }

        System.out.println();
        System.out.println("Pesquisa do Pet por id: " + array.pesquisar(1));
        System.out.println("Lista atual:");
        array.exibir();
    }
}