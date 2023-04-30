public class Parakeet extends PetStore {
    private String Speak;
    private String Plumage;
    private String Classification;

    public Parakeet() {
    }

    public Parakeet(String name, int age, String species,
                    String color, String speak, String plumage, String classification) {
        super(name, age, species, color);
        Speak = speak;
        Plumage = plumage;
        Classification = classification;
    }

    public String getSpeak() {return Speak;}

    public void setSpeak(String speak) {Speak = speak;}

    public String getPlumage() {return Plumage;}

    public void setPlumage(String plumage) {Plumage = plumage;}

    public String getClassification() {return Classification;}

    public void setClassification(String classification) {Classification = classification;}


    public String toString(){
        String texto= "El nombre es: "+ getName()+
                "\n Con edad de: " + getAge() +" año" +
                "\n De la especie: " + getSpecies() +
                "\n De color: " + getColor() +
                "\n Puede Hablar: " + getSpeak() +
                "\n Plumaje: " + getPlumage() +
                "\n Su clasificacion es: " + getClassification();
        return texto;

    }
}
