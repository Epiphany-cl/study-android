/* 函数定义
fun 函数名(参数名: 参数类型): 返回值类型 {
    函数体
}
*/

fun add(a: Int, b: Int): Int {
    return a + b
}

println("1 + 2 = ${add(1, 2)}")

// vararg 可变参数, 可以传入多个参数
fun addVararg(vararg nums: Int): Int {
    var sum = 0
    for (num in nums) {
        sum += num
    }
    return sum
}

println("1 + 2 + 3 = ${addVararg(1, 2, 3)}")

// lambda 表达式
val addLambda: (Int, Int) -> Int = { a, b -> a + b }
println("1 + 2 = ${addLambda(1, 2)}")