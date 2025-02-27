// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppSpecAlertArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSpecAlertArgs Empty = new AppSpecAlertArgs();

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

    private AppSpecAlertArgs() {}

    private AppSpecAlertArgs(AppSpecAlertArgs $) {
        this.disabled = $.disabled;
        this.rule = $.rule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSpecAlertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSpecAlertArgs $;

        public Builder() {
            $ = new AppSpecAlertArgs();
        }

        public Builder(AppSpecAlertArgs defaults) {
            $ = new AppSpecAlertArgs(Objects.requireNonNull(defaults));
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

        public AppSpecAlertArgs build() {
            $.rule = Objects.requireNonNull($.rule, "expected parameter 'rule' to be non-null");
            return $;
        }
    }

}
