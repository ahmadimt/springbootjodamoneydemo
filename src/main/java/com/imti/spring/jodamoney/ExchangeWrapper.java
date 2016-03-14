/**
 * 
 */
package com.imti.spring.jodamoney;

import java.math.BigDecimal;
import java.util.Map;

import org.joda.money.CurrencyUnit;

import com.imti.spring.jodamoney.util.ExchangeRate;

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

	public static ExchangeWrapper getExchangeWrapper(Map<String, ExchangeRate> rateMap) {
		ExchangeWrapper exchangeWrapper = new ExchangeWrapper();
		exchangeWrapper.setBaseCurrency(CurrencyUnit.USD);
		exchangeWrapper
				.setXchangedCurrency(CurrencyUnit.getInstance(rateMap.get(CurrencyUnit.GBP.toString()).getCurrency()));
		exchangeWrapper.setAmount(BigDecimal.valueOf(100));
		exchangeWrapper.setConversionAmount(
				BigDecimal.valueOf(Double.parseDouble(rateMap.get(CurrencyUnit.GBP.toString()).getConversionRate())));
		return exchangeWrapper;
	}
}
