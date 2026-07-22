package models;

public class Shipment {
  private String trackingCode;
  private String recipient;
  private PackageDimensions dimensions;
  private int priority;

  public Shipment(String trackingCode, String recipient, PackageDimensions dimensions, int priority) {
    this.trackingCode = trackingCode;
    this.recipient = recipient;
    this.dimensions = dimensions;
    this.priority = priority;
  }

  public String getTrackingCode() {
    return trackingCode;
  }

  public String getRecipient() {
    return recipient;
  }

  public PackageDimensions getDimensions() {
    return dimensions;
  }

  public int getPriority() {
    return priority;
  }

  @Override
  public String toString() {
    return "Shipment [code=" + trackingCode + ", priority=" + priority
        + ", vol=" + dimensions.getVolume() + ", weight=" + dimensions.getWeight() + "]";
  }
}
