package com.tuling

import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.concurrent.*

@SpringBootApplication
object TulingMainStarter {
    @JvmStatic
    fun main(args: Array<String>) {
        println("11")
        println("TulingMainStarter.main")
        println("args = [$args]")
        println()
        val executorService = Executors.newFixedThreadPool(10)
        val k = intArrayOf(0)
        for (i in 0..1000) {

            executorService.submit {
                println(k[0])
                k[0]++
            }
        }
    }
}
