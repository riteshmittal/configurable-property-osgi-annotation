package com.aem.community.core.services.impl;

import java.util.List;

import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

import com.aem.community.core.services.SampleConfiguration;
import com.aem.community.core.services.SampleService;

@Component(service = SampleService.class, immediate = true)
@Designate(ocd = SampleConfiguration.class)
public class SampleServiceImpl implements SampleService {

	/**
	 * The config.
	 */
	private SampleConfiguration config;

	/**
	 * Activate.
	 * 
	 * @param config
	 */
	@Activate
	protected void activate(SampleConfiguration config) {
		this.config = config;
	}

	/**
	 * @return myProperty
	 */
	public String getMyProperty() {
		return config.myProperty();
	}

	@Override
	public List<String> getDetail(ResourceResolver resourceResolver) {
		// TODO Auto-generated method stub
		return null;
	}

}