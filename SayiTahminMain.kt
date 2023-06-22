package com.example.sayitahminoyunu

import kotlin.random.Random

fun main(){

    println("SAYI TAHMİN OYUNUNA HOŞGELDİNİZ")
    println("Bir sayı tahmin ediniz.")

    val min = 0
    val max = 101

    val randomNumber = Random.nextInt(min,max)

    var kalanTahmin = 3
    println("Kalan tahmin hakkınız : $kalanTahmin")

    while (kalanTahmin > 0 ) {

        println("Tahmin etmeye devam edin : ")
        val tahmin = readLine()?.toIntOrNull()

        if (tahmin == null) {
            println("Girdiğiniz sayı geçerli değildir. Tekrar deneyiniz.")
        continue
        }

        if (tahmin == randomNumber) {
            println("Bravo! Tahmin ettiğiniz sayı doğru.")
            break
        }else if (tahmin < randomNumber) {
            println("Daha büyük bir sayı girmenizi rica ediyorum.")
        }else {
            println("Daha küçük bir sayı girmeyi deneyin.")
        }

       kalanTahmin--
        println("Kalan tahmin hakkınız : $kalanTahmin")

        if (kalanTahmin == 0) {
            println("Tahmin etme hakkınız kalmadı. Doğru cevap : $randomNumber Program hakkınız bitti.")
        }

    }


}