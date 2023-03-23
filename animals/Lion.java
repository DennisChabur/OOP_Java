package animals;

public class Lion extends Animals implements Comparable<Lion>{
    private int maneVolume;

protected static final int MAX_WEIGHT = 100;
protected static final String TYPE = "Lion";

    public Lion(int age, int weight, int countLimbs, int maneVolume){
        super(age, weight, countLimbs);
        this.maneVolume = maneVolume;
    }

    public int getManeVolume(){
        return maneVolume;
    }
  
    public void setManeVolume(int maneVolume){
        this.maneVolume = maneVolume;
    }

    @Override
    public String getType(){
        return TYPE;
    }

    @Override
    public int getMaxWeight(){
        return MAX_WEIGHT;
    }

    @Override
    public int compareTo(Lion o){
        return Integer.compare(o.age, this.age);
    }

}
