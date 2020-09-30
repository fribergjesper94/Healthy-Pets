public class Animals implements IFoodAmount, IFood {

    //Inkapsling

    private String name;
    private int weight;
    protected int foodWeight;
    protected TypesOfFood whatFood;

   //Konstruktor
    public Animals (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName () {
        return name;
    }

    @Override
    public int getFoodAmount () {
        return foodWeight;
    }

    @Override
    public TypesOfFood getCorrectFood() {
        return whatFood;
    }


}
