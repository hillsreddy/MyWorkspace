package spring.orm;

import java.math.BigDecimal;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private BigDecimal eno;
	private String ename;
	private BigDecimal salary;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(BigDecimal eno) {
		this.eno = eno;
	}

	/** full constructor */
	public Emp(BigDecimal eno, String ename, BigDecimal salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	// Property accessors

	public BigDecimal getEno() {
		return this.eno;
	}

	public void setEno(BigDecimal eno) {
		this.eno = eno;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

}