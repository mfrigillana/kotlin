fun test() {
    fun local() {}

    suspend fun localSuspend() {}

    val c = {}

    val cs: suspend () -> Unit = {}
}

suspend fun testSuspend() {
    testSuspend()
    testSuspend()
}

// 2 INNERCLASS InnerClassAttributeKt\$test\$1 null InnerClassAttributeKt\$test\$1
// 2 INNERCLASS InnerClassAttributeKt\$test\$2 null InnerClassAttributeKt\$test\$2
// 2 INNERCLASS InnerClassAttributeKt\$test\$c\$1 null InnerClassAttributeKt\$test\$c\$1
// 2 INNERCLASS InnerClassAttributeKt\$test\$cs\$1 null InnerClassAttributeKt\$test\$cs\$1

// 2 INNERCLASS InnerClassAttributeKt\$testSuspend\$1 null InnerClassAttributeKt\$testSuspend\$1
