package app.revanced.patches.dap.restrictions.root

import app.revanced.patcher.fingerprint

internal val checkRootFingerprint = fingerprint {
    custom { method, _ ->
        method.name == "<init>" && method.definingClass == "Lut;"
    }
}
