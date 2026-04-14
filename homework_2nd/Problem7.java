package homework_2nd;

class DiscountCalculator{
    double calculate(double price){
        return price;
    }

    double calculate(double price, double discountRate){
        return price * discountRate;
    }

    double calculate(double price, int count, double discountRate){
        return count * calculate(price,discountRate);
    }
}

public class Problem7 {
    public static void main(String[] args){
        DiscountCalculator test = new DiscountCalculator();
        double price = 10;
        double discountRate = 0.8;
        int count = 5;
        double result1 = test.calculate(price);
        double result2 = test.calculate(price,discountRate);
        double result3 = test.calculate(price,count,discountRate);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
