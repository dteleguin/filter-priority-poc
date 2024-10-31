package org.acme.filters;

import jakarta.annotation.Priority;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;
import jakarta.ws.rs.ext.Provider;
import java.io.IOException;
import org.jboss.logging.Logger;

@Provider
@Priority(Integer.MIN_VALUE)
public class FilterMIN implements ContainerResponseFilter {

    private static final Logger LOG = Logger.getLogger(FilterMIN.class);

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        LOG.info("filter");
    }

}
