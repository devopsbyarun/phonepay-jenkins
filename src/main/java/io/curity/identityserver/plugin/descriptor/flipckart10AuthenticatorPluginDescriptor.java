package io.curity.identityserver.plugin.descriptor;

import io.curity.identityserver.plugin.authentication.flipckart10AuthenticatorRequestHandler;
import io.curity.identityserver.plugin.config.flipckart10AuthenticatorPluginConfig;
import se.curity.identityserver.sdk.authentication.AuthenticatorRequestHandler;
import se.curity.identityserver.sdk.plugin.descriptor.AuthenticatorPluginDescriptor;

import java.util.Map;

import static java.util.Collections.singletonMap;
import static java.util.Collections.unmodifiableMap;

public final class flipckart10AuthenticatorPluginDescriptor implements AuthenticatorPluginDescriptor<flipckart10AuthenticatorPluginConfig>
{
    @Override
    public String getPluginImplementationType()
    {
        return "flipckart10";
    }

    @Override
    public Class<? extends flipckart10AuthenticatorPluginConfig> getConfigurationType()
    {
        return flipckart10AuthenticatorPluginConfig.class;
    }

    @Override
    public Map<String, Class<? extends AuthenticatorRequestHandler<?>>> getAuthenticationRequestHandlerTypes()
    {
        return unmodifiableMap(singletonMap("index", flipckart10AuthenticatorRequestHandler.class));
    }
}
