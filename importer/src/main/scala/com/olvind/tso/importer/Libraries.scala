package com.olvind.tso
package importer

object Libraries {

  /**
    * A good combination of interesting libraries, and libraries that are needed by libs in DT.
    */
  val extraExternals = Set(
    "activex-helpers",
    "ajv-keywords",
    "androiduix",
    "@angular/animations",
    "@angular/common",
    "@angular/compiler",
    "@angular/core",
    "@angular/forms",
    "@angular/http",
    "@angular/platform-browser",
    "@angular/platform-browser-dynamic",
    "@angular/router",
    "antd-mobile",
    "antd-mobile-rn",
    "api-service",
    "apollo-client",
    "apollo-link-http-common",
    "apollo-react",
    "apollo-server",
    "authmosphere",
    "auto-loader",
    "ava",
    "@babel/runtime",
    "@babel/types",
    "blake2s-js",
    "@blueprintjs/core",
    "@blueprintjs/datetime",
    "@blueprintjs/icons",
    "@blueprintjs/select",
    "@blueprintjs/table",
    "@blueprintjs/timezone",
    "downshift",
    "dva",
    "emotion",
    "emotion-theming",
    "express-frappe",
    "firebase",
    "formik",
    "formstate",
    "formsy-react",
    "fullcalendar",
    "gatsby",
    "gatsby-image",
    "gestalt",
    "graphql-tools",
    "grommet",
    "@grpc/proto-loader",
    "@hyperloris/tyson",
    "indefinite-observable",
    "@ionic/discover",
    "io-ts",
    "jcore-react-native",
    "js-joda",
    "@jupyterlab/metapackage",
    "@material-ui/core",
    "@material-ui/icons",
    "@material-ui/lab",
    "meteor-typings",
    "@microsoft/load-themed-styles",
    "@mindbox/redux-helpers",
    "mobx-react",
    "mobx-react-devtools",
    "mobx-remotedev",
    "monaco-editor",
    "monocle-ts",
    "@mysticatea/spy",
    "ngx-infinite-scroll",
    "@nivo/axes",
    "@nivo/bar",
    "@nivo/bullet",
    "@nivo/calendar",
    "@nivo/chord",
    "@nivo/circle-packing",
    "@nivo/core",
    "@nivo/generators",
    "@nivo/geo",
    "@nivo/heatmap",
    "@nivo/legends",
    "@nivo/line",
    "@nivo/parallel-coordinates",
    "@nivo/pie",
    "@nivo/radar",
    "@nivo/sankey",
    "@nivo/scales",
    "@nivo/scatterplot",
    "@nivo/stream",
    "@nivo/sunburst",
    "@nivo/treemap",
    "@nivo/voronoi",
    "@nivo/waffle",
    "objection",
    "@octokit/rest",
    "office-ui-fabric-react",
    "onsenui",
    "openapi-types",
    "opentracing",
    "parchment",
    "phaser",
    "@phc/format",
    "@phenomnomnominal/tsquery",
    "pinata-sdk",
    "preact",
    "primereact",
    "prisma-binding",
    "@protobufjs/aspromise",
    "@protobufjs/codegen",
    "@pulumi/aws",
    "@pulumi/cloud",
    "@pulumi/kubernetes",
    "@pulumi/pulumi",
    "rbx",
    "rc-swipeout",
    "react-ace",
    "react-apollo",
    "react-aria-modal",
    "react-async",
    "react-avatar-editor",
    "react-bulma-components",
    "react-date-range",
    "react-draggable-list",
    "react-emotion",
    "react-fns",
    "react-helmet",
    "react-instantsearch",
    "react-json-view",
    "react-latex-next",
    "react-live",
    "react-localization",
    "react-markdown",
    "react-md",
    "react-mosaic-component",
    "react-native-firebase",
    "react-native-svg",
    "react-player",
    "react-popper",
    "react-spinners",
    "react-svg",
    "react-testing-library",
    "react-themeable-ts",
    "react-toggled",
    "react-toolbox",
    "react-tools",
    "react-waypoint",
    "react-widgets",
    "react-window",
    "reapop",
    "rebass",
    "redbox-react",
    "redux-observable",
    "re-reselect",
    "reselect",
    "rmc-calendar",
    "rmc-date-picker",
    "rmc-picker",
    "rollup-typescript",
    "rxjs",
    "rxjs-compat",
    "semantic-ui-form",
    "semantic-ui-react",
    "signals.js",
    "snabbdom",
    "source-map-support",
    "storm-react-diagrams",
    "styled-components",
    "superagent-proxy",
    "sw-toolbox",
    "tslint",
    "ts-mockito",
    "twilio-chat",
    "typed-github-api",
    "typed-graphql",
    "typedoc",
    "typed-rest-client",
    "typed-undo",
    "typesafe-actions",
    "typescript-optional",
    "typestub-ipfs",
    "@uifabric/merge-styles",
    "@uifabric/styling",
    "@uirouter/angularjs",
    "vscode-languageclient",
    "vscode-languageserver",
    "vscode-languageserver-types",
    "vue-class-component",
    "vue-cli",
    "vue-loader",
    "vue-router",
    "vue-rx",
    "vue-server-renderer",
    "vuex",
    "what-input",
    "xstream",
    "zipkin",
  )

  val ignored =
    Set[String](
      "graphene-pk11",
      "rvo2",
      "yfiles",
      "chromecast-caf-receiver",
      "snoowrap",
      // some new kind of circular dependency causes the phase runner to wait forever
      "mali",
      "apollo-tracing",
      "playerframework",
      // these are referenced in notNeededPackages.json but don't exist
      "@sindresorhus/djb2a",
      "navigator-permissions",
      "webassembly-js-api",
      "w3c-permissions"
    )
}
