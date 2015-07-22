include recipes-core/images/core-image-minimal.bb

DISTRO_FEATURES_append = " opengl wayland"

IMAGE_INSTALL_append_pn-core-image-minimal = " \
    sunxi-mali sunxi-mali-dev sunxi-mali-dbg \
    openssh-sftp-server \
    gstreamer \
    gst-plugins-base-app \
    gst-plugins-base \
    gst-plugins-good \
    gst-plugins-good-rtsp \
    gst-plugins-good-udp \
    gst-plugins-good-rtpmanager \
    gst-plugins-good-rtp \
    gst-plugins-good-video4linux2 \
    qtbase-fonts \
    qtbase-plugins \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtlocation \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    qtsensors \
    qtsensors-plugins \
    qtsensors-qmlplugins \
    qtimageformats-plugins \
    qtsystems \
    qtsystems-tools \
    qtsystems-qmlplugins \
    qtscript \
    qtquick1 \
    qt3d \
    qt3d-qmlplugins \
    qt3d-tools \
    qtconnectivity \
    qtconnectivity-qmlplugins \
    qtserialport \
    cinematicexperience \
    fontconfig freetype pulseaudio dbus taglib zlib \
    alsa-lib alsa-tools alsa-state alsa-utils-alsaconf \
    gcc g++ libgcc libgcc-dev libstdc++ libstdc++-dev libstdc++-staticdev \
    "

 
PACKAGECONFIG_append_pn-qtbase = "linuxfb accessibility gles2 openss icu udev widgets pulseaudio sql-sqlite sql-sqlite2 alsa"
PACKAGECONFIG[gles2] = "-opengl es2 -eglfs -qpa eglfs,,virtual/libgles2 virtual/egl"
#PACKAGECONFIG_append_pn-qtmultimedia = " gstreamer010 "
PACKAGECONFIG_remove_pn-qtbase = "msse2"
DISTRO_FEATURES_remove = "x11"