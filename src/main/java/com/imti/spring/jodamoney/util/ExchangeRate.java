/**
 * 
 */
package com.imti.spring.jodamoney.util;

/**
 * @author imteyaz
 *
 */
public class ExchangeRate {

	private String currency;

	private String conversionRate;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(String conversionRate) {
		this.conversionRate = conversionRate;
	}

	@Override
	public String toString() {
		return "ExchangeRate [currency=" + currency + ", conversionRate=" + conversionRate + "]";
	}

}
