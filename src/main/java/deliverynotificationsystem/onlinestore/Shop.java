package deliverynotificationsystem.onlinestore;

import deliverynotificationsystem.auction.Auction;
import deliverynotificationsystem.deliverydrivers.Subscriber;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Publisher {

  private List<Subscriber> subscribers;
  private DeliveryRequest deliveryRequest;
  public Auction auction = new Auction(); // public for testing purposes only
  private double bid;

  /**
   * Initialize an empty list of subscribers.
   *
   * @postcondition An empty list of subscribers has been initialized.
   */
  public Shop() {
    subscribers = new ArrayList<>();
    bid = 0;
  }

  /**
   * Accessor method for deliveryRequest.
   *
   * @return This deliverRequest.
   */
  public DeliveryRequest getDeliveryRequest() {
    return deliveryRequest;
  }

  /**
   * Add subscriber to shop and auction lists.
   *
   * @param subscriber The subscriber to add.
   * @postcondition subscriber was added to subscriber and auction lists.
   */
  public void registerSubscriber(Subscriber subscriber) {
    subscribers.add(subscriber);
    auction.registerBidder(subscriber);
  }

  /**
   * Remove subscriber from list.
   *
   * @param subscriber The subscriber to remove.
   * @postcondition subscriber was removed from this subscribers list.
   */
  public void removeSubscriber(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }


  /**
   * Notify all subscribers.
   *
   * @postcondition ALl subscribers in this list have been sent an update.
   */
  public void notifySubscribers(double bid) {
    for (Subscriber subscriber : subscribers) {
      subscriber.update(bid);
    }
  }

  /**
   * Create delivery request and call the notifySubscribers method.
   *
   * @param deliveryRequest The delivery request to be created.
   * @postcondition A delivery request was assigned to the deliveryRequest instance variable, and
   *                notifySubscribers() was called.
   */
  public void createDeliveryOrder(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    notifySubscribers(bid);
    System.out.println();
  }

  /**
   * Notify driver all subscribers of High Bid.
   *
   * @postcondition All drivers notified of high bid.
   */
  public void notifySubscribersOfHighBid() {
    Subscriber highBidder = auction.getHighBidder();
    notifySubscribers(highBidder.getBid());

  }

}
