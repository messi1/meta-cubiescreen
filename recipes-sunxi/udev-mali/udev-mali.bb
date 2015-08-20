DESCRIPTION = "Extra udev rules"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit allarch

PR = "r3"

SRC_URI = " \
       file://50-mali.rules \
       file://70-qtouchscreen.rules \
"


do_install() {
	install -d ${D}${sysconfdir}/udev/rules.d

	install -m 0644 ${WORKDIR}/50-mali.rules      ${D}${sysconfdir}/udev/rules.d/50-mali.rules 
	install -m 0644 ${WORKDIR}/70-qtouchscreen.rules      ${D}${sysconfdir}/udev/rules.d/70-qtouchscreen.rules
}

FILES_${PN} = "${sysconfdir}/udev"
RDEPENDS_${PN} = "udev"
