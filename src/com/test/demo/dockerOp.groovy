package com.test.demo.*;
class dockerOp {
    static void DockerBuild() {
        println ("Docker build")
    }

    static def DockerPush() {
        println ("Docker push")
    }

    static def DockerDeploy() {
        InetAddress localHost = InetAddress.getLocalHost();
        println("Hostname is: " + localHost.getHostName());
        println("Address is: " + localHost.getHostAddress());
    }
}
