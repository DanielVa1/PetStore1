public class PetStore {
    private String Name;
    private int Age;
    private String Species;
    private String Color;

    public PetStore() {
    }

    public PetStore(String name, int age, String species, String color) {
        Name = name;
        Age = age;
        Species = species;
        Color = color;
    }

    public String getName() {return Name;}

    public void setName(String name) {Name = name;}

    public int getAge() {return Age;}

    public void setAge(int age) {Age = age;}

    public String getSpecies() {return Species;}

    public void setSpecies(String species) {Species = species;}

    public String getColor() {return Color;}

    public void setColor(String color) {Color = color;}

    public String El(){
        return "El animal";
    }
}
