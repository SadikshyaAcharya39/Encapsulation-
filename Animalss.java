
class Janawar{}
class Pig extends Janawar{}
class Monkey extends Janawar{}
class Chimpangee extends Janawar{}


public class Animalss {
    public static void main(String[] args) {
        Janawar janawar = new Chimpangee();
        Chimpangee chimpangee = (Chimpangee) janawar;
    }
}
