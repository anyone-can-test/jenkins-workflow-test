
// https://github.com/jenkinsci/workflow-plugin/blob/master/TUTORIAL.md

{ ->
  node() {
    hello 'world'
  }
}
def hello(whom) {
  echo "hello ${whom}"
}
