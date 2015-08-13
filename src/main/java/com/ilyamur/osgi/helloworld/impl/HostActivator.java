package com.ilyamur.osgi.helloworld.impl;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HostActivator implements BundleActivator {

    private BundleContext context = null;

    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
    }

    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    public Bundle[] getBundles() {
        Bundle[] bundles = null;
        if (context != null) {
            bundles = context.getBundles();
        }
        return bundles;
    }
}
