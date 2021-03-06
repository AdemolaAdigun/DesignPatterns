package toppings;

import pizza.Pizza;

public abstract class ToppingDecorator implements Pizza {
    private Pizza pizza;
    private boolean status;

    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public Pizza getPizza() {
        return this.pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return this.pizza.getDescription();
    }

    public double getEstimatePrepTime(){
        return this.pizza.getEstimatePrepTime();
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice();
    }
}
