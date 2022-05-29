package br.com.takemehome.entities;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Address addressByBillingAddressId;
	@ManyToOne
	private Address addressByShippingAddressId;
	@ManyToOne
	private Customer customer;
	private String code;
	private String status;
	private Date date;
	private Date deliveryDate;
	private String paymentMethod;
	private BigDecimal shippingFee;
	private BigDecimal total;

	public Sale() {

	}

	public Sale(Date date, Date deliveryDate) {
		this.date = date;
		this.deliveryDate = deliveryDate;
	}

	public Sale(Integer id, Address addressByBillingAddressId, Address addressByShippingAddressId, Customer customer,
			String code, String status, Date date, Date deliveryDate, String paymentMethod, BigDecimal shippingFee,
			BigDecimal total) {
		super();
		this.id = id;
		this.addressByBillingAddressId = addressByBillingAddressId;
		this.addressByShippingAddressId = addressByShippingAddressId;
		this.customer = customer;
		this.code = code;
		this.status = status;
		this.date = date;
		this.deliveryDate = deliveryDate;
		this.paymentMethod = paymentMethod;
		this.shippingFee = shippingFee;
		this.total = total;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddressByBillingAddressId() {
		return addressByBillingAddressId;
	}

	public void setAddressByBillingAddressId(Address addressByBillingAddressId) {
		this.addressByBillingAddressId = addressByBillingAddressId;
	}

	public Address getAddressByShippingAddressId() {
		return addressByShippingAddressId;
	}

	public void setAddressByShippingAddressId(Address addressByShippingAddressId) {
		this.addressByShippingAddressId = addressByShippingAddressId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public BigDecimal getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
