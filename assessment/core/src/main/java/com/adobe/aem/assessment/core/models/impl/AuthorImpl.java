package com.adobe.aem.assessment.core.models.impl;
import com.adobe.aem.assessment.core.models.Author;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

// import com.day.cq.wcm.api.Page;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import com.fasterxml.jackson.annotation.JsonProperty;
// import com.fasterxml.jackson.annotation.JsonRootName;
// import org.apache.sling.api.SlingHttpServletRequest;
// import org.apache.sling.api.resource.ResourceResolver;
// import org.apache.sling.models.annotations.injectorspecific.*;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import javax.inject.Named;
// import java.util.*;
@Model(adaptables = SlingHttpServletRequest.class,
        adapters = Author.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorImpl implements Author{
    @ValueMapValue
    String fname;

    @ValueMapValue
    @Required
    @Default(values= "Geeks")
    String lname;

    @ValueMapValue
    boolean professor;

    @Override
    public String getFirstName() {
        return fname;
    }
    @Override
    public String getLastName() {
        return lname;
    }
    @Override
    public boolean getIsProfessor() {
        return professor;
    }
}