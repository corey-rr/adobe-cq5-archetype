#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {

    /**
     * default logger
     */
    private static final Logger log = LoggerFactory.getLogger(Activator.class);

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator${symbol_pound}start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        log.info(context.getBundle().getSymbolicName() + " started");
    }

    /*
     * (non-Javadoc)
     * @see org.osgi.framework.BundleActivator${symbol_pound}stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        log.info(context.getBundle().getSymbolicName() + " stopped");
    }
}
