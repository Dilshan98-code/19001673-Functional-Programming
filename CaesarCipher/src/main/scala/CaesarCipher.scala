import scala.io.StdIn.{readInt, readLine}

object CaesarCipher extends App{
  //function to encrypt alp string
  val Encrypt=(stringChar:Char,key:Int,alp:String)=>
    alp((alp.indexOf(stringChar.toUpper)+key)%alp.length)

   //function to decrypt the encrypted string
   val Decrypt=(stringChar:Char,key:Int,alp:String)=>
     alp((alp.indexOf(stringChar.toUpper)+ alp.length-key)%alp.length)


  val cipher: ((Char, Int, String) => Char, String, Int, String) => String = (algo: (Char, Int, String) => Char, s: String, key: Int, alp: String) => s.map(algo(_, key, alp)) ;

  //alphabet
  val alphabet :String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val str: String =readLine("Enter the string: ")
  print("Enter the shift key:")
  val key: Int=readInt()

  val str_en = cipher(Encrypt, str, key, alphabet)  // string encrypting
  val str_dc = cipher(Decrypt, str_en, key, alphabet)  // string decrypting

  println("Original >>>> Encrypted: "+str_en) // prints encrypted string
  println("Encrypted >>>> Original: "+str_dc)// prints decrypted string
}
