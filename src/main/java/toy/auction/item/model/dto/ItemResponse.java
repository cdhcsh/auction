package toy.auction.item.model.dto;

import toy.auction.item.model.entity.Item;

public class ItemResponse {
    private Long id;
    private String name;
    private Long typeId;

    private Integer price;

    public ItemResponse(Long id, String name, Long typeId, Integer price) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.price = price;
    }
    public Item toEntity(){
        return new Item(id, name, typeId, price);
    }
}
