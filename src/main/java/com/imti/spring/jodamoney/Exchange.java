/**
 * 
 */
package com.imti.spring.jodamoney;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

/**
 * @author imteyaz
 *
 */
public class Exchange {

	public static void convertMoney(ExchangeWrapper exchangeWrapper) {

		Money money = Money.of(exchangeWrapper.getBaseCurrency(), exchangeWrapper.getAmount());
		Money gbpMoney = money.convertedTo(exchangeWrapper.getXchangedCurrency(), exchangeWrapper.getConversionAmount(),
				RoundingMode.CEILING);
		System.out.println("Converted Money: " + gbpMoney);

	}

	public static ExchangeWrapper getExchangeWrapper() {
		ExchangeWrapper exchangeWrapper = new ExchangeWrapper();
		exchangeWrapper.setBaseCurrency(CurrencyUnit.USD);
		exchangeWrapper.setXchangedCurrency(CurrencyUnit.GBP);
		exchangeWrapper.setAmount(BigDecimal.valueOf(100));
		exchangeWrapper.setConversionAmount(BigDecimal.valueOf(0.70));
		return exchangeWrapper;
	}
}
