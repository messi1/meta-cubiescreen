#
# Yocto recipe to build a kernel module out of the kernel tree
# kernmodule.bb  
# Marco Cavallini - KOAN sas - www.koansoftware.com
#

DESCRIPTION = "Hello kernel module out of the kernel tree"
SECTION = "examples"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea59293b3b3c1de654df8f2907ab584e"
PR = "r0"

inherit module

SRC_URI = "file://ft5x_ts.c \
file://Makefile \
file://COPYING \
"

S = "${WORKDIR}"
