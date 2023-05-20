# Install and setup maven in Ubuntu 

## Install and setup JDK
- Verify java installation (JRE)
```
java -version

java 20
Java SE 
Hotspot JVM 
```
- Verify from where this java is coming 
```
which java 

/usr/bin/java
```
- Get already installed JDK path from Intellij 
    - Right click on project and choose Module Setting 
    - Go to SDK tab and copy path of JDK 
- Set JAVA_HOME env variable 
```
JAVA_HOME=/home/aryan/.jdks/openjdk-1.19
```
- Add this JAVA_HOME's bin directory to out PATH variable 
```
PATH="$JAVA_HOME/bin:$PATH"
```
- Verify installation and setup 
```
java -version

OpenJDK 1.19
OpenJDK SE Runtime 
OpenJDK version
```
- See form where java is getting resolved 
```
which java 

/home/aryan/.jdks/openjdk-1.19/bin
```

## Install and setup Maven 
- Go to maven website and download `maven-*.tar.gz` file 
- Go to Downloads foler 
    - See which folder you are currently on using `pwd` command >> `/user/aryan`
    - List all the files in the current folder using `ls` command >> `Downloads`
    - Go into Downloads folder >> `cd Downloads`
- Untar the file, which will create a folder with all the contents of the tar file 
```
tar -xvf maven-3.9.2.tar.gz
```
- Go to the newly created maven folder and verify its content >> `cd maven-3.9.2` >> `ls` >>>> bin  lib


- Set M2_HOME env variable with maven isntallation direcotry 
```
M2_HOME=/home/aryan/Downloads/maven-3.9.2
```
- Add M2_HOME/bin to out PATH variable 
```
PATH="$M2_HOME/bin:$PATH'
```
- Verify installation and setup
```
mvn -version
which mvn 
```

## Add these scripts to our bash profile 
If we just follow the above steps, we will have to repeat these for each terminal instance every time. Instead we can put these commands inside our `~/.bashrc` file, so that they get executed everytime.

- Open bash profile file using `nano ~/.bashrc`
- Paste these lines at the last and save the file 
```
JAVA_HOME=/home/aryan/.jdks/openjdk-1.19
PATH="$JAVA_HOME/bin:$PATH"

M2_HOME=/home/aryan/Downloads/maven-3.9.2
PATH="$M2_HOME/bin:$PATH'

export PATH
```

