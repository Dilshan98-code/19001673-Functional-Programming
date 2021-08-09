object Cipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^";


  // a = alphabet
  //key = number to shift given letter
  //s =  string to encrypt and decrypt


  val E: (Char, Int, String) => Char = (c: Char, key: Int, a: String) => a((a.indexOf(c.toUpper) + key) % a.length) ; //algorithm to make encryption
  val D: (Char, Int, String) => Char = (c: Char, key: Int, a: String) => a((a.indexOf(c) - key) % a.length) ; //algorithm to make decryption of encrypted string

  val s: String = scala.io.StdIn.readLine("Enter string to decript : ") ;

  val cipher: ((Char, Int, String) => Char, String, Int, String) => String = (algo: (Char, Int, String) => Char, s: String, key: Int, a: String) => s.map(algo(_, key, a)) ;

  val ct = cipher(E, s, 5, alphabet)  // encrypt given string
  val pt = cipher(D, ct, 5, alphabet)  // decrypt encrypted string

  println("\nAfter Encrypted -> " + ct)
  println(  "After Decrypted -> " + pt + "")
}
