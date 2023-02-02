package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate date;
	private double total;
	
	private List<Installment> Installments = new ArrayList<>();

	public Contract() {

	}

	public Contract(Integer number, LocalDate date, double total) {
		this.number = number;
		this.date = date;
		this.total = total;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Installment> getInstallments() {
		return Installments;
	}


	
	
	

}
