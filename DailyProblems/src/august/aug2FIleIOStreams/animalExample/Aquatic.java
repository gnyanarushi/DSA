package august.aug2FIleIOStreams.animalExample;

public class Aquatic extends  Animal{
    short scale;
    public  Aquatic(long lifespan , float weight , short scale){
        super(lifespan ,weight);
        this.scale = scale;
    }

    public void print(){
            super.print();
        System.out.println("Scale : " + this.scale);
    }

}
