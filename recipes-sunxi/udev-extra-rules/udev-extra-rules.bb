DESCRIPTION = "Extra udev rules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

inherit allarch

PR = "r3"

SRC_URI = " \
       file://50-mali.rules \
"


do_install() {
	install -d ${D}${sysconfdir}/udev/rules.d

    install -m 0644 ${WORKDIR}/50-mali.rules      ${D}${sysconfdir}/udev/rules.d/50-mali.rules 
}

FILES_${PN} = "${sysconfdir}/udev"
RDEPENDS_${PN} = "udev"
