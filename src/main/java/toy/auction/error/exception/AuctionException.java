package toy.auction.error.exception;

/**
 * global exception
 */
public class AuctionException extends Exception {
    private static String EXCEPTION_MESSAGE = "AuctionException";
    public AuctionException(String str){
        this.EXCEPTION_MESSAGE = str;
    }

    public AuctionException(){};

}
