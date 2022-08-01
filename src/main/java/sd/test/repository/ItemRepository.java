package sd.test.repository;

import org.springframework.stereotype.Repository;
import sd.test.model.Item;

import java.util.Map;

@Repository
public class ItemRepository {
    private final Map<Integer, Item> mapOfItems = Map.of(
            1, new Item(1, "Oneplus 7", "Oneplus mobile", 25000.00),
            2, new Item(2, "Realme 2", "Realme mobile", 7000.00),
            3, new Item(3, "Poco M4 Pro 5G", "Poco mobile", 14500.00),
            4, new Item(4, "Oneplus Nord Earbuds", "Oneplus Earbuds", 2500.00),
            5, new Item(5, "Sony Earbuds C500", "Sony Earbuds", 5700.00),
            6, new Item(6, "55 inch Sony Bravia Smart LED", "Sony SMart LED TV", 65000.00),
            7, new Item(7, "Hitachi 1.5 ton inverter AC", "Hitachi AC", 40000.00),
            8, new Item(8, "Milton 1 ltr water bottle", "Water bottle", 750.00),
            9, new Item(9, "LG double door refrigerator", "LG fridge", 35000.00),
            10, new Item(10, "LG micro oven", "LG micro oven", 10000.00));

    public Item getItem(Integer itemId) {
        return mapOfItems.get(itemId);
    }
}
