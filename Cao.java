package Projeto_POO;
public class Cao extends Animal {
    public Cao(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " faz latidos!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " corre pelo quintal.");
    }
}
