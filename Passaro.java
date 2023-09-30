package Projeto_POO;
public class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " canta melodiosamente!");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " voa de galho em galho.");
    }
}