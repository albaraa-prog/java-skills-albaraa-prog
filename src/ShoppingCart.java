package src;


public class ShoppingCart {
    // Calculate total price with discounts
    public static double calculateTotal(double[] prices, String customerType) {
        double total = 0;

        for(int i = 0; i < prices.length; i++){
            prices[i] += total;
        }
        if(customerType =="REGULAR"){
            return total;
        } else if(customerType =="PREMIUM"){
            double dis = total - (10 /100);
            total = total - dis;
            return total;
        } else if (customerType =="VIP"){
            double dis = total - (20 /100);
            total = total - dis;
            return total;
        }
        return total;
    }
    // Find most expensive item
    public static double findMostExpensive(double[] prices) {
        double max = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] > max){
                max = prices[i];
            }
        }
        return max;
    }
    // Count items above a certain price
    public static int countExpensiveItems(double[] prices, double threshold) {
        int count = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] > threshold){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};

        System.out.println("Regular customer total: $" + calculateTotal(cart,
                "REGULAR"));
        System.out.println("Premium customer total: $" + calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart,
                "VIP"));
    }
}
