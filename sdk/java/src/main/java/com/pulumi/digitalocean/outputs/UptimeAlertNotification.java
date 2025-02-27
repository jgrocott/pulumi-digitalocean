// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.UptimeAlertNotificationSlack;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UptimeAlertNotification {
    /**
     * @return List of email addresses to sent notifications to.
     * 
     */
    private @Nullable List<String> emails;
    private @Nullable List<UptimeAlertNotificationSlack> slacks;

    private UptimeAlertNotification() {}
    /**
     * @return List of email addresses to sent notifications to.
     * 
     */
    public List<String> emails() {
        return this.emails == null ? List.of() : this.emails;
    }
    public List<UptimeAlertNotificationSlack> slacks() {
        return this.slacks == null ? List.of() : this.slacks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeAlertNotification defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> emails;
        private @Nullable List<UptimeAlertNotificationSlack> slacks;
        public Builder() {}
        public Builder(UptimeAlertNotification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emails = defaults.emails;
    	      this.slacks = defaults.slacks;
        }

        @CustomType.Setter
        public Builder emails(@Nullable List<String> emails) {
            this.emails = emails;
            return this;
        }
        public Builder emails(String... emails) {
            return emails(List.of(emails));
        }
        @CustomType.Setter
        public Builder slacks(@Nullable List<UptimeAlertNotificationSlack> slacks) {
            this.slacks = slacks;
            return this;
        }
        public Builder slacks(UptimeAlertNotificationSlack... slacks) {
            return slacks(List.of(slacks));
        }
        public UptimeAlertNotification build() {
            final var _resultValue = new UptimeAlertNotification();
            _resultValue.emails = emails;
            _resultValue.slacks = slacks;
            return _resultValue;
        }
    }
}
