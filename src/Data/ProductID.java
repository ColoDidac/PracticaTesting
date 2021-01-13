package Data;

final public class ProductID {
    private final String productID;
    public ProductID(String code) { this.productID = code; }
    public ProductID(){throw new IllegalArgumentException("Falte el ProductID"); }
    public String getPersonalID() { return productID; }

    @Override
    public boolean equals(Object o){
        if( this == o) return true;
        if(o == null|| this.getClass() !=o.getClass()) return false;
        ProductID product = (ProductID) o;
        return productID.equals(product.productID);
    }
    @Override
    public int hashCode(){return productID.hashCode();}
    @Override
    public String toString(){
        return "productID{"+ "personal code='" + productID + '\'' + '}';
    }



}
