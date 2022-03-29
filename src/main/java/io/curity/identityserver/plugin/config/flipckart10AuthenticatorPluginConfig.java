package io.curity.identityserver.plugin.config;

import se.curity.identityserver.sdk.config.Configuration;
import se.curity.identityserver.sdk.config.annotation.DefaultString;
import se.curity.identityserver.sdk.config.annotation.DefaultURI;
import se.curity.identityserver.sdk.config.annotation.Description;
import se.curity.identityserver.sdk.service.SessionManager;

import java.net.URI;

@SuppressWarnings("InterfaceNeverImplemented")
public interface flipckart10AuthenticatorPluginConfig extends Configuration
{
    SessionManager getSessionManager();
}
