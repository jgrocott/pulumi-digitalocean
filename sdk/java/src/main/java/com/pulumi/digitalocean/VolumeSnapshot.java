// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.VolumeSnapshotArgs;
import com.pulumi.digitalocean.inputs.VolumeSnapshotState;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Volume Snapshot which can be used to create a snapshot from an existing volume.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Volume;
 * import com.pulumi.digitalocean.VolumeArgs;
 * import com.pulumi.digitalocean.VolumeSnapshot;
 * import com.pulumi.digitalocean.VolumeSnapshotArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foobarVolume = new Volume(&#34;foobarVolume&#34;, VolumeArgs.builder()        
 *             .region(&#34;nyc1&#34;)
 *             .size(100)
 *             .description(&#34;an example volume&#34;)
 *             .build());
 * 
 *         var foobarVolumeSnapshot = new VolumeSnapshot(&#34;foobarVolumeSnapshot&#34;, VolumeSnapshotArgs.builder()        
 *             .volumeId(foobarVolume.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Volume Snapshots can be imported using the `snapshot id`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/volumeSnapshot:VolumeSnapshot snapshot 506f78a4-e098-11e5-ad9f-000f53306ae1
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/volumeSnapshot:VolumeSnapshot")
public class VolumeSnapshot extends com.pulumi.resources.CustomResource {
    /**
     * The date and time the volume snapshot was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The date and time the volume snapshot was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     * 
     */
    @Export(name="minDiskSize", type=Integer.class, parameters={})
    private Output<Integer> minDiskSize;

    /**
     * @return The minimum size in gigabytes required for a volume to be created based on this volume snapshot.
     * 
     */
    public Output<Integer> minDiskSize() {
        return this.minDiskSize;
    }
    /**
     * A name for the volume snapshot.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the volume snapshot.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of DigitalOcean region &#34;slugs&#34; indicating where the volume snapshot is available.
     * 
     */
    @Export(name="regions", type=List.class, parameters={String.class})
    private Output<List<String>> regions;

    /**
     * @return A list of DigitalOcean region &#34;slugs&#34; indicating where the volume snapshot is available.
     * 
     */
    public Output<List<String>> regions() {
        return this.regions;
    }
    /**
     * The billable size of the volume snapshot in gigabytes.
     * 
     */
    @Export(name="size", type=Double.class, parameters={})
    private Output<Double> size;

    /**
     * @return The billable size of the volume snapshot in gigabytes.
     * 
     */
    public Output<Double> size() {
        return this.size;
    }
    /**
     * A list of the tags to be applied to this volume snapshot.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return A list of the tags to be applied to this volume snapshot.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the volume from which the volume snapshot originated.
     * 
     */
    @Export(name="volumeId", type=String.class, parameters={})
    private Output<String> volumeId;

    /**
     * @return The ID of the volume from which the volume snapshot originated.
     * 
     */
    public Output<String> volumeId() {
        return this.volumeId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VolumeSnapshot(String name) {
        this(name, VolumeSnapshotArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VolumeSnapshot(String name, VolumeSnapshotArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VolumeSnapshot(String name, VolumeSnapshotArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/volumeSnapshot:VolumeSnapshot", name, args == null ? VolumeSnapshotArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VolumeSnapshot(String name, Output<String> id, @Nullable VolumeSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/volumeSnapshot:VolumeSnapshot", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VolumeSnapshot get(String name, Output<String> id, @Nullable VolumeSnapshotState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VolumeSnapshot(name, id, state, options);
    }
}