package zoo;

import animals.Snake;
import cage.AnimalCage;
import animals.Lion;


public class Zoo {
    private AnimalCage<Lion> lionCage;
    private AnimalCage<Snake> snakeCage;

    public Zoo(AnimalCage<Lion> lionCage, AnimalCage<Snake> snakeCage){
        this.lionCage = lionCage;
        this.snakeCage = snakeCage;
    }

    public Lion takeOfLion(){
        if(lionCage == null) return null;
        else return lionCage.takeOfAnimal();
    }

    public Snake takeOfSnake(){
        if(snakeCage == null) return null;
        else return snakeCage.takeOfAnimal();
    }

    public int addLion(Lion animal){
        if(this.lionCage == null) return 0;
        else return lionCage.addAnimal(animal);
    }

    public int addSnake(Snake animal){
        if(this.snakeCage == null) return 0;
        else return snakeCage.addAnimal(animal);
    }

    public AnimalCage<Lion> getLionCage() {
        return lionCage;
    }

    public void setLionCage(AnimalCage<Lion> lionCage) {
        this.lionCage = lionCage;
    }

    public AnimalCage<Snake> getSnakeCage() {
        return snakeCage;
    }

    public void setSnakeCage(AnimalCage<Snake> snakeCage) {
        this.snakeCage = snakeCage;
    }

    @Override
    public String toString() {
        int lionCount = 0;
        int snakeCount = 0;

        if(lionCage != null){
            lionCount = lionCount.countAnimals();   //TODO
        }
        if(snakeCage != null){
            snakeCount = snakeCount.countAnimals(); //TODO
        }
        return "Zoo{" +
                "lionCage=" + lionCage +
                "snakeCage=" + snakeCage +
                '}';
    }
}
