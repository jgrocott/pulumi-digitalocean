// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDatabaseClusterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatabaseClusterArgs Empty = new GetDatabaseClusterArgs();

    /**
     * The name of the database cluster.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the database cluster.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDatabaseClusterArgs() {}

    private GetDatabaseClusterArgs(GetDatabaseClusterArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatabaseClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatabaseClusterArgs $;

        public Builder() {
            $ = new GetDatabaseClusterArgs();
        }

        public Builder(GetDatabaseClusterArgs defaults) {
            $ = new GetDatabaseClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the database cluster.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public GetDatabaseClusterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
