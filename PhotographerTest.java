import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  
  @Before 
  public void before() {
    photographer = new Photographer("Nikon 34T", 
                                       "Noise reduction filter",
                                       "Hi-resolution"); 
  }

  @Test
  public void photographerClassExists() {
      assertNotNull(photographer);
  }

  @Test
  public void hasCamera(){
    assertEquals("Baloo", bear.getName());
  }

}