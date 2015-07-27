#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
FILESPATH_prepend := "${THISDIR}/linux-3.4:"

SRC_URI += "file://0001-sunxi-disp.patch"
SRC_URI += "file://0002-sunxi-lcd.patch"
#SRC_URI += "file://0010-ft5x-ts.patch"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
#SRC_URI += "file://defconfig"

KERNEL_MODULE_AUTOLOAD += "mali"
