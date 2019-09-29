public class ToyStore {
    /**
     * user inter a type of toy the method return that toy
     * @param type is a String
     * @return type of Toy
     */
    public Toy orderToy(String type)
    {
        Toy item = null;
        //return Doll or Car or Rattle by the input if the input is not above that return null
        if(type.equalsIgnoreCase("Doll"))
            item = new Doll();
        else if(type.equalsIgnoreCase("Car"))
            item = new Car();
        else if(type.equalsIgnoreCase("Rattle"))
            item = new Rattle();
        if(item != null)// if item is not null that print item
        {
            item.assemble();
            item.boxToy();
            item.priceToy();
        }
        return item;
    }
}
