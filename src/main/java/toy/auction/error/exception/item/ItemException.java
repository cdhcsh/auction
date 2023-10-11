package toy.auction.error.exception.item;

import toy.auction.error.exception.AuctionException;

public class ItemException extends AuctionException {
    //item 예외 클래스
    public ItemException(String str){
        super(str);
    }
}
