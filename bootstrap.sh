function install {
    echo installing $1
    shift
    sudo apt-get -y install "$@" >/dev/null 2>&1
}

function install_java {
    echo installing Java
    echo debconf shared/accepted-oracle-license-v1-1 select true | sudo debconf-set-selections
    echo debconf shared/accepted-oracle-license-v1-1 seen true | sudo debconf-set-selections
    sudo apt-get -y install oracle-java8-installer >/dev/null 2>&1
}

function install_leiningen {
    echo installing Leiningen
    sudo wget -O /usr/local/bin/lein https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein >/dev/null 2>&1
    sudo chmod +x /usr/local/bin/lein >/dev/null 2>&1
    /usr/local/bin/lein -v >/dev/null 2>&1
}

echo updating package information
sudo add-apt-repository -y ppa:webupd8team/java
sudo apt-get -y update >/dev/null 2>&1
#apt-get -y upgrade

install_java

install_leiningen

install Git git

echo "Let's play match-em-up!"
