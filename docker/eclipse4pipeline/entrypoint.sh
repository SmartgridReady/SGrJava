#!/bin/bash

# Start Xvfb
Xvfb :99 -screen 0 1024x768x16 &

# Set the DISPLAY environment variable
export DISPLAY=:99

# Run Eclipse
# $ECLIPSE_HOME/eclipse -application org.eclipse.equinox.p2.director \
#    -noSplash \
#    -repository http://download.eclipse.org/releases/latest \
#    -installIUs org.eclipse.egit.feature.group

# Keep the container running
tail -f /dev/null
