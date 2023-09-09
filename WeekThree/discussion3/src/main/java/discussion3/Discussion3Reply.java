package discussion3;

public class Discussion3Reply {
    public static void main(String[] args) {
        // header
        System.out.println("Jackson, Terrence. CMIS 242 6381. 01.28.2023.\n");

        Dog labRetriever = new Dog("Lab Retriever", "large", 76, "slow", 32, "floppy", "swimmer", "golden");
        startingAction(labRetriever);

        Pigeon feralPigeon = new Pigeon("Feral Pigeon", 10, "quick", 8, "red", "pointed", "white");
        startingAction(feralPigeon);

        Fish doradoFish = new Fish("Dorado", "large", 33, "quick", 3.28, 3, "orange");
        startingAction(doradoFish);
        doradoFish.swim();
    }

    public static void startingAction(Animal animal) {
        animal.buildShelter();
        animal.findFood();
        System.out.println(animal);
        System.out.println();
    }
}