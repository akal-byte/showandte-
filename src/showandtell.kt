import java.util.*


fun main() {
 var bankdetails=BankAccountDetails("44278","fixedaccount",170)
println(bankdetails.data("karibu to Furaha bank, where quality customer service is our passion!"))
    bankdetails.list()
    bankdetails.savingsDuration()


}
class BankAccountDetails(var bankBranch:String, var accountType:String,val minBalance :Int) { //string interpolation
      fun data(a:String):String{
          var customers= "$a"
          return customers
      }
    fun list() {//arrays basics
        var namesArray= arrayOf("Mish","felix","Delilah","Samson","Patricia")
        println(namesArray[3])
        println(namesArray.set(3,"Freddy"))
        println(Arrays.toString(namesArray))
        println(namesArray.plus("eureka"))
        println(Arrays.toString(namesArray))
        var index=namesArray.indexOf("Delilah")
        println(index)


    }
    fun savingsDuration(){
        var durationArray= arrayOf(1,2,3,4,5,6,7,8,8,9,10)
        println(durationArray.count())
        println(durationArray.sum())
        println(durationArray.size)
        println(durationArray.minOrNull())
        println(durationArray.maxOrNull())
        println(durationArray.average())
        durationArray.filter { x->x>2 }.forEach{x-> //filter function and looping using forEach function
        println("$x")
            for (i in 3..8)
                println("$i")

        }



    }



}