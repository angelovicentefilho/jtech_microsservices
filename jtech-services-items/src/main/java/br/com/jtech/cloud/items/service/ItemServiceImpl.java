package br.com.jtech.cloud.items.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jtech.cloud.items.clients.ProductsClientFeign;
import br.com.jtech.cloud.items.protocol.ItemResponse;

@Service
public class ItemServiceImpl implements ItemService {

	private final ProductsClientFeign client;

	@Autowired
	public ItemServiceImpl(final ProductsClientFeign client) {
		this.client = client;
	}

	@Override
	public List<ItemResponse> findAll() {
		return client.products().stream()//
				.map(product -> new ItemResponse(product, 1)).collect(Collectors.toList());
	}

	@Override
	public ItemResponse findByIdAndQuantity(Long id, Integer quantity) {
		return new ItemResponse(client.getById(id), quantity);
	}

}
