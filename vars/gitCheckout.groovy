def call(Map stageParams) {

    checkout([$class: 'GitSCM',
        branches: [[name: stageParams.name]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
 }
