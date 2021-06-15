public class Dog extends Pet
{
    private static final String DOG_NOISE = "Woof";
    private String favouriteToy;
    private int age;

    public Dog(String name, String favouriteToy, int age)
    {
        super(name);
        this.favouriteToy = favouriteToy;
        this.age = age;
    }

    public String getFavouriteToy()
    {
        return favouriteToy;
    }

    public int getAge()
    {
        return age;
    }

    public String makeNoise(){
        return (DOG_NOISE);
    }
}
