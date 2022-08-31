#!/usr/bin/groovy
package com.test.demo

def checkoutGitRepository(repo){
    dir(path) {
        checkout(
            changelog:true,
            poll: poll,
            scm: [
                $class: 'GitSCM',
                branches: [[name: "*/${branch}"]],
            doGenerateSubmoduleConfigurations: false,
            extensions: [
                [$class: 'CheckoutOption', timeout: timeout],
                [$class: 'CloneOption', depth: depth, noTags: false, reference: '', shallow: depth > 0, timeout: timeout]],
            submoduleCfg: [],
            userRemoteConfigs: [[url: 'https://github.com/jagruti1799/Jenkins-Terraform.git']]]
        )
        sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
    }
}
return this
