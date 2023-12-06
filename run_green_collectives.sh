#!/bin/sh

export FONTCONFIG_PATH=$SNAP/etc/fonts
export FONTCONFIG_FILE=$FONTCONFIG_PATH/fonts.conf
export LIBGL_ALWAYS_SOFTWARE=1
export LC_ALL=C.UTF-8
export LANG=C.UTF-8

mkdir -p $SNAP_USER_DATA/pdf-files
cp $SNAP_USER_DATA/pdf-files $SNAP_USER_DATA/.cache/


$SNAP/usr/lib/jvm/java-17-openjdk-amd64/bin/java -jar $SNAP/green-collectives.jar

