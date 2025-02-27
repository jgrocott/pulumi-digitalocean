// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionPlainArgs Empty = new GetRegionPlainArgs();

    /**
     * A human-readable string that is used as a unique identifier for each region.
     * 
     */
    @Import(name="slug", required=true)
    private String slug;

    /**
     * @return A human-readable string that is used as a unique identifier for each region.
     * 
     */
    public String slug() {
        return this.slug;
    }

    private GetRegionPlainArgs() {}

    private GetRegionPlainArgs(GetRegionPlainArgs $) {
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionPlainArgs $;

        public Builder() {
            $ = new GetRegionPlainArgs();
        }

        public Builder(GetRegionPlainArgs defaults) {
            $ = new GetRegionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param slug A human-readable string that is used as a unique identifier for each region.
         * 
         * @return builder
         * 
         */
        public Builder slug(String slug) {
            $.slug = slug;
            return this;
        }

        public GetRegionPlainArgs build() {
            $.slug = Objects.requireNonNull($.slug, "expected parameter 'slug' to be non-null");
            return $;
        }
    }

}
