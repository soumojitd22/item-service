package sd.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sd.test.model.Item;
import sd.test.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping(path = "/item")
    public Item getItemInfo(@RequestParam("id") int itemId) {
        return itemService.getItemInfo(itemId);
    }
}
