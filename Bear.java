// for use when using array lists
import java.util.*;

public class Bear implements Danceable{

  private String name;
  private ArrayList<Edible> belly;

  public Bear(String name) {
    this.name = name;
    this.belly = new ArrayList<Edible>();
  }

  public String getName() {
    return this.name;
  }

  public int foodCount() {
    return this.belly.size();
  }

  public void eat(Edible food) {
    this.belly.add(food);
  }

  public void sleep() 
  {
    this.belly.clear();  
  }

  public Edible throwUp() 
  {
    if (foodCount() > 0)
    {
      return this.belly.remove(0);
    }  
    return null;
  }
  
  public int totalNutrition()
  {
    int total = 0;
    for( Edible food: this.belly)
    {
      total += food.nutritionalValue();
    }
    return total;
  }

public String dance()
{
  return "Dancing salsa";
}

  




}
