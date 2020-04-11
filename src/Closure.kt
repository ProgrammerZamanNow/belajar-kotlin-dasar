fun main() {

    var counter: Int = 0

    val lambdaIncrement: () -> Unit = {
        println("Lambda increment")
        counter++
    }

    val anonymousIncremetn = fun() {
        println("Anonymous Function increment")
        counter++
    }

    fun functionIncrement(){
        println("Function increment")
        counter++
    }

    lambdaIncrement()
    anonymousIncremetn()
    functionIncrement()
    lambdaIncrement()
    anonymousIncremetn()
    functionIncrement()

    println(counter)
}