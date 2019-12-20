package deliverynotificationsystem.onlinestore;

import deliverynotificationsystem.deliverydrivers.Subscriber;

public interface Publisher {

  /**
   * Add a subscriber to list.
   *
   * @param subscriber The subscriber to add.
   * @postcondition subscriber was added to this subscribers list.
   */
  void registerSubscriber(Subscriber subscriber);

  /**
   * Remove subscriber from list.
   *
   * @param subscriber The subscriber to remove.
   * @postcondition subscriber was removed from this subscribers list.
   */
  void removeSubscriber(Subscriber subscriber);

  /**
   * Notify all subscribers of placed bid on delivery request.
   *
   * @postcondition ALl subscribers in this list have been sent an update.
   */
  void notifySubscribersOfHighBid();

}
