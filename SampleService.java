package com.aem.community.core.services;

import org.apache.sling.api.resource.ResourceResolver;

import java.util.List;


public interface SampleService {

    List<String> getDetail(ResourceResolver resourceResolver);

}
