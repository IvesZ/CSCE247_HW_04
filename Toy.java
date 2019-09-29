public abstract class Toy {
    protected String name; //the name of the item

    /**
     * print assemble info
     * displays "putting together a ..."
     */
    public void assemble()
    {
        System.out.printf("Putting together a %s\n",this.name);
    }

    /**
     * print  displays "putting the ... in a box"
     */
    public void boxToy()
    {
        System.out.printf("Putting the %s in a box\n",this.name);
    }

    /**
     * print displays "adding price on ..."
     */
    public void priceToy()
    {
        System.out.printf("Adding price on %s\n",this.name);
    }
}
