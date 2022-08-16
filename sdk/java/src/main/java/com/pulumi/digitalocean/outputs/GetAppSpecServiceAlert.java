// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecServiceAlert {
    /**
     * @return Determines whether or not the alert is disabled (default: `false`).
     * 
     */
    private final @Nullable Boolean disabled;
    /**
     * @return The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
     * 
     */
    private final String operator;
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    private final String rule;
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    private final Double value;
    /**
     * @return The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
     * 
     */
    private final String window;

    @CustomType.Constructor
    private GetAppSpecServiceAlert(
        @CustomType.Parameter("disabled") @Nullable Boolean disabled,
        @CustomType.Parameter("operator") String operator,
        @CustomType.Parameter("rule") String rule,
        @CustomType.Parameter("value") Double value,
        @CustomType.Parameter("window") String window) {
        this.disabled = disabled;
        this.operator = operator;
        this.rule = rule;
        this.value = value;
        this.window = window;
    }

    /**
     * @return Determines whether or not the alert is disabled (default: `false`).
     * 
     */
    public Optional<Boolean> disabled() {
        return Optional.ofNullable(this.disabled);
    }
    /**
     * @return The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
     * 
     */
    public String operator() {
        return this.operator;
    }
    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    public String rule() {
        return this.rule;
    }
    /**
     * @return The threshold for the type of the warning.
     * 
     */
    public Double value() {
        return this.value;
    }
    /**
     * @return The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
     * 
     */
    public String window() {
        return this.window;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecServiceAlert defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disabled;
        private String operator;
        private String rule;
        private Double value;
        private String window;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAppSpecServiceAlert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.operator = defaults.operator;
    	      this.rule = defaults.rule;
    	      this.value = defaults.value;
    	      this.window = defaults.window;
        }

        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder operator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }
        public Builder rule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder window(String window) {
            this.window = Objects.requireNonNull(window);
            return this;
        }        public GetAppSpecServiceAlert build() {
            return new GetAppSpecServiceAlert(disabled, operator, rule, value, window);
        }
    }
}