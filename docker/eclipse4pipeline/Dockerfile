FROM ubuntu:20.04

ARG DEBIAN_FRONTEND=noninteractive

# Install necessary packages
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    wget \
    unzip \
    libgtk-3-0 \
    libxtst6 \
    libxrender1 \
    libfreetype6 \
    libxi6 \
    ca-certificates \
    xvfb \
    x11vnc \
    net-tools \
	gnome \
	git

# Download and extract Eclipse
RUN wget -O eclipse-java.tar.gz "https://www.eclipse.org/downloads/download.php?file=/technology/epp/downloads/release/2023-03/R/eclipse-java-2023-03-R-linux-gtk-x86_64.tar.gz" && \
    tar -zxvf eclipse-java.tar.gz -C /opt/ && \
    rm eclipse-java.tar.gz
	
# Install Eclipse XSD EMF plugin
RUN /opt/eclipse/eclipse -application org.eclipse.equinox.p2.director \
      -noSplash \
      -repository http://download.eclipse.org/releases/2023-03 \
      -installIUs org.eclipse.xsd.sdk.feature.group
	
# Define environment variables
ENV ECLIPSE_HOME /opt/eclipse

# Set the working directory
WORKDIR $ECLIPSE_HOME

# Set environment variables
ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64

# Copy the entrypoint script
# COPY entrypoint.sh /usr/local/bin/entrypoint.sh
COPY entrypoint.sh /usr/local/bin/entrypoint.sh

# Make the shared source directory
RUN mkdir /host
RUN mkdir /host/projectdir
RUN chmod 777 /host/projectdir

# Make the entrypoint script executable
RUN chmod +x /usr/local/bin/entrypoint.sh

# Define the dummy entrypoint
ENTRYPOINT ["/usr/local/bin/entrypoint.sh"]


