package deliverynotificationsystem.deliverydrivers;

import deliverynotificationsystem.onlinestore.Publisher;
import deliverynotificationsystem.onlinestore.Shop;

public class VanDriver implements Subscriber {
  private Publisher shop;
  private String name;
  private double bid;

  private String getName() {
    return name;
  }

  /**
   * Register VanDriver with publisher.
   *
   * @param shop the publisher to register with.
   * @postcondition this VanDriver has been registered with publisher.
   */
  public VanDriver(String name, Publisher shop) {
    this.shop = shop;
    this.name = name;
    shop.registerSubscriber(this);
  }

  /**
   * Modifier method to set this van driver's bid.
   *
   * @param bid the van driver's bid.
   * @postcondition this van driver placed a bid of value, bid.
   */
  public void setBid(double bid) {
    this.bid = bid;
    shop.notifySubscribersOfHighBid();
  }

  /**
   * Access method to get this van driver's bid.
   *
   * @return this van driver's bid.
   */
  public double getBid() {
    return bid;
  }


  /**
   * VanDriver is updated.
   *
   * @postcondition This VanDriver is notified of a delivery request.
   */
  public void update(double bid) {
    System.out.printf("%s %s %s %s %s%n%s%n%s %s%n%s %s%n%s %s%n%s %s%n%s %s%n%s %s%n%s %s%n%n",
        "Van Driver", getName(), "notified of auction's current highBid =", bid, "for the following listing: ",
        "--------------------------------------------------------------------",
        "Product:", ((Shop) shop).getDeliveryRequest().getProduct(),
        "First Name:", ((Shop) shop).getDeliveryRequest().getFname(),
        "Last Name:", ((Shop) shop).getDeliveryRequest().getLname(),
        "Street:", ((Shop) shop).getDeliveryRequest().getStreet(),
        "State", ((Shop) shop).getDeliveryRequest().getCity(),
        "SSN:", ((Shop) shop).getDeliveryRequest().getState(),
        "Zip:", ((Shop) shop).getDeliveryRequest().getZip());
  }

}