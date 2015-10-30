echo 'hello from Workflow'

node {
  git url: 'https://github.com/anyone-can-test/jenkins-workflow-test.git'
  def mvnHome = tool 'Maven 3.x'
  sh "${mvnHome}/bin/mvn -B -Dmaven.test.failure.ignore verify"
  step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
}

