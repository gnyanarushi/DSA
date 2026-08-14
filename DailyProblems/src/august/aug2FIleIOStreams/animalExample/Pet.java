package august.aug2FIleIOStreams.animalExample;

public class Pet extends  Land{
    String name ;
    public  Pet(long lifespan , float weight , short vision , String name) {
        super(lifespan , weight , vision);
        this.name  = name;
    }
}