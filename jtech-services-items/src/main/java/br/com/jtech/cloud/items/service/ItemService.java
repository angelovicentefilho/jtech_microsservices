package br.com.jtech.cloud.items.service;

import java.util.List;

import br.com.jtech.cloud.items.protocol.ItemResponse;

public interface ItemService {

	List<ItemResponse> findAll();

	ItemResponse findByIdAndQuantity(Long id, Integer quantity);

}
