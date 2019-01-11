package udemy.fausto.com.k_dungeon1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// https://www.codewars.com/kata/create-the-base-dungeon-crawler-number-1


class Game (val name: String, val level: Int = 0){
    var player: Player
    val floors = arrayListOf<Int>()

    init {
        player = Player(name)
    }
}

class Player {
    val health = 100
    var position = Pair(0, 0)
    val damage = 10
    val luck = 1
    var name: String

    constructor(aName: String) {
        if (aName == null || aName == " ") this.name = "Player" else this.name = aName
    }
    fun setPosition(x: Int, y : Int)  {
        position = Pair(x, y)
    }

}

class Monster (val level: Int){


}

class Map (val level: Int){

}




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("---------->")
        var him = Player(" ")
        println(him.name)

        val a = 4
        val b = 6

        him.position = (a to b)
        println(him.position)






    }
}
