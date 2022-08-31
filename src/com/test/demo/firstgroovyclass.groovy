package com.test.demo

def checkout([
        $class: 'GitSCM', 
        branches: [[name: '*/main']], 
        doGenerateSubmoduleConfigurations: false, 
        extensions: [[$class: 'CleanCheckout']], 
        submoduleCfg: [], 
        userRemoteConfigs: [[credentialsId: 'None', url: 'https://github.com/jagruti1799/Jenkins-Terraform.git']]
    ])
