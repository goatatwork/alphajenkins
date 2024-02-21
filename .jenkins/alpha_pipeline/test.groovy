def test() {
    println "Testing.."

    sh '''
    source .venv/bin/activate
    python helloworld.py
    python helloworld.py --name=Goat
    '''
}
