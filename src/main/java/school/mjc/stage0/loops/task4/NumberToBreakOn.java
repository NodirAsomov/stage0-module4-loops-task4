package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
            int n1=toBreakWith;
           int n2=numberToGoUntil;
           if(n2<n1){
               System.out.println("iterating till the end");
               for (int i = 1; i < n1;i++){
                   System.out.println(i);
                   if(i==n2)break;
               }if (n2>n1){
                   for (int j=1;j<n2;j++){
                       System.out.println(j);
                       if (j==n1)break;
                   }

               }
           }
    }

    public static void main(String[] args) {
        NumberToBreakOn numberToBreakOn=new NumberToBreakOn();
        numberToBreakOn.printNumbersUntilWithBreakOn(40,9);
    }
}


















