package practice2

import java.io.PrintWriter

val pr = PrintWriter(System.out)
fun main() {
    func()
    pr.flush()
}

fun func() {
    val n = readLine()!!.toInt() - 2
    val s = readLine()!!
    val output = mutableMapOf<String, Int>()
    for (it in 0..n) {
        val key = s.substring(it, it + 2)
        val count = output[key] ?: 0
        output[key] = count + 1
    }
    pr.println(output.toList().sortedByDescending { it.second }[0].first)
}