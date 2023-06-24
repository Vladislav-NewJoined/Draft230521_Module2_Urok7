package lessons.java;

interface /*class*/ Animal {
    /*public*/ void say(); /*{
        System.out.println("something say");
    }*/
}
//class Cat extends Animal{
//    public void say() {
//        System.out.println("mew");
//    }
//}
//class Dog extends Animal{
//    public void say() {
//        System.out.println("gav");
//    }
//}
//class Duck extends Animal{
//    public void say() {
//        System.out.println("krya");
//    }
//}

public class Draft0_Whole_Video_2_1_1 {

    static int catSayCounter = 0;
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Duck duck = new Duck();
//        cat.say();
//        dog.say();
//        duck.say();

        Animal cat = new Animal() {
            @Override
            public void say() {
                System.out.println("mew");
                catSayCounter++;
                System.out.println(catSayCounter);
            }
        };
        Animal dog = new Animal() {
            @Override
            public void say() {
                System.out.println("gav");
            }
        };
        Animal duck = new Animal() {
            @Override
            public void say() {
                System.out.println("krya");
            }
        };
        cat.say();
        dog.say();
        duck.say();
    }
}

interface Operation {
    void calculate(int a, int b);

}