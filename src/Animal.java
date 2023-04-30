public class Animal {
    public static void main(String[] args) {
        Dog Dog1 = new Dog("Bolilo", 15, "Canis lupus familiaris", "cafe",
                "ladra", "labradror", 56);

        Parakeet Parakeet1 = new Parakeet("periquito", 1,"Eupsittula Canicularis",
                "color verde con la corona verde/azul y frente naranja","Si",
                "suave","perico");

        System.out.println("Metodo toString = " + Dog1.toString());
        System.out.println("Metodo toString = " + Parakeet1.toString());




    }
}
