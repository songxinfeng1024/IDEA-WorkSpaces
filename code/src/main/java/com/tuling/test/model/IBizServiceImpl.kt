package com.tuling.test.model

/**
 * Create by IDEA
 * User:Songfelicity
 * Date:2019/4/22
 * Time:6:42
 */
class IBizServiceImpl : IBizService {
    private val ibizDelegate = IbizDelegate()

    override fun a() {

        ibizDelegate.a()
    }

    override fun b() {

        ibizDelegate.b()
    }

    override fun c() {

        ibizDelegate.c()
    }
}
