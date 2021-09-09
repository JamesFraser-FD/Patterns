package builder_pattern;

public class PizzaChef {

    public Pizza getMargharita() {
        return new Pizza.Builder().withTomatoSauce().withCheese().cook();
    }

    public Pizza getAmericanHot() {
        return new Pizza.Builder().withTomatoSauce().withCheese().withPepperoni().withJalapenos().cook();
    }
}
