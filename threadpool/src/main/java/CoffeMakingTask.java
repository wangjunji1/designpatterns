public class CoffeMakingTask  extends Task{
    private static final int TIME_PRE_CPU=100;
    public CoffeMakingTask(int numCups) {
        super(TIME_PRE_CPU * numCups);
    }
    public String toString(){
        return String.format("%s %s",this.getClass().getSimpleName(),super.toString());
    }


}
