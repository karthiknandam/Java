public class SmartKitchen {
    private CoffeeMaker coffeeMaker;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;

    public SmartKitchen(){
        coffeeMaker = new CoffeeMaker();
        refrigerator= new Refrigerator();
        dishWasher= new DishWasher();
    }
// Composition

    public void setAllApps(boolean coffee , boolean food , boolean dish ){
        coffeeMaker.setHasWorkToDo(coffee);
        refrigerator.setHasWorkToDo(food);
        dishWasher.setHasWorkToDo(dish);
    }

    public void doKitchenWork(){
        coffeeMaker.brewCoffee();
        refrigerator.orderFood();
        dishWasher.doDishes();
    }
//inheritance;
    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }
    public Refrigerator getRefrigerator(){
        return refrigerator;
    }
    public DishWasher getDishWasher(){
        return dishWasher;
    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo) System.out.println("Coffee is preparing");
        hasWorkToDo = false;
    }

}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;

    }
    public void doDishes(){
        if(hasWorkToDo) System.out.println("Washing Dishes");
        hasWorkToDo = false;
    }
}

class Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;

    }
    public void orderFood(){
        if(hasWorkToDo) System.out.println("Food is preparing");
        hasWorkToDo = false;
    }
}