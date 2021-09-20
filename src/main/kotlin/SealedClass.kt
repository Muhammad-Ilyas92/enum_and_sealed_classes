//SELAED CLASS
//suppose mjhy aik aesa game banana h jis m 4 color hien us k lye m enum class bana dunga , is m masla y h k jo hamara instance h wo sirf aik h yani aik he object h
// red , blue , green, yellow in k colors to enum clas s hojayengay pr inki state jo bar bar change hogi wo enum class s nh hoga to us k lye hm sealed class use krengay
// enum class m hm value ko restrict krr rhe hien jb k sealed class m type ko restrict krte hein
// sealed class m multiple state hien to multiple objects bana skte hien or hr state dusre s different ho skti h

fun main ()
{
    //important scenario sealed class ka
    val tile5 : Tile = Red("Radar ", 50)   //is m hm title5 ko explicit kiya TILE class s or object assign kr diya RED CLASS ka
    //Is m hm TILE ka reference bnaya h blkay jo object h wo h RED CLASS ka q k y inherit b krte hien


    // mere pas aesa scenerio h jis m tile k jo points hien unko multiply krna h yani agr RED wali title aye to usko 2 s multiply krdo
    val points = when(tile5)
    {
        //yahan p y keh rha h k ya to red ka object bana lo ya blue ka bana lo ya ya yellow ka bana lo ya else ki condition
        //is s faida kya huwa h jaise he hm n WHEN lkha to default y khd le aya k ya to BLUE , RED ya YELLOW ayega
        is Blue -> TODO()
        is Red -> tile5.points * 2   //yani k iska output 100 a rha hai
        is Yellow -> TODO()
    }
    println(points)
println("-----------------------")

    val tile = Red("Mushroom", 25)
    val tile1 = Red("Mushroom1", 30)
    println("${tile.points} - ${tile.type} ")
    println("${tile1.points} - ${tile1.type} ")
    println("----------------------------------")
    val tile2 = Blue("Fire", 35)
    val tile3 = Blue("Fire1", 40)
    println("${tile2.points} - ${tile2.type} ")
    println("${tile3.points} - ${tile3.type} ")
    println("----------------------------------")

    val tile4 = Blue("Pen", 45)
    println("${tile4.points} - ${tile4.type} ")

    println("------------------------------")
}

sealed class Tile   //y tile class hamari ABSTRACT CLASS h iska ap object nh bana skte jb k ap bqi jo neeche colors hien is k differnet objects bana skte hien
class Red (val type: String, val points: Int): Tile()   //y sealed class ki differnt types hein, y isse file m define krein differnet file m y kam nh krega
class Blue (val type: String, val points: Int): Tile()
class Yellow (val type: String, val points: Int): Tile()
