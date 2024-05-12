package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {
    private int TotalRejected = 0;

    public int getTotalRejected(){
        return TotalRejected;
    }

    protected int reportRejected() {
        return TotalRejected;
    }

    @Override
    protected void countIn(int in) {
        if (!callCheck() && in > peekaboo()){
            TotalRejected++;
        } 
        else{
            super.countIn(in);
        }
            
    }
}
