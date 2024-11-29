package app.revanced.patches.dap.restrictions.root

import com.android.tools.smali.dexlib2.AccessFlags
import app.revanced.patcher.fingerprint

internal val checkRootFingerprint = fingerprint {
    accessFlags(AccessFlags.PUBLIC, AccessFlags.CONSTRUCTOR)
    returns("V")
    parameters("Z","Z","Z","Z","Z","Z","Z","Z","Z")
}
