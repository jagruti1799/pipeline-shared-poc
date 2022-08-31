package com.test.demo

checkout([$class: 'GitSCM',
         branches: [[name: '*/master']],
         userRemoteConfigs: [[url: 'https://github.com/jagruti1799/Jenkins-Terraform.git']]]) 
