// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class MonitorAlertAlertsSlackGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("channel", required: true)]
        public Input<string> Channel { get; set; } = null!;

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public MonitorAlertAlertsSlackGetArgs()
        {
        }
        public static new MonitorAlertAlertsSlackGetArgs Empty => new MonitorAlertAlertsSlackGetArgs();
    }
}
