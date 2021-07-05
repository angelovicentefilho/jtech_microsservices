package br.com.jtech.cloud.items.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.jtech.cloud.items.protocol.ItemResponse;
import br.com.jtech.cloud.items.service.ItemService;

@CrossOrigin
@RestController
public class ItemController {

	private final ItemService itemService;

	@Autowired
	public ItemController(final ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping
	public List<ItemResponse> findAll() {
		return this.itemService.findAll();
	}
	
	@GetMapping("/{id}/{quantity}")
	public ItemResponse details(@PathVariable Long id, @PathVariable Integer quantity) {
		return this.itemService.findByIdAndQuantity(id, quantity);
	}

}
