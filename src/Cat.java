public class Cat extends Animals  {
    public Cat (String name, int weight) {
        super(name, weight);
        foodWeight = weight/150;
        whatFood = TypesOfFood.KATTFODER;
    }


}
