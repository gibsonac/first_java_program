import java.util.ArrayList;


public class listExceptions{
    public void Practice(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i = 0; i < myList.size(); i++) {
            // Integer castedValue = (Integer)myList.get(i);
            try {
                Integer castedValue = (Integer)myList.get(i);
                System.out.println(castedValue);
            } catch (Exception e) {
                System.out.println(e);
                //TODO: handle exception
                System.out.println("Whoops this can't be an Integer! It's at index " + i + "and it says" + myList.get(i));

            }
        }


    }
}