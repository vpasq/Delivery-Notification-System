package deliverynotificationsystem.deliverydrivers;

public interface Subscriber {

  /**
   * TaxiDriver subscriber is updated.
   *
   * @postcondition This TaxiDriver is notified of a delivery request.
   */
  void update(double bid);

  /**
   * Access method to get this taxi driver's bid.
   *
   * @return this taxi driver's bid.
   */
  double getBid();
}
