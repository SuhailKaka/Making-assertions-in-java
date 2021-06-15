import org.junit.Test;

public class CreatingObjects
{
    @Test
    public void creating_a_cat()
    {
        Cat felix = new Cat("felix", "tuna", 4);
        System.out.println(felix.getName());
        System.out.println(felix.getFavouritefood());
        System.out.println(felix.getAge());
    }

    @Test
    public void creating_a_dog()
    {
        Dog rover = new Dog("rover","bone", 3);
        System.out.println(rover.getName());
        System.out.println(rover.getFavouriteToy());
        System.out.println(rover.getAge());
    }

    @Test
    public void pets_making_noise(){
        Pet felix = new Cat("felix", "tuna", 4);
        Pet rover = new Dog("rover","bone", 3);
        System.out.println("felix goes " + felix.makeNoise());
        System.out.println("rover goes " + rover.makeNoise());
    }

}
