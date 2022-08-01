package sd.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sd.test.model.Item;
import sd.test.repository.ItemRepository;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public Item getItemInfo(int itemId) {
        return itemRepository.getItem(itemId);
    }
}
