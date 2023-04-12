fun main(){
    stmt("mercyy")
    stmt("mercy")
    numbers(20,3)
    words()
    name()
    digits()
    println(Names(arrayOf("eliud","mercy","josephine","brenda","faith")))
    
}

//4. Write a function that takes in a name and prints out “That’s me!” when your
//name is passed to it, otherwise it prints out “I don’t know who that is”


fun stmt(name:String):String{
    if(name.equals("mercy"))
        println("that is me")
    else{
        println("that is not me")
    }
    return name

}

//write a program that asks the user to enter two numbers and store them in a variable.
//The program should then calculate and print the sum ,differences,product and quotient of the numbers
fun numbers(num1:Int,num2:Int){
    var sum=num1+num2
    var difference=num1-num2
    println(sum)

    var product=num1*num2
    println(product)

    var quotient=num1/num2
    println(quotient)

}
//Given a statement "i like learning kotlin in w3school",create a function that count
// the consonants,vowels,digits,spaces and vowels using for-loop method
fun words() {
    var statement = "i like learning kotlin in w3schools"
    var vowels = 0
    var consonants = 0
    var digits = 0
    var spaces = 0
    statement = statement.toString()
    for (p in 0..statement.length - 1) {
        val ch = statement[p]
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
++vowels

        }else if(ch in 'a'..'z'){
            ++consonants
        }else if(ch in '0'..'9'){
            ++digits
        }else if(ch ==' '){
            spaces
        }


    }
    println("vowels. $vowels")
    println("consonants. $consonants")
    println("digits. $digits")
    println("spaces. $spaces")
}

//Given numArray 43.6,67.8,90.6,87.4,50.1 ,find the average and largest using a
// for-loop method and print out the output
fun name(){
    val numArray = doubleArrayOf(43.6, 67.8, 90.6, 87.4, 50.1)
    var sum = 0.0
    for (num in numArray) {
        sum += num
    }
    val average = sum / numArray.size

    println(average)
}

//largest array
fun digits(){
   val numArray= doubleArrayOf(43.6,67.8,90.6,87.4,50.1)
    var largest=numArray[0]
    for(num in numArray){
        if(largest<num){
            largest=num
            println(largest)
        }
    }
}
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun Names(names:Array<String>):Int {

    var x = 0
    for (z in names) {
        if (z.length >=5) {
            x++
        }
    }
    return x++
}