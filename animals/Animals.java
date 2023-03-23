package animals;

public abstract class Animals {
    protected int age;
    protected int weight;
    protected int countLimbs;

    public abstract String getType();
    public abstract int getMaxWeight();

    public void feed(int foodWeight){
        if(this.weight + foodWeight <= getMaxWeight()){
            this.weight += foodWeight;
        }
        else{
            System.out.println("Max weight exceeded");
        }
    };

    public Animals(int age, int weight, int countLimbs) {
        this.age = age;
        this.weight = weight;
        this.countLimbs = countLimbs;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getCountLimbs(){
        return countLimbs;
    }

    public void setCountLimbs(int countLimbs){
        this.countLimbs = countLimbs;
    }



}
