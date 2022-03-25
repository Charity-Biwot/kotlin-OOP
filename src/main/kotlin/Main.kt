fun main(){
var attributes=humans("Charity",21,49)
    attributes.eat(76)
    println(attributes.weight)
   attributes.speak("Hello World")
    attributes.birthday()
    println(attributes)
var me=user("charity","Biwott","biwot@gmail.com,",0,76)
    println(me.email)
    println(me.password)

}
//class called human with this attributes:name ,age and weight

class humans(var name: String,var age: Int,var weight: Int) {
    fun eat(foodweight: Int) {
        weight += foodweight
        println("I am eating $foodweight kgs of food")
    }


    fun speak(speech: String, ) {
        println(speech)
    }

    fun birthday() {
        println(age + 1)
    }
    }

 data class user(var firstname:String,var lastname:String,var email:String,var phonenumber:Int,var password:Int){


}










