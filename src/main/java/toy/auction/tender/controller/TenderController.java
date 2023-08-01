package toy.auction.tender.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import toy.auction.tender.model.dto.TenderResponse;

@Slf4j
@RestController
@RequestMapping("/api/item")
public class TenderController {
    @PostMapping("/{id}")
    public TenderResponse add(@PathVariable Long id){
        log.info("add {}",id);
        return new TenderResponse();
    }

    @GetMapping("/{id}")
    public TenderResponse get(@PathVariable Long id){
        log.info("get {}",id);
        return new TenderResponse();

    }

    @PatchMapping("/{id}")
    public TenderResponse patch(@PathVariable Long id){
        log.info("patch {}",id);
        return new TenderResponse();
    }

    @DeleteMapping("/{id}")
    public TenderResponse delete(@PathVariable Long id){
        log.info("delete {}",id);
        return new TenderResponse();
    }
}
