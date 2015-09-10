VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|
  config.vm.box = "ubuntu/trusty64"
  config.vm.hostname = 'match-game'
  config.vm.provision "docker" do |d|
    d.run "agoodno/match-game"
  end
end
