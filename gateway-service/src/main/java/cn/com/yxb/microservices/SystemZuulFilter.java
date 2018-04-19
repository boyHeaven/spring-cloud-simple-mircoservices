package cn.com.yxb.microservices;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created on 2017/9/24.
 *
 * @author frank.
 */
@Component
public class SystemZuulFilter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(SystemZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        String host = context.getRequest().getRemoteHost();

        logger.info("SystemZuulFilter get host =====" + host);
        return null;
    }
}
