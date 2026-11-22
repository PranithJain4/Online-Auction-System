/**
 * Represents an individual bid placed on an auction item.
 * Instances of this class are immutable once created.
 *
 * @author Chandan D K
 * @version 1.0
 */
public class Bid {

    // Stores the name of the person placing the bid
    private String bidderName;

    // Stores the amount of the bid
    private double amount;

    /**
     * Constructs a new Bid entry.
     *
     * @param bidderName the username of the bidder
     * @param amount     the monetary value offered
     */
    public Bid(String bidderName, double amount) {
        this.bidderName = bidderName;
        this.amount = amount;
    }

    /**
     * Returns the name of the bidder.
     *
     * @return the bidder's username
     */
    public String getBidderName() {
        return bidderName;
    }

    /**
     * Returns the bid amount.
     *
     * @return the monetary amount of the bid
     */
    public double getAmount() {
        return amount;
    }
}
