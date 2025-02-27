// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.digitalocean.outputs.GetAppSpecJobLogDestinationDatadog;
import com.pulumi.digitalocean.outputs.GetAppSpecJobLogDestinationLogtail;
import com.pulumi.digitalocean.outputs.GetAppSpecJobLogDestinationPapertrail;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAppSpecJobLogDestination {
    /**
     * @return Datadog configuration.
     * 
     */
    private @Nullable GetAppSpecJobLogDestinationDatadog datadog;
    /**
     * @return Logtail configuration.
     * 
     */
    private @Nullable GetAppSpecJobLogDestinationLogtail logtail;
    /**
     * @return The name of the component.
     * 
     */
    private String name;
    /**
     * @return Papertrail configuration.
     * 
     */
    private @Nullable GetAppSpecJobLogDestinationPapertrail papertrail;

    private GetAppSpecJobLogDestination() {}
    /**
     * @return Datadog configuration.
     * 
     */
    public Optional<GetAppSpecJobLogDestinationDatadog> datadog() {
        return Optional.ofNullable(this.datadog);
    }
    /**
     * @return Logtail configuration.
     * 
     */
    public Optional<GetAppSpecJobLogDestinationLogtail> logtail() {
        return Optional.ofNullable(this.logtail);
    }
    /**
     * @return The name of the component.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Papertrail configuration.
     * 
     */
    public Optional<GetAppSpecJobLogDestinationPapertrail> papertrail() {
        return Optional.ofNullable(this.papertrail);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppSpecJobLogDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetAppSpecJobLogDestinationDatadog datadog;
        private @Nullable GetAppSpecJobLogDestinationLogtail logtail;
        private String name;
        private @Nullable GetAppSpecJobLogDestinationPapertrail papertrail;
        public Builder() {}
        public Builder(GetAppSpecJobLogDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadog = defaults.datadog;
    	      this.logtail = defaults.logtail;
    	      this.name = defaults.name;
    	      this.papertrail = defaults.papertrail;
        }

        @CustomType.Setter
        public Builder datadog(@Nullable GetAppSpecJobLogDestinationDatadog datadog) {
            this.datadog = datadog;
            return this;
        }
        @CustomType.Setter
        public Builder logtail(@Nullable GetAppSpecJobLogDestinationLogtail logtail) {
            this.logtail = logtail;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder papertrail(@Nullable GetAppSpecJobLogDestinationPapertrail papertrail) {
            this.papertrail = papertrail;
            return this;
        }
        public GetAppSpecJobLogDestination build() {
            final var _resultValue = new GetAppSpecJobLogDestination();
            _resultValue.datadog = datadog;
            _resultValue.logtail = logtail;
            _resultValue.name = name;
            _resultValue.papertrail = papertrail;
            return _resultValue;
        }
    }
}
