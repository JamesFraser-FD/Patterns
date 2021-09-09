package builder_pattern;

import java.util.ArrayList;

public class Pizza {

    private final boolean hasTomatoSauce;
    private final boolean hasBbqSauce;

    private final boolean hasCheese;
    private final boolean hasPepperoni;
    private final boolean hasChicken;
    private final boolean hasSweetcorn;
    private final boolean hasPeppers;
    private final boolean hasOnions;
    private final boolean hasJalapenos;

    public static class Builder {
        private boolean hasTomatoSauce = false;
        private boolean hasBbqSauce = false;

        private boolean hasCheese = false;
        private boolean hasPepperoni = false;
        private boolean hasChicken = false;
        private boolean hasSweetcorn = false;
        private boolean hasPeppers = false;
        private boolean hasOnions = false;
        private boolean hasJalapenos = false;

        public Builder withTomatoSauce() {
            hasTomatoSauce = true;
            return this;
        }

        public Builder withBbqSauce() {
            hasBbqSauce = true;
            return this;
        }

        public Builder withCheese() {
            hasCheese = true;
            return this;
        }

        public Builder withPepperoni() {
            hasPepperoni = true;
            return this;
        }

        public Builder withChicken() {
            hasChicken = true;
            return this;
        }

        public Builder withSweetcorn() {
            hasSweetcorn = true;
            return this;
        }

        public Builder withPeppers() {
            hasPeppers = true;
            return this;
        }

        public Builder withOnions() {
            hasOnions = true;
            return this;
        }

        public Builder withJalapenos() {
            hasJalapenos = true;
            return this;
        }

        public Pizza cook() {
            return new Pizza(this);
        }

    }

    private Pizza(Builder builder) {
        this.hasTomatoSauce = builder.hasTomatoSauce;
        this.hasBbqSauce = builder.hasBbqSauce;

        this.hasCheese = builder.hasCheese;
        this.hasPepperoni = builder.hasPepperoni;
        this.hasChicken = builder.hasChicken;
        this.hasSweetcorn = builder.hasSweetcorn;
        this.hasPeppers = builder.hasPeppers;
        this.hasOnions = builder.hasOnions;
        this.hasJalapenos = builder.hasJalapenos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (hasTomatoSauce) {
            sb.append("Tomato base");
        }
        if (hasBbqSauce) {
            sb.append("BBQ base");
        }

        ArrayList<String> toppings = new ArrayList<>();
        if (hasCheese) {
            toppings.add("cheese");
        }
        if (hasPepperoni) {
            toppings.add("pepperoni");
        }
        if (hasChicken) {
            toppings.add("chicken");
        }
        if (hasSweetcorn) {
            toppings.add("sweetcorn");
        }
        if (hasPeppers) {
            toppings.add("peppers");
        }
        if (hasOnions) {
            toppings.add("onions");
        }
        if (hasJalapenos) {
            toppings.add("jalapenos");
        }

        sb.append(" with ").append(String.join(", ", toppings)).append(". ");
        return sb.toString();
    }
}