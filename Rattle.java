public class Rattle extends Toy {
    public Rattle()
    {
        this.name = "Rattle";
    }

    /**
     *  print assemble steps
     */
    @Override
    public void assemble()
    {
        super.assemble();//call father method
        System.out.println("Create the frame\n" +
                "Add the pebbles\n" +
                "Secure the sides");
    }
}
