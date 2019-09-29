public class Car extends Toy {
    public Car()
    {
        this.name = "Car";
    }

    /**
     *  print assemble steps
     */
    @Override
    public void assemble()
    {
        super.assemble();//call father method
        System.out.println("Make the body\n" +
                "Add the wheels\n" +
                "Paint the car");
    }
}
