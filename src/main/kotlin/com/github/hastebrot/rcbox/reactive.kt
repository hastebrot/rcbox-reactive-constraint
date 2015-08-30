package com.github.hastebrot.rcbox

data class Box<T>(var value: T)

fun plusOp<T: Int>(box1: Box<T>,
                   box2: Box<T>): Box<Int> {
    return Box(box1.value + box2.value)
}

fun imperative() {
    var a: Int = 1
    var b: Int = 3
    var c: Int = a + b
    println(c) // 4

    a += 1
    println(c) // 4
}

fun imperative2() {
    val a: Box<Int> = Box(1)
    val b: Box<Int> = Box(3)
    val c: Box<Int> = plusOp(a, b)
    println(c.value) // 4

    a.value += 1
    println(c.value) // 4

}

fun main(args: Array<String>) {
    imperative()
    imperative2()
}
