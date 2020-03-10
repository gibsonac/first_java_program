import java.util.Date;

public class HelloWorld {
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is: " + date;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int i = 120;
        byte b = (byte) i; // explicit type casting to byte
        System.out.println(b);

        byte x = 127;
        int y = x; // implicit type casting to int from byte
        System.out.println(y);

        float z = x; // implicit casting to float
        System.out.println(z);

        // Importing practice - importing the Date class from Java Library. NOTE: the
        // 'import' at the top of the doc, importing the Date class to this doc
        Importing iD = new Importing();
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);

        // Importing the Pythagorean Theorem Algorithm I built
        PythagoreanTheorem test = new PythagoreanTheorem();
        double Answer = test.calculateHypotenuse(2, 2);
        System.out.println(Answer);

        //Importing FizzBuzz challenge
        FizzBuzz fizzTest = new FizzBuzz();
        String answer = fizzTest.fizzBuzz(2);
        System.out.println(answer);

        //String Manipulation Practice Assignment
        //number 1
        StringManipulation stringTest = new StringManipulation();
        String newAnswer = stringTest.trimAndConcact("    Hello     ","     World    ");
        System.out.println(newAnswer);
        
        //number 2
        StringManipulation manipulator = new StringManipulation();
        char letter = 'o';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer c = manipulator.getIndexOrNull("Hello World", letter);
        Integer d = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a); // 1
        System.out.println(c); // 4
        System.out.println(d); // null

        //number 3
        StringManipulation manipulator2 = new StringManipulation();
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer f = manipulator2.getIndexOrNull(word, subString);
        Integer g = manipulator2.getIndexOrNull(word, notSubString);
        System.out.println(f); // 2
        System.out.println(g); // null

        StringManipulation manipulator3 = new StringManipulation();
        String theWord = manipulator3.concatSubstring("Hello", 1, 2, "world");
        System.out.println(theWord); // eworld
    }
}