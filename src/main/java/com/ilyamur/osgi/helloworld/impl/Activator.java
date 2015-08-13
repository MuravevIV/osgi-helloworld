package com.ilyamur.osgi.helloworld.impl;

import com.ilyamur.osgi.helloworld.service.OsgiHelloworldService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.Hashtable;

public class Activator implements BundleActivator {

    public void start(BundleContext bundleContext) throws Exception {
        Hashtable<String, String> props = new Hashtable<String, String>();
        props.put("Language", "English");
        bundleContext.registerService(OsgiHelloworldService.class.getName(), new OsgiHelloworldServiceImpl(), props);
        System.out.println("osgi-helloworld start");
    }

    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println("osgi-helloworld stop");
    }
}
