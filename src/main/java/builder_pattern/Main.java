package builder_pattern;

public class Main {

    public static void main(String[] args) {
        /*
        Using PizzaChef allows you to prevent using massive constructors that aren't readable.
        For example:
        Pizza margherita = new Pizza(true, false, true, false, false, false, false, false, false, false, false, false);
        Adding more toppings/sauces also makes these constructors even bigger.

        Using a pizza chef you only need to add one line.

         */
        PizzaChef chef = new PizzaChef();

        Pizza pizza = chef.getMargherita();
        System.out.println(pizza);
        // Output: Tomato base with cheese.

        pizza = chef.getAmericanHot();
        System.out.println(pizza);
        // Output: Tomato base with cheese, pepperoni, jalapenos.
    }

}
