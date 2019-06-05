package pl.wasala.webserver.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wasala.webserver.model.Item;
import pl.wasala.webserver.repository.ItemRepository;

import java.util.List;

@RestController
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/items")
    public List<Item> all(){
        return itemRepository.findAll();
    }

    @PostMapping("/items")
    public Item create(@RequestBody Item item){
        return itemRepository.save(item);
    }

}
