package deliverynotificationsystem;

import static org.junit.Assert.assertEquals;

import deliverynotificationsystem.deliverydrivers.TaxiDriver;
import deliverynotificationsystem.deliverydrivers.VanDriver;
import deliverynotificationsystem.onlinestore.DeliveryRequest;
import deliverynotificationsystem.onlinestore.Shop;
import org.junit.Test;

public class DeliveryNotificationSystemTest {

  @Test
  public void PublisherTest() {
    // Instantiate online shop
    Shop shop = new Shop();

    // Instantiate delivery request
    DeliveryRequest deliveryRequest1 = new DeliveryRequest("Business Projector", "John", "Smith",
        "123 Somewhere St.", "Boston", "MA", "02215");

    // create drivers
    VanDriver van1 = new VanDriver("van1", shop);
    VanDriver van2 = new VanDriver("van2", shop);
    VanDriver van3 = new VanDriver("van3", shop);
    TaxiDriver taxi1 = new TaxiDriver("taxi1", shop);
    TaxiDriver taxi2 = new TaxiDriver("taxi2", shop);
    TaxiDriver taxi3 = new TaxiDriver("taxi3", shop);

    // create delivery order and send updates to drivers
    shop.createDeliveryOrder(deliveryRequest1);

    // place bid and send current high bid to drivers.
    taxi1.setBid(5);
    taxi3.setBid(7);
    van1.setBid(9);

    // test
    double expected = 9;
    double actual = shop.auction.getHighBidder().getBid();
    assertEquals(expected, actual, 0.0);

  }

}
