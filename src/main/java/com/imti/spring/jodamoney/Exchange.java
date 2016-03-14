/**
 * 
 */
package com.imti.spring.jodamoney;

import java.math.RoundingMode;

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

	

}
