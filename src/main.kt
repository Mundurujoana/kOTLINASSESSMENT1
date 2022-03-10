fun main(){

    //question1
    school()

    //question2
var solution = remainder(4,7)
    println(solution)

    //question3
   var result=  Identity("Joana", "18")
    println(result)

    //question4
    str("Munduru")

}

//question1
fun school(){
 var schoolName = "codeHive"
var char1 = schoolName[4]
var char2 = schoolName[5]
var char3 =schoolName[6]
var char4 =schoolName[7]

var combin = (char1.toString() + char2 + char3 +char4)
 println(combin)

}

//question 2
fun remainder(x:Int,y:Int):Int{
 var modulus = x%y
    return modulus
}

//question3
fun Identity(name:String, age:String):String{
    var mySelf = "Hi, my name is $name and I am $age years old.”"
    return mySelf
}

//question4
fun str(fullname:String){
    var lenght = fullname.length
  println(lenght)

}