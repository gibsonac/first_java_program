import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicsAssignment {
    public void Print255() {
        int i = 0;
        while (i < 256) {
            System.out.println(i);
            i++;
        }
    }

    public void PrintOdd() {
        int i = 0;
        while (i < 256) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void Sum(){
        int i = 0;
        int sum = 0;
        while (i < 256) {
            sum+=i;
            System.out.println("New number: "+i+"Sum: "+sum);
            i++;
        }
    }
    public void Iterating(int[] theArray){
        for(int x = 0; x < theArray.length; x++){
            System.out.println(theArray[x]);
        }
    }
    public void findMax(int[] anArray){
        int max = anArray[0];
        for(int x = 0; x< anArray.length; x++){
            if(anArray[x]> max){
                max = anArray[x];
            }
        }
        System.out.println(max);
    }
    public void getAverage(int[] theArray){
        int total = 0;
        for(int x = 0 ; x < theArray.length; x++){
            total += theArray[x];
        }
        total = total/theArray.length;
        System.out.print(total);
    }
    public void oddArray(){
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        int i = 0;
        while (i < 256) {
            if (i % 2 != 0) {
                oddArray.add(i);
            }
            i++;
        }
        System.out.print(oddArray);
    }
    public void greaterThan(int[] theArray, int Y){
        int total = 0;
        for(int x = 0; x < theArray.length; x++){
            if(theArray[x] > Y){
                total+=1;
            }
        }
        System.out.println(total);
    }
    public void squareValues(int[] theArray){
        for(int x = 0; x < theArray.length; x++){
            theArray[x]= theArray[x]*theArray[x];
        }
        System.out.println(theArray);
    }
    public void noNegatives(int[] theArray){
        for(int x = 0; x < theArray.length; x++){
            if(theArray[x]<0){
                theArray[x] = 0;
            }
            System.out.println(theArray[x]);
        }
    }
    public int[] MaxMinAvg(int[] theArray){
        int[] answer = new int[3];
        int max = theArray[0];
        int min = theArray[0];
        int total = 0;
        for(int x = 0; x < theArray.length; x++){
            total+=theArray[x];
            if(theArray[x]< min){
                min = theArray[x];
            }
            else if(theArray[x] > max){
                max = theArray[x];
            }

        }
        total = total/theArray.length;
        answer[0] = max;
        answer[1] = min;
        answer[2] = total;
        System.out.println(max);
        System.out.println(min);
        System.out.println(total);
        return answer;
    }
    public int[] Shifting(int[] theArray){
        for(int x = 0; x < theArray.length-1; x++){
            System.out.println("x is "+x + "currently; "+ theArray[x]);
            theArray[x] = theArray[x+1];
            System.out.println("x is "+x + "currently; " + theArray[x]);
        }
        theArray[theArray.length-1] = 0;
        System.out.println("last one is now" + theArray[theArray.length-1]);

        return theArray;
    }


}