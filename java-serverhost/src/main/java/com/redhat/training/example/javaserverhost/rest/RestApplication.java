package com.redhat.training.example.javaserverhost.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class RestApplication extends Application {
	String msg = "I am running on server "+host+" Version 2.0 \n";

}
