package Projeto_POO;
public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " faz miau!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " pula no sofá.");
    }
}