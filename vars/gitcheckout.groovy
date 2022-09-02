package com.test.demo;

def checkoutGitRepository(repo){
	
   dir(path) {
        checkout([$class: 'GitSCM',
		 branches: [[name: '*/main']],
		 userRemoteConfigs: [[url: 'https://github.com/jagruti1799/Jenkins-Terraform.git']]])
    } 
}
return this
