//ENUM CLASS:
//Suppose mera aik variable h usay m n value assign krni hai
// m y chahta hun k wp values ksi set s ayein yani kuch set of values he hongi jo us set of calues ko assign ki jayenge, yani koi r random value assign na kr sake .
// for example aik day ka variable h us m ap Monday s le kr Sunday tk value assign kr skte ho random nh blkay in set of values s
//same aese jese gender ka case male ya female ya others in cases k lye ENUM CLASSES ka use krte hien
//mtlb kuch constant set of values hein wohe hm n apne varaible ko assign krni hein

fun main () {
    val day = Day.Monday
    println(day)
    println(day.number)  //is s y hoga k number wali proerty a jayege, q k monday ki value 1

    println("------------------------------")

    for ( i in Day.values())  //hm is p loop b kr skte hien
    {
    println(i)
    }

    println("---------------------------------")
    day.printFormattedDay() //yahan jo hamra day h wo hamaray $this ko point kr rha h
}


/*
enum class Day {  // y hm n aik enum classs banaye us m constant assign kiye r un constant ko hm n use kiya
    Monday,   // y values hamari DAY CLASS k INSTANCE heun
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday

    */

enum class Day(val number: Int) {  //hm enum class m constructor b define kr skte hein , val number: Int y lkhne s y huwa k neeche error a rhe yani instance m b value pass krni hogi
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);    //jaise he hm method lkhengay yahan semicolon ka error dega ;

    //enum class m hm method b lkh skte hien
    fun printFormattedDay()
    {
        println("Day is $this")  //yahan jo $this h y hamare current object ko point kr rha h, mtlb jis object p b function call hoga to to y hamara $this h wo us object ko point krega
    }

}