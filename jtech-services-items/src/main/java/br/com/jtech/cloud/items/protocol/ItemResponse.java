package br.com.jtech.cloud.items.protocol;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ItemResponse {

	private ProductResponse product;
	private Integer quantity;
	private Integer port;

	public double getTotal() {
		return getProduct().getPrice() * getQuantity().doubleValue();
	}
	
	
	public ItemResponse(ProductResponse product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
}
