package deliverynotificationsystem.auction;

import deliverynotificationsystem.deliverydrivers.Subscriber;

public interface AuctionHouse {

  /**
   * Add a bidder to list.
   *
   * @param bidder The bidder to add.
   * @postcondition bidder was added to this bidders list.
   */
  void registerBidder(Subscriber bidder);

  /**
   * Remove bidder from list.
   *
   * @param bidder The bidder to remove.
   * @postcondition bidder was removed from this bidders list.
   */
  void removeBidder(Subscriber bidder);

  /**
   * Access method for high bidder.
   *
   * @return The high bidder for the current delivery request auction.
   */
  public Subscriber getHighBidder();
}

