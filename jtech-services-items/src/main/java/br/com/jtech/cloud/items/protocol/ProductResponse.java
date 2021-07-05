package br.com.jtech.cloud.items.protocol;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuppressWarnings("serial")
public class ProductResponse implements Serializable {

	private Long id;
	private String name;
	private Double price;
	private Date createdAt;

}
