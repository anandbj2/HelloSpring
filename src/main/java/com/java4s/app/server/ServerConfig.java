package com.java4s.app.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerConfig implements EmbeddedServletContainerCustomizer{

	@Override
	public void customize(ConfigurableEmbeddedServletContainer arg0) {
		// TODO Auto-generated method stub
		arg0.setPort(2018);
		arg0.setContextPath("/mangement");
	}

}
