fun main() {
    name()
    pupil("jackline",21)
    fruit()
chepsiror("jackline")
    chepsiror("cheptanui")


}


fun name() {
    var name="Akirachix"
    println(name[0])
    println(name[2])
    println(name[3])

}

fun pupil(name:String,age:Int) {
    var pupil=("Hi ,my name is $name ,I am $age year old")
    println(pupil)



}

fun fruit() {
    var fruit="mango"
    println(fruit.length)


}

fun chepsiror(name:String) {
    if(name=="jackline"){
        println("that's me!")
    }
    else{
        println("I don't know who is that")
    }

}


















