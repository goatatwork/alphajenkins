echo "Building.."

// Create virtual environment
execute sh: 'python3 -m venv .venv'

// Activate virtual environment
execute sh: 'source .venv/bin/activate'

// Install requirements
execute sh: 'pip install -r requirements.txt'
