package app;

public class Mamifero extends Animal {

    public String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");

    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamefero");
    }

}