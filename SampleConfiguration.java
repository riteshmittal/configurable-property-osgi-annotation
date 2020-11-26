package com.aem.community.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Sample Configuration")
public @interface SampleConfiguration {

	@AttributeDefinition(name = "My Property", description = "My Property", type = AttributeType.STRING)
	String myProperty() default "myvalue";

}
