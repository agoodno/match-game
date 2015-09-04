VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.hostname = 'match-game'

  config.ssh.forward_agent = true

  config.vm.provision :shell, path: "bootstrap.sh", keep_color: true, privileged: false

  config.vm.network :forwarded_port, host: 8080, guest: 8080
end
