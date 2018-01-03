package rus.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Equation;

public class EquationTests {

  @Test
  // решений уравнений нет
  public void test0() {
    Equation e = new Equation(1, 1, 1);
    Assert.assertEquals(e.rootNamber(), 0);
  }

  @Test
  // одно решение
  public void test1() {
    Equation e = new Equation(1, 2, 1);
    Assert.assertEquals(e.rootNamber(), 1);
  }

  @Test
  // два решения
  public void test2() {
    Equation e = new Equation(1, 5, 6);
    Assert.assertEquals(e.rootNamber(), 2);
  }
}
