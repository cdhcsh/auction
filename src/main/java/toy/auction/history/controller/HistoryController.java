package toy.auction.history.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import toy.auction.history.model.dto.HistoryResponse;

@Slf4j
@RestController
@RequestMapping("/api/item")
public class HistoryController {
    @PostMapping("/{id}")
    public HistoryResponse add(@PathVariable Long id){
        log.info("add {}",id);
        return new HistoryResponse();
    }

    @GetMapping("/{id}")
    public HistoryResponse get(@PathVariable Long id){
        log.info("get {}",id);
        return new HistoryResponse();

    }

    @PatchMapping("/{id}")
    public HistoryResponse patch(@PathVariable Long id){
        log.info("patch {}",id);
        return new HistoryResponse();
    }

    @DeleteMapping("/{id}")
    public HistoryResponse delete(@PathVariable Long id){
        log.info("delete {}",id);
        return new HistoryResponse();
    }
}
