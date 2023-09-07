package toy.auction.item.model.entity;

import toy.auction.item.model.dto.ItemResponse;

public class Item {
    //아이템 엔티티
    private Long id;
    private String name;
    private Long typeId;

    private Integer price;

    public Item(Long id, String name, Long typeId, Integer price) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.price = price;
    }
    public ItemResponse from(){
        return new ItemResponse(id, name, typeId, price);
    }
}
