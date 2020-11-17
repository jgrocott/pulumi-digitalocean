// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DigitalOcean.Inputs
{

    public sealed class AppSpecArgs : Pulumi.ResourceArgs
    {
        [Input("databases")]
        private InputList<Inputs.AppSpecDatabaseArgs>? _databases;
        public InputList<Inputs.AppSpecDatabaseArgs> Databases
        {
            get => _databases ?? (_databases = new InputList<Inputs.AppSpecDatabaseArgs>());
            set => _databases = value;
        }

        [Input("domains")]
        private InputList<string>? _domains;

        /// <summary>
        /// A list of hostnames where the application will be available.
        /// </summary>
        public InputList<string> Domains
        {
            get => _domains ?? (_domains = new InputList<string>());
            set => _domains = value;
        }

        /// <summary>
        /// The name of the component
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The slug for the DigitalOcean data center region hosting the app.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("services")]
        private InputList<Inputs.AppSpecServiceArgs>? _services;
        public InputList<Inputs.AppSpecServiceArgs> Services
        {
            get => _services ?? (_services = new InputList<Inputs.AppSpecServiceArgs>());
            set => _services = value;
        }

        [Input("staticSites")]
        private InputList<Inputs.AppSpecStaticSiteArgs>? _staticSites;
        public InputList<Inputs.AppSpecStaticSiteArgs> StaticSites
        {
            get => _staticSites ?? (_staticSites = new InputList<Inputs.AppSpecStaticSiteArgs>());
            set => _staticSites = value;
        }

        [Input("workers")]
        private InputList<Inputs.AppSpecWorkerArgs>? _workers;
        public InputList<Inputs.AppSpecWorkerArgs> Workers
        {
            get => _workers ?? (_workers = new InputList<Inputs.AppSpecWorkerArgs>());
            set => _workers = value;
        }

        public AppSpecArgs()
        {
        }
    }
}