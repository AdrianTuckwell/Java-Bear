import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() 
  {
    bear = new Bear("Baloo");
    salmon = new Salmon(); 
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName() 
  {
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty() 
  {
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon() 
  {
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatHuman() 
  {
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken() 
  {
    bear.eat(chicken);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void shouldEmptyBellyAfterSleeping()
  {
    bear.eat(salmon);
    bear.eat(human);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canThrowUp()
  {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    assertNotNull(food);
  }

  @Test
  public void canGetSalmonBack()
  {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    // Example of casting...
    Salmon original = (Salmon) food;
    assertEquals("swimming", original.swim());
  }


  @Test
  public void canGetChickenBack()
  {
    bear.eat(chicken);
    Edible food = bear.throwUp();
    // Example of casting...
    Chicken original = (Chicken) food;
    assertEquals("swimming", original.swim());
  }

  @Test
  public void edibleCanSwim()
  {
    bear.eat(human);
    Edible food = bear.throwUp();
    // Example of casting...
    assertEquals("swimming", food.swim());
  }

  @Test
  public void canChickenCluck()
  { 
    assertEquals("cluck cluck cluck", chicken.cluck());
  }

  @Test
  public void nutritionalValueInBearsBelly()
  {
    bear.eat(chicken);
    bear.eat(salmon);
    bear.eat(human);
    assertEquals(35, bear.totalNutrition()); 

  }

  @Test
  public void canDance()
  {
    assertEquals("Dancing salsa", bear.dance()); 
  }




}
