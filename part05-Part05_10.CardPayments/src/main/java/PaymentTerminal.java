
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double affordableMeal = 2.50;
        if(payment >= affordableMeal) {
            this.money += affordableMeal;
            this.affordableMeals++;
            return payment - affordableMeal;
        }
        return payment;
        
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double heartyMeal = 4.30;
        if(payment >= heartyMeal) {
            this.money += heartyMeal;
            this.heartyMeals++;
            return payment - heartyMeal;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() >= 2.50) {
            this.affordableMeals++;
            
        }
        return card.takeMoney(2.50);
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        if(card.balance() >= 4.30) {
            this.heartyMeals++;    
        }
        return card.takeMoney(4.30);
        
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
    // ...
        if(sum > 0) {
            card.addMoney(sum);
            this.money = this.money + sum;
        }
        
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
