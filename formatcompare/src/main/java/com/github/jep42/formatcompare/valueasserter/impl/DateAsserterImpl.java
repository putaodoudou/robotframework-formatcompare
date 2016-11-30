package com.github.jep42.formatcompare.valueasserter.impl;

import java.util.Date;

import com.github.jep42.formatcompare.util.FormatComparatorException;
import com.github.jep42.formatcompare.valueasserter.api.AssertionException;
import com.github.jep42.formatcompare.valueasserter.api.ValueAsserter;

public class DateAsserterImpl implements ValueAsserter<Date> {

	public static final String CONDITION_EQUAL = "=";

	public static final String CONDITION_AFTER = ">";

	public static final String CONDITION_BEFORE = "<";


	@Override
	public void assertCondition(Date masterValue, Date slaveValue, String condition) throws AssertionException, FormatComparatorException {

		if (CONDITION_EQUAL.equals(condition)) {
			if (!masterValue.equals(slaveValue)) {
				throw new AssertionException(String.format(ASSERTION_FAILED_MESSAGE, masterValue, condition, slaveValue));
			}
		} else if (CONDITION_AFTER.equals(condition)) {
			if (!masterValue.after(slaveValue)) {
				throw new AssertionException(String.format(ASSERTION_FAILED_MESSAGE, masterValue, condition, slaveValue));
			}
		} else if (CONDITION_BEFORE.equals(condition)) {
			if (!masterValue.before(slaveValue)) {
				throw new AssertionException(String.format(ASSERTION_FAILED_MESSAGE, masterValue, condition, slaveValue));
			}
		} else {
			throw new FormatComparatorException(String.format(COMPARATOR_NOT_SUPPORTED_ERROR_MESSAGE, "DATE/TIME", condition));
		}
	}

}