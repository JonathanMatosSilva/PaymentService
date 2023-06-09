package services;

public class PaypalService implements OnlinePaymentService {
	
	public Double paymentFee(Double amount) {
		return 0.02 * amount;
	}
	
	public Double interest(Double amount, Integer months) {
		return (0.01 * amount) * months;
	}

}
