package com.github.jep42.formatcompare.fieldmapper.impl;

import com.github.jep42.formatcompare.fieldmapper.api.FieldMapping;

public final class FieldMappingFactory {

	private FieldMappingFactory() {
		super();
	}

	public static FieldMapping createFieldMapping(String masterSelector, String slaveSelector, String type,
			String condition, String masteroptions, String slaveOptions, int mappingFileLineIndex) {
		return new DefaultFieldMappingImpl(masterSelector, slaveSelector, type, condition, masteroptions, slaveOptions, mappingFileLineIndex);
	}

}
