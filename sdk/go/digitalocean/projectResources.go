// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Assign resources to a DigitalOcean Project. This is useful if you need to assign resources
// managed via this provider to a DigitalOcean Project managed outside of the provider.
//
// The following resource types can be associated with a project:
//
// * Database Clusters
// * Domains
// * Droplets
// * Floating IP
// * Kubernetes Cluster
// * Load Balancers
// * Spaces Bucket
// * Volume
//
// ## Example Usage
//
// The following example assigns a droplet to a Project managed outside of the provider:
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean"
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v4/go/digitalocean/index"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		opt0 := "playground"
// 		_, err := digitalocean.LookupProject(ctx, &GetProjectArgs{
// 			Name: &opt0,
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		foobar, err := digitalocean.NewDroplet(ctx, "foobar", &digitalocean.DropletArgs{
// 			Size:   pulumi.String("s-1vcpu-1gb"),
// 			Image:  pulumi.String("centos-7-x64"),
// 			Region: pulumi.String("nyc3"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewProjectResources(ctx, "barfoo", &digitalocean.ProjectResourcesArgs{
// 			Project: pulumi.Any(data.Digitalocean_project.Foo.Id),
// 			Resources: pulumi.StringArray{
// 				foobar.DropletUrn,
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Importing this resource is not supported.
type ProjectResources struct {
	pulumi.CustomResourceState

	// the ID of the project
	Project pulumi.StringOutput `pulumi:"project"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayOutput `pulumi:"resources"`
}

// NewProjectResources registers a new resource with the given unique name, arguments, and options.
func NewProjectResources(ctx *pulumi.Context,
	name string, args *ProjectResourcesArgs, opts ...pulumi.ResourceOption) (*ProjectResources, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Project == nil {
		return nil, errors.New("invalid value for required argument 'Project'")
	}
	if args.Resources == nil {
		return nil, errors.New("invalid value for required argument 'Resources'")
	}
	var resource ProjectResources
	err := ctx.RegisterResource("digitalocean:index/projectResources:ProjectResources", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProjectResources gets an existing ProjectResources resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProjectResources(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProjectResourcesState, opts ...pulumi.ResourceOption) (*ProjectResources, error) {
	var resource ProjectResources
	err := ctx.ReadResource("digitalocean:index/projectResources:ProjectResources", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProjectResources resources.
type projectResourcesState struct {
	// the ID of the project
	Project *string `pulumi:"project"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources []string `pulumi:"resources"`
}

type ProjectResourcesState struct {
	// the ID of the project
	Project pulumi.StringPtrInput
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayInput
}

func (ProjectResourcesState) ElementType() reflect.Type {
	return reflect.TypeOf((*projectResourcesState)(nil)).Elem()
}

type projectResourcesArgs struct {
	// the ID of the project
	Project string `pulumi:"project"`
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources []string `pulumi:"resources"`
}

// The set of arguments for constructing a ProjectResources resource.
type ProjectResourcesArgs struct {
	// the ID of the project
	Project pulumi.StringInput
	// a list of uniform resource names (URNs) for the resources associated with the project
	Resources pulumi.StringArrayInput
}

func (ProjectResourcesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*projectResourcesArgs)(nil)).Elem()
}

type ProjectResourcesInput interface {
	pulumi.Input

	ToProjectResourcesOutput() ProjectResourcesOutput
	ToProjectResourcesOutputWithContext(ctx context.Context) ProjectResourcesOutput
}

func (*ProjectResources) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectResources)(nil))
}

func (i *ProjectResources) ToProjectResourcesOutput() ProjectResourcesOutput {
	return i.ToProjectResourcesOutputWithContext(context.Background())
}

func (i *ProjectResources) ToProjectResourcesOutputWithContext(ctx context.Context) ProjectResourcesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectResourcesOutput)
}

func (i *ProjectResources) ToProjectResourcesPtrOutput() ProjectResourcesPtrOutput {
	return i.ToProjectResourcesPtrOutputWithContext(context.Background())
}

func (i *ProjectResources) ToProjectResourcesPtrOutputWithContext(ctx context.Context) ProjectResourcesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectResourcesPtrOutput)
}

type ProjectResourcesPtrInput interface {
	pulumi.Input

	ToProjectResourcesPtrOutput() ProjectResourcesPtrOutput
	ToProjectResourcesPtrOutputWithContext(ctx context.Context) ProjectResourcesPtrOutput
}

type projectResourcesPtrType ProjectResourcesArgs

func (*projectResourcesPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectResources)(nil))
}

func (i *projectResourcesPtrType) ToProjectResourcesPtrOutput() ProjectResourcesPtrOutput {
	return i.ToProjectResourcesPtrOutputWithContext(context.Background())
}

func (i *projectResourcesPtrType) ToProjectResourcesPtrOutputWithContext(ctx context.Context) ProjectResourcesPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectResourcesPtrOutput)
}

// ProjectResourcesArrayInput is an input type that accepts ProjectResourcesArray and ProjectResourcesArrayOutput values.
// You can construct a concrete instance of `ProjectResourcesArrayInput` via:
//
//          ProjectResourcesArray{ ProjectResourcesArgs{...} }
type ProjectResourcesArrayInput interface {
	pulumi.Input

	ToProjectResourcesArrayOutput() ProjectResourcesArrayOutput
	ToProjectResourcesArrayOutputWithContext(context.Context) ProjectResourcesArrayOutput
}

type ProjectResourcesArray []ProjectResourcesInput

func (ProjectResourcesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProjectResources)(nil)).Elem()
}

func (i ProjectResourcesArray) ToProjectResourcesArrayOutput() ProjectResourcesArrayOutput {
	return i.ToProjectResourcesArrayOutputWithContext(context.Background())
}

func (i ProjectResourcesArray) ToProjectResourcesArrayOutputWithContext(ctx context.Context) ProjectResourcesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectResourcesArrayOutput)
}

// ProjectResourcesMapInput is an input type that accepts ProjectResourcesMap and ProjectResourcesMapOutput values.
// You can construct a concrete instance of `ProjectResourcesMapInput` via:
//
//          ProjectResourcesMap{ "key": ProjectResourcesArgs{...} }
type ProjectResourcesMapInput interface {
	pulumi.Input

	ToProjectResourcesMapOutput() ProjectResourcesMapOutput
	ToProjectResourcesMapOutputWithContext(context.Context) ProjectResourcesMapOutput
}

type ProjectResourcesMap map[string]ProjectResourcesInput

func (ProjectResourcesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProjectResources)(nil)).Elem()
}

func (i ProjectResourcesMap) ToProjectResourcesMapOutput() ProjectResourcesMapOutput {
	return i.ToProjectResourcesMapOutputWithContext(context.Background())
}

func (i ProjectResourcesMap) ToProjectResourcesMapOutputWithContext(ctx context.Context) ProjectResourcesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProjectResourcesMapOutput)
}

type ProjectResourcesOutput struct{ *pulumi.OutputState }

func (ProjectResourcesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProjectResources)(nil))
}

func (o ProjectResourcesOutput) ToProjectResourcesOutput() ProjectResourcesOutput {
	return o
}

func (o ProjectResourcesOutput) ToProjectResourcesOutputWithContext(ctx context.Context) ProjectResourcesOutput {
	return o
}

func (o ProjectResourcesOutput) ToProjectResourcesPtrOutput() ProjectResourcesPtrOutput {
	return o.ToProjectResourcesPtrOutputWithContext(context.Background())
}

func (o ProjectResourcesOutput) ToProjectResourcesPtrOutputWithContext(ctx context.Context) ProjectResourcesPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProjectResources) *ProjectResources {
		return &v
	}).(ProjectResourcesPtrOutput)
}

type ProjectResourcesPtrOutput struct{ *pulumi.OutputState }

func (ProjectResourcesPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProjectResources)(nil))
}

func (o ProjectResourcesPtrOutput) ToProjectResourcesPtrOutput() ProjectResourcesPtrOutput {
	return o
}

func (o ProjectResourcesPtrOutput) ToProjectResourcesPtrOutputWithContext(ctx context.Context) ProjectResourcesPtrOutput {
	return o
}

func (o ProjectResourcesPtrOutput) Elem() ProjectResourcesOutput {
	return o.ApplyT(func(v *ProjectResources) ProjectResources {
		if v != nil {
			return *v
		}
		var ret ProjectResources
		return ret
	}).(ProjectResourcesOutput)
}

type ProjectResourcesArrayOutput struct{ *pulumi.OutputState }

func (ProjectResourcesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProjectResources)(nil))
}

func (o ProjectResourcesArrayOutput) ToProjectResourcesArrayOutput() ProjectResourcesArrayOutput {
	return o
}

func (o ProjectResourcesArrayOutput) ToProjectResourcesArrayOutputWithContext(ctx context.Context) ProjectResourcesArrayOutput {
	return o
}

func (o ProjectResourcesArrayOutput) Index(i pulumi.IntInput) ProjectResourcesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProjectResources {
		return vs[0].([]ProjectResources)[vs[1].(int)]
	}).(ProjectResourcesOutput)
}

type ProjectResourcesMapOutput struct{ *pulumi.OutputState }

func (ProjectResourcesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProjectResources)(nil))
}

func (o ProjectResourcesMapOutput) ToProjectResourcesMapOutput() ProjectResourcesMapOutput {
	return o
}

func (o ProjectResourcesMapOutput) ToProjectResourcesMapOutputWithContext(ctx context.Context) ProjectResourcesMapOutput {
	return o
}

func (o ProjectResourcesMapOutput) MapIndex(k pulumi.StringInput) ProjectResourcesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProjectResources {
		return vs[0].(map[string]ProjectResources)[vs[1].(string)]
	}).(ProjectResourcesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectResourcesInput)(nil)).Elem(), &ProjectResources{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectResourcesPtrInput)(nil)).Elem(), &ProjectResources{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectResourcesArrayInput)(nil)).Elem(), ProjectResourcesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProjectResourcesMapInput)(nil)).Elem(), ProjectResourcesMap{})
	pulumi.RegisterOutputType(ProjectResourcesOutput{})
	pulumi.RegisterOutputType(ProjectResourcesPtrOutput{})
	pulumi.RegisterOutputType(ProjectResourcesArrayOutput{})
	pulumi.RegisterOutputType(ProjectResourcesMapOutput{})
}
