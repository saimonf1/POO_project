package Projeto_POO;
public class Main {
    public static void main(String[] args) {
        Animal dock = new Cao("Dock");
        Animal Tobias = new Gato("Tobias");
        Animal Lorenzo = new Passaro("Loro");

        dock.fazerBarulho();
        dock.mover();

        Tobias.fazerBarulho();
        Tobias.mover();

        Lorenzo.fazerBarulho();
        Lorenzo.mover(); 
    }
}