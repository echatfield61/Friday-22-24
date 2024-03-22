import java.util.*;

  /**
     The ShoppingCart class has an ArrayList of Items.
     You will write a new class DiscountedItem that extends Item.
       */

  public class Tester
  {
    public static void main(String[] args) {
      ShoppingCart cart = new ShoppingCart();
      cart.add(new Item("bread", 3.25));
      cart.add(new Item("milk", 2.50));

      // Uncomment these to test
      cart.add(new DiscountedItem("ice cream", 4.50, 1.50));
      cart.add(new DiscountedItem("apples", 1.35, 0.25));

      cart.printOrder();
    }
  }

  // DiscountedItem inherits from Item
  class DiscountedItem extends Item
  {
      private double discount;

      // Add constructors that call the super constructor
    public DiscountedItem(String n,double p, double d)
    {
      super(n, p);
      discount = d;
    }
      // Add get/set methods for discount
      public double getDiscount()
      {
        return discount; // return discount here instead of 0
      }

      // Add a toString() method that returns a call to the super toString
      // and then the discount in parentheses using the super.valueToString() method
      public String toString()
      {
        return super.toString()+" Discount: " + super.valueToString(getDiscount());
      }

  }
