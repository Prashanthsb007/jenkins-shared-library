def call(String projectKey, String projectName) {
    def mvn = tool 'Maven' // Ensure 'Maven' matches the tool name configured in Jenkins
    withSonarQubeEnv('sonar') {
        sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=${projectKey} -Dsonar.projectName='${projectName}'"
    }
}
