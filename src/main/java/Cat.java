public class Cat extends Pet
{
    private static final String CAT_NOISE = "Meow";
    private String favouriteFood;
    private int age;

    public Cat(String name, String favouriteFood, int age)
    {
        super(name);
        this.favouriteFood = favouriteFood;
        this.age = age;
    }


    public String getFavouritefood()
    {
        return favouriteFood;
    }

    public int getAge()
    {
        return age;
    }

    public String makeNoise()
    {
        return (CAT_NOISE);
    }

}
