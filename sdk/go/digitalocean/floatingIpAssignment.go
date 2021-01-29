// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package digitalocean

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Provides a resource for assigning an existing DigitalOcean Floating IP to a Droplet. This
// makes it easy to provision floating IP addresses that are not tied to the lifecycle of your
// Droplet.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-digitalocean/sdk/v3/go/digitalocean/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		foobarFloatingIp, err := digitalocean.NewFloatingIp(ctx, "foobarFloatingIp", &digitalocean.FloatingIpArgs{
// 			Region: pulumi.String("sgp1"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		foobarDroplet, err := digitalocean.NewDroplet(ctx, "foobarDroplet", &digitalocean.DropletArgs{
// 			Size:              pulumi.String("s-1vcpu-1gb"),
// 			Image:             pulumi.String("ubuntu-18-04-x64"),
// 			Region:            pulumi.String("sgp1"),
// 			Ipv6:              pulumi.Bool(true),
// 			PrivateNetworking: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = digitalocean.NewFloatingIpAssignment(ctx, "foobarFloatingIpAssignment", &digitalocean.FloatingIpAssignmentArgs{
// 			IpAddress: foobarFloatingIp.IpAddress,
// 			DropletId: foobarDroplet.ID(),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type FloatingIpAssignment struct {
	pulumi.CustomResourceState

	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntOutput `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
}

// NewFloatingIpAssignment registers a new resource with the given unique name, arguments, and options.
func NewFloatingIpAssignment(ctx *pulumi.Context,
	name string, args *FloatingIpAssignmentArgs, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DropletId == nil {
		return nil, errors.New("invalid value for required argument 'DropletId'")
	}
	if args.IpAddress == nil {
		return nil, errors.New("invalid value for required argument 'IpAddress'")
	}
	var resource FloatingIpAssignment
	err := ctx.RegisterResource("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFloatingIpAssignment gets an existing FloatingIpAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFloatingIpAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FloatingIpAssignmentState, opts ...pulumi.ResourceOption) (*FloatingIpAssignment, error) {
	var resource FloatingIpAssignment
	err := ctx.ReadResource("digitalocean:index/floatingIpAssignment:FloatingIpAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FloatingIpAssignment resources.
type floatingIpAssignmentState struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId *int `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress *string `pulumi:"ipAddress"`
}

type FloatingIpAssignmentState struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntPtrInput
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringPtrInput
}

func (FloatingIpAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentState)(nil)).Elem()
}

type floatingIpAssignmentArgs struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId int `pulumi:"dropletId"`
	// The Floating IP to assign to the Droplet.
	IpAddress string `pulumi:"ipAddress"`
}

// The set of arguments for constructing a FloatingIpAssignment resource.
type FloatingIpAssignmentArgs struct {
	// The ID of Droplet that the Floating IP will be assigned to.
	DropletId pulumi.IntInput
	// The Floating IP to assign to the Droplet.
	IpAddress pulumi.StringInput
}

func (FloatingIpAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*floatingIpAssignmentArgs)(nil)).Elem()
}

type FloatingIpAssignmentInput interface {
	pulumi.Input

	ToFloatingIpAssignmentOutput() FloatingIpAssignmentOutput
	ToFloatingIpAssignmentOutputWithContext(ctx context.Context) FloatingIpAssignmentOutput
}

func (*FloatingIpAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((*FloatingIpAssignment)(nil))
}

func (i *FloatingIpAssignment) ToFloatingIpAssignmentOutput() FloatingIpAssignmentOutput {
	return i.ToFloatingIpAssignmentOutputWithContext(context.Background())
}

func (i *FloatingIpAssignment) ToFloatingIpAssignmentOutputWithContext(ctx context.Context) FloatingIpAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FloatingIpAssignmentOutput)
}

type FloatingIpAssignmentOutput struct {
	*pulumi.OutputState
}

func (FloatingIpAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*FloatingIpAssignment)(nil))
}

func (o FloatingIpAssignmentOutput) ToFloatingIpAssignmentOutput() FloatingIpAssignmentOutput {
	return o
}

func (o FloatingIpAssignmentOutput) ToFloatingIpAssignmentOutputWithContext(ctx context.Context) FloatingIpAssignmentOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(FloatingIpAssignmentOutput{})
}
