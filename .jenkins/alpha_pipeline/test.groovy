def test() {
    println "Testing..."

    sh '''
    echo "...testing"
    source .venv/bin/activate
    python helloworld.py
    python helloworld.py --name=Goat
    '''
}
