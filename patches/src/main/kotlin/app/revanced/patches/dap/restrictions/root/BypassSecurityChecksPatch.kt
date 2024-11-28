package app.revanced.patches.dap.restrictions.root

import app.revanced.patcher.extensions.InstructionExtensions.addInstruction
import app.revanced.patcher.patch.bytecodePatch

@Suppress("unused")
val bypassSecurityChecksPatch = bytecodePatch(
    name = "Bypass root checks",
    description = "Removes the restriction to use the app with root permissions or on a custom ROM.",
) {
    compatibleWith("hu.gov.dap.app")

    execute {
        checkRootFingerprint.method.addInstruction(1, "return-void")
    }
}
