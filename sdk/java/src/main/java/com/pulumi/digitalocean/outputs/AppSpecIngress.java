// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.AppSpecIngressRule;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AppSpecIngress {
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    private @Nullable List<AppSpecIngressRule> rules;

    private AppSpecIngress() {}
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    public List<AppSpecIngressRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSpecIngress defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AppSpecIngressRule> rules;
        public Builder() {}
        public Builder(AppSpecIngress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder rules(@Nullable List<AppSpecIngressRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(AppSpecIngressRule... rules) {
            return rules(List.of(rules));
        }
        public AppSpecIngress build() {
            final var _resultValue = new AppSpecIngress();
            _resultValue.rules = rules;
            return _resultValue;
        }
    }
}
