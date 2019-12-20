package deliverynotificationsystem.onlinestore;

public class DeliveryRequest {

  private String product;
  private String fname;
  private String lname;
  private String street;
  private String city;
  private String state;
  private String zip;

  /**
   * Initialize deliverRequest instance variables.
   *
   * @param product The product requested to be delivered.
   * @param fname First name of person that requested delivery.
   * @param lname Last name of person that requested delivery.
   * @param street Street address of person that requested delivery.
   * @param city City of person that requested delivery.
   * @param state State of person that requested delivery.
   * @param zip Zip code of person that requested delivery.
   */
  public DeliveryRequest(String product, String fname, String lname, String street,
      String city, String state, String zip) {
    this.product = product;
    this.fname = fname;
    this.lname = lname;
    this.street = street;
    this.city = city;
    this.state = state;
    this.zip = zip;
  }

  /**
   * Accessor method for product to be delivered.
   *
   * @return Product to be delivered.
   */
  public String getProduct() {
    return product;
  }

  /**
   * Accessor method for first name of person that requested delivery.
   *
   * @return First name of person that requested delivery.
   */
  public String getFname() {
    return fname;
  }

  /**
   * Accessor method for last name of person that requested delivery.
   *
   * @return Last name of person that requested delivery.
   */
  public String getLname() {
    return lname;
  }


  /**
   * Accessor method for street of person that requested delivery.
   *
   * @return Street of person that requested delivery.
   */
  public String getStreet() {
    return street;
  }

  /**
   * Accessor method for city of person that requested delivery.
   *
   * @return City of person that requested delivery.
   */
  public String getCity() {
    return city;
  }

  /**
   * Accessor method for state of person that requested delivery.
   *
   * @return State of person that requested delivery.
   */
  public String getState() {
    return state;
  }

  /**
   * Accessor method for zip code of person that requested delivery.
   *
   * @return Zip code of person that requested delivery.
   */
  public String getZip() {
    return zip;
  }
}
