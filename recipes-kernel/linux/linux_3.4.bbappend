#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "${THISDIR}/linux-3.4:"

SRC_URI += "file://0001-sunxi-disp.patch"
SRC_URI += "file://0002-sunxi-lcd.patch"


FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://defconfig"
