package org.jetbrains.skia.impl

actual abstract class RefCnt : Managed {
    actual protected constructor(ptr: Long): super(ptr, 0L, false) {
        println("TODO: implement native RefCnt")
    }
    actual protected constructor(ptr: Long, allowClose: Boolean): super(ptr, 0, allowClose) {
        println("TODO: implement native RefCnt")
    }
}