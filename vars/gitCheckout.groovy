def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name: '*/dev']],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
