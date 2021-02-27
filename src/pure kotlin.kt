fun main() {
    name()
    modulus()
    var add= addition(3,6,8,9)
    println(add)
    interestingFact()
}
fun name(){
    var name= "hello angella"
    println(name)

}
fun modulus(){
    var c = 1000
    var d = 3
    var modulus=c%d
    println(modulus)
}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var add= num1+num2+num3+num4
    return add


}
fun interestingFact(){
    var interestingFact=("I like smiling")
    println(interestingFact)

}