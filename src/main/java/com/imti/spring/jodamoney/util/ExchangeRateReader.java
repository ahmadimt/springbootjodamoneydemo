/**
 * 
 */
package com.imti.spring.jodamoney.util;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

/**
 * @author imteyaz
 *
 */
public class ExchangeRateReader {

	public static Map<String, ExchangeRate> getExchangeRateFromCSV(String pathToCSV) throws Exception {

		ICsvBeanReader csvMapReader = null;
		try {
			Map<String, ExchangeRate> map = new HashMap<>();
			csvMapReader = new CsvBeanReader(new FileReader(new File(pathToCSV)), CsvPreference.STANDARD_PREFERENCE);
			final String[] headers = csvMapReader.getHeader(true);
			final String[] formattedHeaders = new String[headers.length];
			for (int i = 0; i < headers.length; i++) {
				formattedHeaders[i] = headers[i].replaceAll("\\s+", "");
			}
			final CellProcessor[] cellProcessors = new CellProcessor[headers.length];
			ExchangeRate exchangeRate;
			while ((exchangeRate = csvMapReader.read(ExchangeRate.class, formattedHeaders, cellProcessors)) != null) {
				map.put(exchangeRate.getCurrency(), exchangeRate);
			}
			return map;
		} finally {
			if (Objects.nonNull(csvMapReader)) {
				csvMapReader.close();
			}
		}

	}

}
