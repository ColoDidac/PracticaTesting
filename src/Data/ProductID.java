package Data;

final public class ProductID {
    private final String ProductID;
    public ProductID(String code) { this.ProductID = code; }
    public String getPersonalID() { return ProductID; }

    @Override
    public boolean equals(Object o){
        if( this == o) return true;
        if(o == null|| this.getClass() !=o.getClass()) return false;
        ProductID product = (ProductID) o;
        return ProductID.equals(product.ProductID);
    }
    public int hashCode(){return ProductID.hashCode();}

    public String toString(){
        return "ProductID{"+ "personal code='" + ProductID + '\'' + '}';
    }



}
