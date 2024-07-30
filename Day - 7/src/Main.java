public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cheetah","Large",100.5);
        define(animal,"120 Kph");

        Dog dog = new Dog();
        define(dog,"25 kph");

        Dog dog1 = new Dog("Small","Sharp",250.5,"Wolfy");
        define(dog1 , "35 kmph");

        Dog dog2 = new Dog(3500,"Colasol");
        define(dog2 , "15 kmp");

//        Fish

        Fish golden = new Fish("Golden fish",0.25,2,5);
        define(golden , "fast");
    }

    public static void define(Animal animal , String speed) {
        animal.isMove();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_______");
    }
}

//O/p

//This is animal parent section
//Cheetah will move 120 Kph because it is Large
//Animal{Type='Cheetah', Size='Large', weight=100.5}
//_______

//This is Dog Sec
//Strey Dog will move 25 kph because it is small
//Dog{isTail='null', isEars='null'} Animal{Type='Strey Dog', Size='small', weight=25.3}
//_______


//This is Dog Sec
//Wolfy will move 35 kmph because it is large
//Dog{isTail='Small', isEars='Sharp'} Animal{Type='Wolfy', Size='large', weight=250.5}
//_______


//This is Dog Sec
//Colasol will move 15 kmp because it is large
//Dog{isTail='Large', isEars='Big sharp'} Animal{Type='Colasol', Size='large', weight=3500.0}
//_______