package toy.auction.item.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import toy.auction.item.model.dto.ItemResponse;

@Slf4j
@RestController
@RequestMapping("/api/item")
public class ItemController {
    @PostMapping("/{id}")
    public ItemResponse add(@PathVariable Long id){
        log.info("add {}",id);
        return new ItemResponse();
    }

    @GetMapping("/{id}")
    public ItemResponse get(@PathVariable Long id){
        log.info("get {}",id);
        return new ItemResponse();
    }

    @PatchMapping("/{id}")
    public ItemResponse patch(@PathVariable Long id){
        log.info("patch {}",id);
        return new ItemResponse();
    }

    @DeleteMapping("/{id}")
    public ItemResponse delete(@PathVariable Long id){
        log.info("delete {}",id);
        return new ItemResponse();
    }
}
