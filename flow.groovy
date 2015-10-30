
// https://github.com/jenkinsci/workflow-plugin/blob/master/TUTORIAL.md

{ ->
  node('special-slave') {
    hello 'world'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
