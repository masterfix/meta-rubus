# basic cli only image

# based on the poky core minimal image
include recipes-core/images/core-image-minimal.bb

#LICENSE = "MIT"
#LIC_FILES_CHKSUM = "file://COPYING;md5=18810669f13b87348459e611d31ab760"

IMAGE_FEATURES += "ssh-server-dropbear splash package-management tools-sdk"

IMAGE_INSTALL_append += "kernel-modules htop nano"
