package com.sap.cx.jester.tlsplayground.client.tls;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties(prefix="tls")
@Data
public class TlsProperties {

	@Valid
	@NotNull
	private String version;
}
