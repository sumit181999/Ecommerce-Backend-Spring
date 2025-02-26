package com.dailycodebuffer.OrderService.model;

import java.time.Instant;

import com.dailycodebuffer.OrderService.external.response.PaymentResponse;
import com.dailycodebuffer.OrderService.model.PaymentMode;
import com.dailycodebuffer.ProductService.model.ProductResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderResponse {
	
	private long orderId;
	private Instant orderDate;
	private String orderStatus;
	private long amount;
	private ProductDetails productDetails;
	private PaymentDetails paymentDetails;
	
	@Data
	@Builder
	@AllArgsConstructor
	@NoArgsConstructor
	public static class ProductDetails {

	    private String productName;
	    private long productId;
	    private long quantity;
	    private long price;
	}
	
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Builder
	public static class PaymentDetails {

		private long paymentId;
		private String paymentStatus;
		private PaymentMode paymentMode;
		private long amount;
		private Instant paymentDate;
		private long orderId;
		
	}

	
}
