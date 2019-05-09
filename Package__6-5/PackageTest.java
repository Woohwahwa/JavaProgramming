import java.util.ArrayList;
import com.vehicle.*;

class MyBus extends Bus {}

public class PackageTest {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    Bus bus = new Bus();
    Car car = new Car();
    System.out.println(bus.getType());
  }
}