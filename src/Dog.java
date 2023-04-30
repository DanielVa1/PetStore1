public class Dog extends PetStore{
    private String Voice;
    private String Race;
    private double size;

    public Dog() {
    }

    public Dog(String name, int age, String species, String color, String voice, String race, double size) {
        super(name, age, species, color);
        Voice = voice;
        Race = race;
        this.size = size;
    }

    public String getVoice() {return Voice;}

    public void setVoice(String voice) {Voice = voice;}

    public String getRace() {return Race;}

    public void setRace(String race) {Race = race;}

    public double getSize() {return size;}

    public void setSize(double size) {this.size = size;}

    public String toString(){
        String texto = "El perro se llama " + getName() +
                "\n Con edad " + getAge() +
                "\n Y especie " + getSpecies() +
                "\n Y color " + getColor()+
                "\n Que " + getVoice() +
                "\n Y de raza " + getRace() +
                "\n De tamaño " + getSize()+" cm";
        return texto;

    }

}
