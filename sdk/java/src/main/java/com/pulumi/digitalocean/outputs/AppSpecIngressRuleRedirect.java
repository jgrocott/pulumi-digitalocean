// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecIngressRuleRedirect {
    /**
     * @return The authority/host to redirect to. This can be a hostname or IP address.
     * 
     */
    private @Nullable String authority;
    /**
     * @return The port to redirect to.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return The redirect code to use. Supported values are `300`, `301`, `302`, `303`, `304`, `307`, `308`.
     * 
     */
    private @Nullable Integer redirectCode;
    /**
     * @return The scheme to redirect to. Supported values are `http` or `https`
     * 
     */
    private @Nullable String scheme;
    /**
     * @return An optional URI path to redirect to.
     * 
     */
    private @Nullable String uri;

    private AppSpecIngressRuleRedirect() {}
    /**
     * @return The authority/host to redirect to. This can be a hostname or IP address.
     * 
     */
    public Optional<String> authority() {
        return Optional.ofNullable(this.authority);
    }
    /**
     * @return The port to redirect to.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The redirect code to use. Supported values are `300`, `301`, `302`, `303`, `304`, `307`, `308`.
     * 
     */
    public Optional<Integer> redirectCode() {
        return Optional.ofNullable(this.redirectCode);
    }
    /**
     * @return The scheme to redirect to. Supported values are `http` or `https`
     * 
     */
    public Optional<String> scheme() {
        return Optional.ofNullable(this.scheme);
    }
    /**
     * @return An optional URI path to redirect to.
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecIngressRuleRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String authority;
        private @Nullable Integer port;
        private @Nullable Integer redirectCode;
        private @Nullable String scheme;
        private @Nullable String uri;
        public Builder() {}
        public Builder(AppSpecIngressRuleRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authority = defaults.authority;
    	      this.port = defaults.port;
    	      this.redirectCode = defaults.redirectCode;
    	      this.scheme = defaults.scheme;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder authority(@Nullable String authority) {
            this.authority = authority;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder redirectCode(@Nullable Integer redirectCode) {
            this.redirectCode = redirectCode;
            return this;
        }
        @CustomType.Setter
        public Builder scheme(@Nullable String scheme) {
            this.scheme = scheme;
            return this;
        }
        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public AppSpecIngressRuleRedirect build() {
            final var _resultValue = new AppSpecIngressRuleRedirect();
            _resultValue.authority = authority;
            _resultValue.port = port;
            _resultValue.redirectCode = redirectCode;
            _resultValue.scheme = scheme;
            _resultValue.uri = uri;
            return _resultValue;
        }
    }
}
