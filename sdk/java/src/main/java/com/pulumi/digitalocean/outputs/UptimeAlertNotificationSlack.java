// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UptimeAlertNotificationSlack {
    /**
     * @return The Slack channel to send alerts to.
     * 
     */
    private String channel;
    /**
     * @return The webhook URL for Slack.
     * 
     */
    private String url;

    private UptimeAlertNotificationSlack() {}
    /**
     * @return The Slack channel to send alerts to.
     * 
     */
    public String channel() {
        return this.channel;
    }
    /**
     * @return The webhook URL for Slack.
     * 
     */
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeAlertNotificationSlack defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String channel;
        private String url;
        public Builder() {}
        public Builder(UptimeAlertNotificationSlack defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public UptimeAlertNotificationSlack build() {
            final var _resultValue = new UptimeAlertNotificationSlack();
            _resultValue.channel = channel;
            _resultValue.url = url;
            return _resultValue;
        }
    }
}
