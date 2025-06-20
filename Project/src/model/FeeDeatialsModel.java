package model;

public class FeeDeatialsModel {

	private String ServiceType;       
    private double FeeAmount;        
    private String Currency;         
    private String PaymentStatus;     
    private String PaymentMethod;     
    private String TransactionID;    
    private double Discount;          
    private double TaxAmount;       
    private double TotalAmount;       
    private String PaymentDate;       
    private String Remarks;
    
    
	public String getServiceType() {
		return ServiceType;
	}
	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}
	public double getFeeAmount() {
		return FeeAmount;
	}
	public void setFeeAmount(double feeAmount) {
		FeeAmount = feeAmount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	public String getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
	public double getTaxAmount() {
		return TaxAmount;
	}
	public void setTaxAmount(double taxAmount) {
		TaxAmount = taxAmount;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getPaymentDate() {
		return PaymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		PaymentDate = paymentDate;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}  
    
 }
