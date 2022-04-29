def initializeApp(){
    echo 'initializing the application building process'
}
def testApp(){
    echo "testing app with ${SERVER_CREDENTIALS}"
}
def deployApp(){
    echo "deploying the app version ${param.VERSION}"
}
return this
