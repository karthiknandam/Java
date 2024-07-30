public class IOTkitchen {
    public static void main(String[] args) {
        SmartKitchen s1 = new SmartKitchen();


        s1.getCoffeeMaker().setHasWorkToDo(true);
        s1.getCoffeeMaker().brewCoffee();
        s1.getRefrigerator().setHasWorkToDo(true);
        s1.getRefrigerator().orderFood();
        s1.getDishWasher().setHasWorkToDo(true);
        s1.getDishWasher().doDishes();

//        6 line of inheritance vs 2 lines of composition
        s1.setAllApps(true,true,true);
        s1.doKitchenWork();
    }
}

//O/P of both
//Coffee is preparing
//Food is preparing
//Washing Dishes

//Coffee is preparing
//Food is preparing
//Washing Dishes

