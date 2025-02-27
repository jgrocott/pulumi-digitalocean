// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecServiceAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecServiceAlertArgs Empty = new AppSpecServiceAlertArgs();

    /**
     * Determines whether or not the alert is disabled (default: `false`).
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Determines whether or not the alert is disabled (default: `false`).
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    @Import(name="rule", required=true)
    private Output<String> rule;

    /**
     * @return The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
     * 
     */
    public Output<String> rule() {
        return this.rule;
    }

    /**
     * The threshold for the type of the warning.
     * 
     */
    @Import(name="value", required=true)
    private Output<Double> value;

    /**
     * @return The threshold for the type of the warning.
     * 
     */
    public Output<Double> value() {
        return this.value;
    }

    /**
     * The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
     * 
     */
    @Import(name="window", required=true)
    private Output<String> window;

    /**
     * @return The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
     * 
     */
    public Output<String> window() {
        return this.window;
    }

    private AppSpecServiceAlertArgs() {}

    private AppSpecServiceAlertArgs(AppSpecServiceAlertArgs $) {
        this.disabled = $.disabled;
        this.operator = $.operator;
        this.rule = $.rule;
        this.value = $.value;
        this.window = $.window;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecServiceAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecServiceAlertArgs $;

        public Builder() {
            $ = new AppSpecServiceAlertArgs();
        }

        public Builder(AppSpecServiceAlertArgs defaults) {
            $ = new AppSpecServiceAlertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Determines whether or not the alert is disabled (default: `false`).
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Determines whether or not the alert is disabled (default: `false`).
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param operator The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator to use. This is either of `GREATER_THAN` or `LESS_THAN`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param rule The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder rule(Output<String> rule) {
            $.rule = rule;
            return this;
        }

        /**
         * @param rule The type of the alert to configure. Component app alert policies can be: `CPU_UTILIZATION`, `MEM_UTILIZATION`, or `RESTART_COUNT`.
         * 
         * @return builder
         * 
         */
        public Builder rule(String rule) {
            return rule(Output.of(rule));
        }

        /**
         * @param value The threshold for the type of the warning.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<Double> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The threshold for the type of the warning.
         * 
         * @return builder
         * 
         */
        public Builder value(Double value) {
            return value(Output.of(value));
        }

        /**
         * @param window The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
         * 
         * @return builder
         * 
         */
        public Builder window(Output<String> window) {
            $.window = window;
            return this;
        }

        /**
         * @param window The time before alerts should be triggered. This is may be one of: `FIVE_MINUTES`, `TEN_MINUTES`, `THIRTY_MINUTES`, `ONE_HOUR`.
         * 
         * @return builder
         * 
         */
        public Builder window(String window) {
            return window(Output.of(window));
        }

        public AppSpecServiceAlertArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            $.window = Objects.requireNonNull($.window, "expected parameter 'window' to be non-null");
            return $;
        }
    }

}
