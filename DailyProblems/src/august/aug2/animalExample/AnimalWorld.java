package august.aug2.animalExample;

public class AnimalWorld <T extends Animal>{
    T[] animals;
    public AnimalWorld(T[] animals){
        this.animals = animals;
    }
}
