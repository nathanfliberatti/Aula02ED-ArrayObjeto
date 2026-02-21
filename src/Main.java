//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciar a classe Array
        Array array = new Array();
        Pet pet1 = new Pet("Bob", "Golden", 30.2f, 1);
        Pet pet2 = new Pet("Mel", "Labrador", 20.5f, 2);

        array.inserir(pet1);
        array.inserir(pet2);
        array.exibir();
    }
}