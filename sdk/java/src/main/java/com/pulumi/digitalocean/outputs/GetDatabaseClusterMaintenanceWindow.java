// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatabaseClusterMaintenanceWindow {
    /**
     * @return The day of the week on which to apply maintenance updates.
     * 
     */
    private String day;
    /**
     * @return The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    private String hour;

    private GetDatabaseClusterMaintenanceWindow() {}
    /**
     * @return The day of the week on which to apply maintenance updates.
     * 
     */
    public String day() {
        return this.day;
    }
    /**
     * @return The hour in UTC at which maintenance updates will be applied in 24 hour format.
     * 
     */
    public String hour() {
        return this.hour;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseClusterMaintenanceWindow defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String day;
        private String hour;
        public Builder() {}
        public Builder(GetDatabaseClusterMaintenanceWindow defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.hour = defaults.hour;
        }

        @CustomType.Setter
        public Builder day(String day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        @CustomType.Setter
        public Builder hour(String hour) {
            this.hour = Objects.requireNonNull(hour);
            return this;
        }
        public GetDatabaseClusterMaintenanceWindow build() {
            final var _resultValue = new GetDatabaseClusterMaintenanceWindow();
            _resultValue.day = day;
            _resultValue.hour = hour;
            return _resultValue;
        }
    }
}
