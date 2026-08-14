package august.aug2FIleIOStreams.animalExample;

public class Animal {
    long lifespan;
    float weight;

    public Animal(long lifespan , float weight) {
        this.lifespan = lifespan;
        this.weight = weight;
    }

    public  void print(){
        System.out.println("Life Span : " + this.lifespan);
        System.out.println("Weight : " + this.weight);
    }

}
