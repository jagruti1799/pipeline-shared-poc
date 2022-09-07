def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name: main]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
