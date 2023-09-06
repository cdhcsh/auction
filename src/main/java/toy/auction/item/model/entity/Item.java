package toy.auction.item.model.entity;

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
}
