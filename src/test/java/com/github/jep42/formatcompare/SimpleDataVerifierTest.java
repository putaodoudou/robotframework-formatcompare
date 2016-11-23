package com.github.jep42.formatcompare;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.TimeZone;

import org.junit.Test;

import com.github.jep42.formatcompare.formathandler.FormatHandlerFactory;
import com.github.jep42.formatcompare.formathandler.api.FormatHandler;


public class SimpleDataVerifierTest {

	private static final String  TIMEZONE_PLUS_ONE_SHORT = "GMT+01:00";


	private static final String  DATE_TIME_FORMAT_PATTERN_DE_XML = "yyyyMMddHHmmss";

	private static final String  DATE_TIME_FORMAT_PATTERN_DE_CSV = "yyyyMMddHHmmss";

	private static final String  DATE_TIME_FORMAT_PATTERN_DE_JSON = "dd.MM.yyyy HH:mm:ss";


	private static final String  DATE_FORMAT_PATTERN_DE_XML = "yyyyMMddHHmmss";

	private static final String  DATE_FORMAT_PATTERN_DE_CSV = "yyyyMMddHHmmss";

	private static final String  DATE_FORMAT_PATTERN_DE_JSON = "dd.MM.yyyy";


	private static final String  NUMBER_FORMAT_PATTERN_DE_XML = " .2";

	private static final String  NUMBER_FORMAT_PATTERN_DE_CSV = " ,2";

	private static final String  NUMBER_FORMAT_PATTERN_DE_JSON = " ,2";


	@Test
	public void verify_csv2xml_numeric() throws Exception {
		String csvString = this.getFile("com/github/jep42/formatcompare/numeric/numeric_test.csv");
		String xmlString = this.getFile("com/github/jep42/formatcompare/numeric/numeric_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/numeric/numeric_csv2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForCSV = FormatHandlerFactory.getFormatHandlerForCSV(csvString, 0, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_CSV, DATE_FORMAT_PATTERN_DE_CSV, NUMBER_FORMAT_PATTERN_DE_CSV);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForCSV, formatHandlerForXML);
	}

	@Test
	public void verify_json2xml_numeric() throws Exception {
		String jsonString = this.getFile("com/github/jep42/formatcompare/numeric/numeric_test.json");
		String xmlString = this.getFile("com/github/jep42/formatcompare/numeric/numeric_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/numeric/numeric_json2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForJSON = FormatHandlerFactory.getFormatHandlerForJson(jsonString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_JSON, DATE_FORMAT_PATTERN_DE_JSON, NUMBER_FORMAT_PATTERN_DE_JSON);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForJSON, formatHandlerForXML);
	}

	@Test
	public void verify_csv2xml_string() throws Exception {
		String csvString = this.getFile("com/github/jep42/formatcompare/string/string_test.csv");
		String xmlString = this.getFile("com/github/jep42/formatcompare/string/string_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/string/string_csv2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForCSV = FormatHandlerFactory.getFormatHandlerForCSV(csvString, 0, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_CSV, DATE_FORMAT_PATTERN_DE_CSV, NUMBER_FORMAT_PATTERN_DE_CSV);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForCSV, formatHandlerForXML);
	}

	@Test
	public void verify_json2xml_string() throws Exception {
		String jsonString = this.getFile("com/github/jep42/formatcompare/string/string_test.json");
		String xmlString = this.getFile("com/github/jep42/formatcompare/string/string_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/string/string_json2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForJSON = FormatHandlerFactory.getFormatHandlerForJson(jsonString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_JSON, DATE_FORMAT_PATTERN_DE_JSON, NUMBER_FORMAT_PATTERN_DE_JSON);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForJSON, formatHandlerForXML);
	}


	@Test
	public void verify_csv2xml_date() throws Exception {
		String csvString = this.getFile("com/github/jep42/formatcompare/date/date_test.csv");
		String xmlString = this.getFile("com/github/jep42/formatcompare/date/date_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/date/date_csv2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForCSV = FormatHandlerFactory.getFormatHandlerForCSV(csvString, 0, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_CSV, DATE_FORMAT_PATTERN_DE_CSV, NUMBER_FORMAT_PATTERN_DE_CSV);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForCSV, formatHandlerForXML);
	}

	@Test
	public void verify_json2xml_date() throws Exception {
		String jsonString = this.getFile("com/github/jep42/formatcompare/date/date_test.json");
		String xmlString = this.getFile("com/github/jep42/formatcompare/date/date_test.xml");
		String mapFilePath = this.getMapFilePath("com/github/jep42/formatcompare/date/date_json2xml.mapfile");

		FormatHandler formatHandlerForXML = FormatHandlerFactory.getFormatHandlerForXML(xmlString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_XML, DATE_FORMAT_PATTERN_DE_XML, NUMBER_FORMAT_PATTERN_DE_XML);
		FormatHandler formatHandlerForJSON = FormatHandlerFactory.getFormatHandlerForJson(jsonString, TimeZone.getTimeZone(TIMEZONE_PLUS_ONE_SHORT), DATE_TIME_FORMAT_PATTERN_DE_JSON, DATE_FORMAT_PATTERN_DE_JSON, NUMBER_FORMAT_PATTERN_DE_JSON);

		SimpleDataVerifier.createVerifier().verify(mapFilePath, formatHandlerForJSON, formatHandlerForXML);
	}


	private String getFile(String ressource) {
		InputStream is = getClass().getClassLoader().getResourceAsStream(ressource);
		InputStreamReader inputStreamReader = new InputStreamReader(is);
		return this.loadFile(inputStreamReader);
	}



	private String getMapFilePath(String mapFile) throws Exception {
		URL resource = getClass().getClassLoader().getResource(mapFile);
		return (new File(resource.toURI())).getAbsolutePath();
	}

	private String loadFile(Reader reader) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(reader);

		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    return sb.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			this.closeStream(br);
		}
	}

	private void closeStream(BufferedReader br) {
		try {
			if (br != null) {
				br.close();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
