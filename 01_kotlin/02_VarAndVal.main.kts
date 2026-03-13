// var 变量、val 常量。kotlin 有类型推断机制，会根据赋值自动判断类型。也可以显式类型声明。

// 类型判断
var i = 18 //int类型

// 显式类型声明
var j: Long = 99999999999

// 隐式类型声明而不赋值会报错 var a，必须显式类型声明
var a: String

a = "hello"

// 常量val
val birthday = "2000-1-1"

println("i = $i")
println("j = $j")
println("a = $a")
println("birthday = $birthday")