/**
 @author: Justin Yamamoto
 @date: 9/4/2022
 This is exercise 4 of cs151 hw#1 with Professor Newton
 This program implements the Product class
*/

public final class Product
{
  private final String productName;
  private final String description;
  private final double price;
  private final int quantityAllowed;

  /**
   Constructor for the Product class

   @param productName the name of the product
   @param description the description of the product
   @param price the price of the product
   @param quantityAllowed the max quantity that can be ordered
  */
  public Product(String productName, String description, double price, int quantityAllowed)
  {
    this.productName = productName;
    this.description = description;
    this.price = price;
    this.quantityAllowed = quantityAllowed;
  }

  /**
   Overrides the object implementation of toString()
 
   @return a String representation of a Product
  */
  @Override 
  public String toString()
  {
    return "Product " + "[" + this.productName +", " + this.description + ", " + this.price + ", " + this.quantityAllowed + "]";
  }
  
  /**
   Gets the product name of the product
 
   @return the product name of the product
  */
  public String getProuctName(){return this.productName;}

  /**
   Gets the description of the product

   @return the description of the product
  */
  public String getDescription(){return this.description;}

  /**
   Gets the price of the product

   @return the price of the product
  */
  public double getPrice(){return this.price;}

  /*return *
   Gets the amount of units that can be sold
  
   @return quantity of items allowed to be sold
  */
  public int getQuantityAllowed(){return this.quantityAllowed;}


}
