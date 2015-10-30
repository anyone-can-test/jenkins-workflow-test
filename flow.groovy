
// https://github.com/jenkinsci/workflow-plugin/blob/master/TUTORIAL.md

/* Jenkins job configuration

node {
  git url: 'https://github.com/anyone-can-test/jenkins-workflow-test.git'
  load 'flow.groovy'
}()
*/


{ ->
  node() {
    hello 'world'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
