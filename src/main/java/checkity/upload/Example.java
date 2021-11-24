package checkity.upload;

public class Example {

    public boolean isEven(int number) {
        if (number < 10) {
            System.out.printf("%d is less than 10%n", number);
        } else if (number > 10) {
            System.out.printf("%d is greater than 10%n", number);
        }
        if (number % 2 == 0) {
            System.out.printf("%d is even%n", number);
            return true;
        } else {
            System.out.printf("%d is odd%n", number);
            return false;
        }
    }

}
