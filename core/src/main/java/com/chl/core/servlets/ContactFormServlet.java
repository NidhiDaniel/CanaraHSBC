package com.chl.core.servlets;

import java.io.IOException;
import javax.servlet.Servlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, property = { Constants.SERVICE_DESCRIPTION + "=Contact Form Submit Servlet",
    "sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/contactform",
    "sling.servlet.extensions=" + "json" })
public class ContactFormServlet extends SlingAllMethodsServlet {

  private static final Logger LOG = LoggerFactory.getLogger(ContactFormServlet.class);

  @Override
  protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException {

    try {
      String fieldNames[] = request.getParameterValues("fieldNames[]");
      String fieldValues[] = request.getParameterValues("fieldValues[]");
      ObjectNode jsonObject = JsonNodeFactory.instance.objectNode();

      for (int i = 0; i < fieldNames.length; i++) {
        jsonObject.put(fieldNames[i], fieldValues[i]);
      }
    } catch (Exception e) {
      LOG.error(e.getMessage());     
    }
  }
}
