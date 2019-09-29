public class Doll extends Toy {
    public Doll()
    {
        this.name = "Doll";
    }

    /**
     *  print assemble steps
     */
    @Override
    public void assemble()
    {
        super.assemble();//call father method
        System.out.println("Connecting all pieces\n" +
                "Painting the face\n" +
                "Adding the dress\n" +
                "Adding the shoes");
    }
}
