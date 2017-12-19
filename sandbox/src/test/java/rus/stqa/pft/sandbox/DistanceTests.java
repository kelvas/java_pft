package rus.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;


public class DistanceTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(0,0);
    Point p2 = new Point(3,4);
    Assert.assertEquals(p1.distance(p2),5.0);
  }

}
