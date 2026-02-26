

public class Pastries extends Food {
    private String Ingredients;
    private String Flavor;


    public Pastries(){}

    public Pastries(String type, String name, double price, String Ingredients, String Flavor) {
        super(type, name, price);
        this.Ingredients = Ingredients;
        this.Flavor = Flavor;

    }
    public String getIngregients() {
        return Ingredients;
    }
    public String getFlavor() {
        return Flavor;
    }
    public void setIngredients(String type) {
        this.Ingredients = Ingredients;
    }
    public void setName(String name) {
        this.Flavor = Flavor;
    }
    public String getInfo() {
        return String.format("%s: %s - %.2f - %s - %s", type, name, price, Ingredients, Flavor);
    }



}
