package com.example.inheritanceapp

class Offspring : Secondary(), Archer, Singer {

    override fun archer() {
        super.archer()
        println("Archery skill enhanced by Offspring")
    }

    override fun sing() {
        super.sing()
        println("Singing skill enhanced by Offspring")
    }
}