echo "Testing.."

// Create virtual environment
execute sh: 'source .venv/bin/activate'
execute sh: 'python helloworld.py'
execute sh: 'python helloworld.py --name=Goat'
