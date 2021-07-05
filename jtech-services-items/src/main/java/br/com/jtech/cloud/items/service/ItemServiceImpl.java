package br.com.jtech.cloud.items.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import br.com.jtech.cloud.items.clients.ProductsClientFeign;
import br.com.jtech.cloud.items.protocol.ItemResponse;

@Service
public class ItemServiceImpl implements ItemService {

	private final ProductsClientFeign client;
	private final Environment env;

	@Autowired
	public ItemServiceImpl(final ProductsClientFeign client, Environment env) {
		this.client = client;
		this.env = env;
	}

	@Override
	public List<ItemResponse> findAll() {
		return client.products().stream()//
				.map(product -> new ItemResponse(product, 1)).collect(Collectors.toList());
	}

	@Override
	public ItemResponse findByIdAndQuantity(Long id, Integer quantity) {
		String port = env.getProperty("local.server.port");
		ItemResponse response = new ItemResponse(client.getById(id), quantity);
		response.setPort(Integer.parseInt(port));
		return response;
	}

}
