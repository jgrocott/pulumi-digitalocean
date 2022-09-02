// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.digitalocean;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.digitalocean.CertificateArgs;
import com.pulumi.digitalocean.Utilities;
import com.pulumi.digitalocean.inputs.CertificateState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DigitalOcean Certificate resource that allows you to manage
 * certificates for configuring TLS termination in Load Balancers.
 * Certificates created with this resource can be referenced in your
 * Load Balancer configuration via their ID. The certificate can either
 * be a custom one provided by you or automatically generated one with
 * Let&#39;s Encrypt.
 * 
 * ## Example Usage
 * 
 * #### Custom Certificate
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Certificate;
 * import com.pulumi.digitalocean.CertificateArgs;
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
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .type(&#34;custom&#34;)
 *             .privateKey(Files.readString(Paths.get(&#34;/Users/myuser/certs/privkey.pem&#34;)))
 *             .leafCertificate(Files.readString(Paths.get(&#34;/Users/myuser/certs/cert.pem&#34;)))
 *             .certificateChain(Files.readString(Paths.get(&#34;/Users/myuser/certs/fullchain.pem&#34;)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * #### Let&#39;s Encrypt Certificate
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Certificate;
 * import com.pulumi.digitalocean.CertificateArgs;
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
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .domains(&#34;example.com&#34;)
 *             .type(&#34;lets_encrypt&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * #### Use with Other Resources
 * 
 * Both custom and Let&#39;s Encrypt certificates can be used with other resources
 * including the `digitalocean.LoadBalancer` and `digitalocean.Cdn` resources.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.digitalocean.Certificate;
 * import com.pulumi.digitalocean.CertificateArgs;
 * import com.pulumi.digitalocean.LoadBalancer;
 * import com.pulumi.digitalocean.LoadBalancerArgs;
 * import com.pulumi.digitalocean.inputs.LoadBalancerForwardingRuleArgs;
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
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .type(&#34;lets_encrypt&#34;)
 *             .domains(&#34;example.com&#34;)
 *             .build());
 * 
 *         var public_ = new LoadBalancer(&#34;public&#34;, LoadBalancerArgs.builder()        
 *             .region(&#34;nyc3&#34;)
 *             .dropletTag(&#34;backend&#34;)
 *             .forwardingRules(LoadBalancerForwardingRuleArgs.builder()
 *                 .entryPort(443)
 *                 .entryProtocol(&#34;https&#34;)
 *                 .targetPort(80)
 *                 .targetProtocol(&#34;http&#34;)
 *                 .certificateName(cert.name())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Certificates can be imported using the certificate `name`, e.g.
 * 
 * ```sh
 *  $ pulumi import digitalocean:index/certificate:Certificate mycertificate cert-01
 * ```
 * 
 */
@ResourceType(type="digitalocean:index/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * The full PEM-formatted trust chain
     * between the certificate authority&#39;s certificate and your domain&#39;s TLS
     * certificate. Only valid when type is `custom`.
     * 
     */
    @Export(name="certificateChain", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The full PEM-formatted trust chain
     * between the certificate authority&#39;s certificate and your domain&#39;s TLS
     * certificate. Only valid when type is `custom`.
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }
    /**
     * List of fully qualified domain names (FQDNs) for
     * which the certificate will be issued. The domains must be managed using
     * DigitalOcean&#39;s DNS. Only valid when type is `lets_encrypt`.
     * 
     */
    @Export(name="domains", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domains;

    /**
     * @return List of fully qualified domain names (FQDNs) for
     * which the certificate will be issued. The domains must be managed using
     * DigitalOcean&#39;s DNS. Only valid when type is `lets_encrypt`.
     * 
     */
    public Output<Optional<List<String>>> domains() {
        return Codegen.optional(this.domains);
    }
    /**
     * The contents of a PEM-formatted public
     * TLS certificate. Only valid when type is `custom`.
     * 
     */
    @Export(name="leafCertificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> leafCertificate;

    /**
     * @return The contents of a PEM-formatted public
     * TLS certificate. Only valid when type is `custom`.
     * 
     */
    public Output<Optional<String>> leafCertificate() {
        return Codegen.optional(this.leafCertificate);
    }
    /**
     * The name of the certificate for identification.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the certificate for identification.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The expiration date of the certificate
     * 
     */
    @Export(name="notAfter", type=String.class, parameters={})
    private Output<String> notAfter;

    /**
     * @return The expiration date of the certificate
     * 
     */
    public Output<String> notAfter() {
        return this.notAfter;
    }
    /**
     * The contents of a PEM-formatted private-key
     * corresponding to the SSL certificate. Only valid when type is `custom`.
     * 
     */
    @Export(name="privateKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return The contents of a PEM-formatted private-key
     * corresponding to the SSL certificate. Only valid when type is `custom`.
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * The SHA-1 fingerprint of the certificate
     * 
     */
    @Export(name="sha1Fingerprint", type=String.class, parameters={})
    private Output<String> sha1Fingerprint;

    /**
     * @return The SHA-1 fingerprint of the certificate
     * 
     */
    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint;
    }
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }
    /**
     * The type of certificate to provision. Can be either
     * `custom` or `lets_encrypt`. Defaults to `custom`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output</* @Nullable */ String> type;

    /**
     * @return The type of certificate to provision. Can be either
     * `custom` or `lets_encrypt`. Defaults to `custom`.
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * The UUID of the certificate
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return The UUID of the certificate
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, @Nullable CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, @Nullable CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("digitalocean:index/certificate:Certificate", name, state, makeResourceOptions(options, id));
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
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}
