 fun parseInt(str: String) : Int? {
     try {
         return str.toInt();
     } catch (e: NumberFormatException) {
         println("One of the argument isn't Int")
     }
     return null
 }

 fun main(args: Array<String>) {
     if (args.size > 2) {
        println("No number supplied");
     } else {
         val x = parseInt(args[0])
         val y = parseInt(args[1])

         // We connot say 'x * y' now because they may hold nulls
         if (x != null && y != null) {
             print(x * y) // Now we can
         } else {
             println("One of the arguments is null")
         }
     }
 }