fun main(args: Array<String>)
{
    println("Hello World!")
    var x:Int=3
//    val name:String="Ponomarenko"
    val name:String= readln()
    //name="Vova"
    println("x=$x")
    println("Hello, $name")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //    println("Program arguments: ${args.joinToString()}")
    print("Введите a:")
    var a:Int= readln().toInt()
    print("Введите b:")
    var b:Int= readln().toInt()
    print("$a+$b=${a+b}")
}