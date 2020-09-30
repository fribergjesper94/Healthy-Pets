public class Snake extends Animals {
    public Snake (String name, int weight) {
        super(name, weight);
        foodWeight = 20;
        whatFood = TypesOfFood.ORMPELLETS;
    }

}
