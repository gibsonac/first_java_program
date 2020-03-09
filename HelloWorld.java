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

    }
}