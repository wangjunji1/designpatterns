public class PotatoPeelingTask extends Task {
    /***
     * 削土豆的任务
     */
    private static final int TIME_PRE_POTATO = 200;
    public PotatoPeelingTask(int numPoatoes) {
        super(numPoatoes*TIME_PRE_POTATO);
    }
    public String toString(){
        return String.format("%s %s",this.getClass().getSimpleName(),super.toString());
    }
}
