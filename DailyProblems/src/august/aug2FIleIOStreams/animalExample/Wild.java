package august.aug2FIleIOStreams.animalExample;

public class Wild extends Land{
    float speed ;
    public  Wild(long lifespan , float weight , short vision , float speed) {
        super(lifespan , weight , vision);
        this.speed  = speed;
    }
}
