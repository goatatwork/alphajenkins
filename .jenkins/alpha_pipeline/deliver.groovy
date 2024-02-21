println "Delivering.."

sh '''
echo "Doing delivery stuff. Beep, boop, bop."
ansible --version
ansible-playbook --version
ansible-galaxy --version
'''
