/**
 * 
 */
package com.imti.spring.jodamoney;

import java.math.BigDecimal;

import org.joda.money.CurrencyUnit;

/**
 * @author imteyaz
 *
 */
public class ExchangeWrapper {

	private CurrencyUnit baseCurrency;

	private CurrencyUnit xchangedCurrency;

	private BigDecimal amount;

	private BigDecimal conversionAmount;

	public CurrencyUnit getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(CurrencyUnit baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public CurrencyUnit getXchangedCurrency() {
		return xchangedCurrency;
	}

	public void setXchangedCurrency(CurrencyUnit xchangedCurrency) {
		this.xchangedCurrency = xchangedCurrency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getConversionAmount() {
		return conversionAmount;
	}

	public void setConversionAmount(BigDecimal conversionAmount) {
		this.conversionAmount = conversionAmount;
	}

	@Override
	public String toString() {
		return "ExchangeWrapper [baseCurrency=" + baseCurrency + ", xchangedCurrency=" + xchangedCurrency + ", amount="
				+ amount + ", conversionAmount=" + conversionAmount + "]";
	}

}
