// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LoadBalancerFirewall {
    /**
     * @return A list of strings describing allow rules. Must be colon delimited strings of the form `{type}:{source}`
     * * Ex. `deny = [&#34;cidr:1.2.0.0/16&#34;, &#34;ip:2.3.4.5&#34;]` or `allow = [&#34;ip:1.2.3.4&#34;, &#34;cidr:2.3.4.0/24&#34;]`
     * 
     */
    private @Nullable List<String> allows;
    /**
     * @return A list of strings describing deny rules. Must be colon delimited strings of the form `{type}:{source}`
     * 
     */
    private @Nullable List<String> denies;

    private LoadBalancerFirewall() {}
    /**
     * @return A list of strings describing allow rules. Must be colon delimited strings of the form `{type}:{source}`
     * * Ex. `deny = [&#34;cidr:1.2.0.0/16&#34;, &#34;ip:2.3.4.5&#34;]` or `allow = [&#34;ip:1.2.3.4&#34;, &#34;cidr:2.3.4.0/24&#34;]`
     * 
     */
    public List<String> allows() {
        return this.allows == null ? List.of() : this.allows;
    }
    /**
     * @return A list of strings describing deny rules. Must be colon delimited strings of the form `{type}:{source}`
     * 
     */
    public List<String> denies() {
        return this.denies == null ? List.of() : this.denies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerFirewall defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allows;
        private @Nullable List<String> denies;
        public Builder() {}
        public Builder(LoadBalancerFirewall defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
        }

        @CustomType.Setter
        public Builder allows(@Nullable List<String> allows) {
            this.allows = allows;
            return this;
        }
        public Builder allows(String... allows) {
            return allows(List.of(allows));
        }
        @CustomType.Setter
        public Builder denies(@Nullable List<String> denies) {
            this.denies = denies;
            return this;
        }
        public Builder denies(String... denies) {
            return denies(List.of(denies));
        }
        public LoadBalancerFirewall build() {
            final var _resultValue = new LoadBalancerFirewall();
            _resultValue.allows = allows;
            _resultValue.denies = denies;
            return _resultValue;
        }
    }
}
