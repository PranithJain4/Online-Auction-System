import java.util.ArrayList; // Imports ArrayList to store bid history

/**
 * Manages an individual auction listing, including item attributes,
 * current highest bid, active status, and bidding history.
 *
 * @author Chandan D K
 * @version 1.0
 */
public class Auction {

    // Stores auction ID
    private int id;

    // Stores the name of the auction item
    private String itemName;

    // Stores the current highest bid price
    private double price;

    // Stores the seller's username
    private String sellerName;

    // Stores the username of the highest bidder
    private String highestBidder;

    // Checks whether the auction is active or closed
    private boolean active;

    // Stores all bids placed on this auction
    private ArrayList<Bid> bids;

    /**
     * Initializes a new Auction item listing with initial state.
     *
     * @param id         the unique identifier for the auction
     * @param itemName   the title or description of the auction item
     * @param price      the initial reserve starting price
     * @param sellerName the username of the item's creator
     */
    public Auction(int id, String itemName, double price, String sellerName) {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.sellerName = sellerName;
        this.highestBidder = "No bids"; // Initially no bidder
        this.active = true; // Auction starts as active
        this.bids = new ArrayList<Bid>(); // Creates empty bid history
    }

    /**
     * Returns the auction ID.
     *
     * @return the unique integer ID
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the item name.
     *
     * @return the name of the auction item
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Returns the current highest price.
     *
     * @return the current price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the seller's name.
     *
     * @return the username of the seller
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Returns the highest bidder's username.
     *
     * @return highest bidder username or "No bids"
     */
    public String getHighestBidder() {
        return highestBidder;
    }

    /**
     * Returns whether the auction is currently active.
     *
     * @return true if open for bids; false if closed
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Validates and places a new bid on this auction.
     *
     * @param bidderName the username of the bidder attempting to bid
     * @param amount     the monetary bid amount offered
     */
    public void placeBid(String bidderName, double amount) {

        // Checks whether the auction is closed
        if (active == false) {
            System.out.println("Auction is closed.");

        // Prevents the seller from bidding on their own item
        } else if (bidderName.equals(sellerName)) {
            System.out.println("Seller cannot bid on own item.");

        // Checks whether the bid is higher than the current price
        } else if (amount <= price) {
            System.out.println("Bid must be higher than " + price);

        } else {
            price = amount; // Updates the current highest price
            highestBidder = bidderName; // Updates the highest bidder

            // Adds the new bid to bid history
            bids.add(new Bid(bidderName, amount));

            System.out.println("Bid placed successfully.");
        }
    }

    /**
     * Closes the auction by changing its status to inactive.
     */
    public void closeAuction() {
        active = false;
    }

    /**
     * Displays complete auction information and chronological bid history.
     */
    public void showDetails() {
        System.out.println("\nAuction ID: " + id);
        System.out.println("Item Name: " + itemName);
        System.out.println("Seller: " + sellerName);
        System.out.println("Current Price: " + price);
        System.out.println("Highest Bidder: " + highestBidder);

        // Displays the current auction status
        if (active == true) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Closed");
        }

        // Displays the complete bidding history
        System.out.println("Bid History:");

        // Checks whether any bids have been placed
        if (bids.size() == 0) {
            System.out.println("No bids placed.");
        } else {

            // Iterates through all bids and displays bidder and amount
            for (int i = 0; i < bids.size(); i++) {
                System.out.println(bids.get(i).getBidderName() + " - "
                        + bids.get(i).getAmount());
            }
        }
    }
}
