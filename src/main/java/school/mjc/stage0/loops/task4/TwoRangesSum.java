package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum=0;
        int loopcount=0;
        int average=0;
        for (int i = numberToSkip; i <= lastInRow; i++ )

        {
          sum =sum +i;
            loopcount++;
        }
        average = sum/ loopcount;

    }

    public static void main(String[] args) {
        TwoRangesSum twoRangesSum=new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(3,6);
    }
}
