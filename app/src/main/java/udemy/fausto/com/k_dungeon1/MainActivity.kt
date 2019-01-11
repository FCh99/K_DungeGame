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
    var position: Pair<Int, Int> = Pair(0, 0)
    val damage = 10
    val luck = 1
    var name: String

    constructor(aName: String) {
        if (aName == null || aName == " ") this.name = "Player" else this.name = aName
    }
    fun setPosition (x: Int, y:Int) {
        this.position = Pair(x,y)
    }



    fun movePlayer (direction: String, bound: Pair<Int, Int>) {
        // updates position TODO: within bound
        when(direction) {
            "up" -> setPosition(this.position.first, this.position.second - 1)
            "down" -> setPosition(this.position.first, this.position.second + 1)
            "left" -> setPosition(this.position.first - 1, this.position.second)
            else -> setPosition(this.position.first + 1, this.position.second)
        }
        println(bound)

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


        var him = Player(" ")
        println(him.name)

        println("---------->")
       println(him.position)

        him.setPosition(10,12)
        println(him.position)

        him.movePlayer("up", Pair(100, 200))
        println(him.position)












    }
}
