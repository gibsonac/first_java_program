import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class puzzling {
    public ArrayList<Integer> question1() {
        int[] createdArray = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };
        int sum = 0;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int x = 0; x < createdArray.length; x++) {
            sum += createdArray[x];
            if (createdArray[x] > 10) {
                answer.add(createdArray[x]);
            }
        }
        System.out.println(sum);
        return answer;
    }

    public ArrayList<String> question2() {
        ArrayList<String> createdArray = new ArrayList<String>();
        createdArray.add("Nancy");
        createdArray.add("Jinichi");
        createdArray.add("Fujibayashi");
        createdArray.add( "Momochi");
        createdArray.add("Ishikawa" );
        Collections.shuffle(createdArray);
        ArrayList<String> answer = new ArrayList<String>();
        for (int x = 0; x < createdArray.size(); x++) {
            System.out.println(createdArray.get(x));
            if (createdArray.get(x).length() > 5) {
                answer.add(createdArray.get(x));
            }
        }
        return answer;
    }
    public void question3(){
        ArrayList<String> createdArray = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] test = alphabet.split("");
        for(int x = 0; x< test.length; x++){
            createdArray.add(test[x]);
        }
        Collections.shuffle(createdArray);
        System.out.println("here's the last one"+createdArray.get(createdArray.size()-1));
        if(createdArray.get(createdArray.size()-1).equals("a") || createdArray.get(createdArray.size()-1).equals("e") ||createdArray.get(createdArray.size()-1).equals("i") ||createdArray.get(createdArray.size()-1).equals("o") ||createdArray.get(createdArray.size()-1).equals("u")){
            System.out.println("we've hit a vowel!");
        }
    }
    public int[] question4(){
        int[] answer = new int[10];
        Random r = new Random();
        for(int x = 0; x < answer.length; x++){
            answer[x] = r.nextInt(145) + 55;
            System.out.println(answer[x]);
        }
        return answer;
    }
    public ArrayList<Integer> question5(){
        System.out.println("question 5 begins now");
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Random r = new Random();
        for(int x = 0; x < 11; x++){
            answer.add(r.nextInt(145)+55);
        }
        Collections.sort(answer);
        System.out.println(answer.get(0));
        System.out.println(answer.get(answer.size()-1));
        return answer;
    }
    public String question6(){
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] test = alphabet.split("");
        for(int x = 0; x < 5; x++){
            Random r = new Random();
            answer+= test[r.nextInt(test.length)];
        }
        return answer;
    }
    public ArrayList<String> question7(){
        ArrayList<String> answer = new ArrayList<String>();
        for(int x = 0; x < 10; x++){
            answer.add(question6());
        }
        return answer;
    }


}