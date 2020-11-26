package com.aem.community.core.services.impl;

import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = AnotherSampleService.class, property = {
		Constants.SERVICE_DESCRIPTION + "=Another Sample Configuration" })
@Designate(ocd = AnotherSampleService.Config.class)
public class AnotherSampleService {
	private static final Logger logger = LoggerFactory.getLogger(AnotherSampleService.class);

	@ObjectClassDefinition(name = "POWER BI configuration", description = "POWER BI configuration")
	public static @interface Config {

		@AttributeDefinition(name = "My Property", description = "My Property", type = AttributeType.STRING)
		String myProperty() default "myvalue";
	}

	private String myProperty;

	@Activate
	protected void activate(final Config config) {
		this.myProperty = (String.valueOf(config.myProperty()) != null) ? String.valueOf(config.myProperty()) : null;
	}

	/**
	 * @return myProperty
	 */
	public String getMyProperty() {
		return this.myProperty;
	}
}