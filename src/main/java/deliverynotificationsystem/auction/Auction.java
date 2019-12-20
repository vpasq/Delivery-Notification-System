package deliverynotificationsystem.auction;

import deliverynotificationsystem.deliverydrivers.Subscriber;
import deliverynotificationsystem.deliverydrivers.TaxiDriver;
import deliverynotificationsystem.deliverydrivers.VanDriver;
import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionHouse {

  private List<Subscriber> bidders;
  private double highBid;
  private Subscriber highBidder;

  /**
   * Initialize empty list of bidders.
   */
  public Auction() {
    this.bidders = new ArrayList<>();
  }

  /**
   * Add a bidder to list.
   *
   * @param bidder The bidder to add.
   * @postcondition bidder was added to this bidder's list.
   */
  public void registerBidder(Subscriber bidder) {
    bidders.add(bidder);
  }

  /**
   * Remove bidder from list.
   *
   * @param bidder The bidder to remove.
   * @postcondition bidder was removed from this bidder's list.
   */
  public void removeBidder(Subscriber bidder) {
    bidders.remove(bidder);
  }

  /**
   * Access method for high bidder.
   *
   * @return The high bidder for the current delivery request auction.
   */
  public Subscriber getHighBidder() {
    double bid;

    for (Subscriber bidder : bidders) {

      if (bidder instanceof TaxiDriver) {
        bid = bidder.getBid();
        if (bid > highBid) {
          highBid = bid;
          highBidder = bidder;
        }
      }

      if (bidder instanceof VanDriver) {
        bid = bidder.getBid();
        if (bid > highBid) {
          highBid = bid;
          highBidder = bidder;
        }
      }
    }
    return highBidder;
  }


}



