public class Dog extends Animals {
    public Dog (String name, int weight) {
        super(name, weight);
        foodWeight = weight/100;
        whatFood = TypesOfFood.HUNDFODER;
    }

}
