package animals;

public class Snake extends Animals {
    private int bodyLength;

    protected static final int MAX_WEIGHT = 10;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int countLimbs, int bodyLength) {
        super(age, weight, countLimbs);
        this.bodyLength = bodyLength;
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getMaxWeight(){
        return MAX_WEIGHT;
    }
}
