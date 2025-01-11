import Classes.Container;
import Classes.SumOperation;
import Classes.DivisibleBy;
import Classes.DiscriminantCalculator;

public class Main {
    public static void main(String[] args) {

        Container<String> stringContainer = new Container<>("Hello World");
        stringContainer.displayType();
        System.out.println("Содержимое: " + stringContainer.getElement());


        SumOperation sumOperation = new SumOperation();
        int result = sumOperation.operate(5, 7);
        System.out.println("Сумма: " + result);


        DivisibleBy isDivisibleBy13 = (number) -> number % 13 == 0;

        System.out.println("38 делится на 13? " + isDivisibleBy13.test(38));
        System.out.println("39 делится на 13? " + isDivisibleBy13.test(39));


        DiscriminantCalculator calculator = (a, b, c) -> (b * b) - (4 * a * c);

        double a = 1.0, b = -3.0, c = 2.0; // Уравнение x^2 - 3x + 2
        double discriminant = calculator.calculate(a, b, c);
        System.out.println("Дискриминант: " + discriminant);
    }
}

