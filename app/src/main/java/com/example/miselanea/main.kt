package com.example.miselanea

import java.lang.Math.PI
import kotlin.math.pow

fun main(){

        println("Elija la seccion de el taller de miselanea que desea testear\n 1 :Operadores \n  2:Condicionales \n 3: Ciclos")
            var eleccion: Int = readLine()!!.toInt()
        if(eleccion==1){
            println("Elijio operadores")
            println( "Elije un punto de el taller en la parte de operadores \n 1. Calcular el área de un triángulo.\n 2. Ingresar dos números por teclado y sumarlos.\n 3. Ingresar un número y visualizar el número elevado al cuadrado.\n4. Escribir un algoritmo que convierta de euros a dólares.\n 5. Escribir un algoritmo que pida el lado de un cuadrado y muestre el valor del área y del perímetro.\n 6. Escribir un algoritmo que determine el área y el volúmen de un cilindro.\n 7. Realizar un algoritmo que lea el radio de una circunferencia y escriba la longitud de la misma y el área (pi*r)^2 del círculo inscrito.\n8. Calcular el promedio de tres (3) números ingresados por teclado.")

            val Election_p1: Int = readLine()!!.toInt()


            if(Election_p1==1 ){
                println("Calcular área del triángulo")

                println("Ingresa la base: ")

                val base: Int = readLine()!!.toInt()

                println("Ingresa la altura: ")

                val height: Int = readLine()!!.toInt()

                var area = (base * height) / 2

                println("El área es: $area")


            }
            else if(Election_p1==2){

                println("sumas dos numeros")
                println(" ingresa el numero 1: ")
                val n1:Int = readLine()!!.toInt()
                println("ingrese el Numero 2: ")
                val n2:Int = readLine()!!.toInt()
                val sum=n1+n2
                println(" la suma de los dos  numeros el igual a $sum")



            }
            else if(Election_p1==3){


                println("el cuadrado de un numero ")
                println("digite el numero que va a elevar a l cuadrado :")
                val n1:Int = readLine()!!.toInt()
                val r=n1*n1
                println("$n1 elevado a el cuadrado es $r")





            }
            else if (Election_p1==4){

                println("conversor de moneda")
                val dol : Double = 1.12
                println("digite la cantidad de euros : ")
                val eu: Int = readLine()!!.toInt()
                val vl=eu*dol
                println(" $eu en dolares es $vl")
            }

            else if (Election_p1==5){

                println("calcula el area de de u cuadrado y el perimetro en base a un lado ")
                println("digite el lado de el cadruadrado de cm : ")
                val l:Int= readLine()!!.toInt()
                val area= l*l
                val perimeter=l*4
                println("el area de el cuadrado es $area \n el perimetro es $perimeter ")
            }
            else if (Election_p1==6){

                println(" algoritmo que calcula el area y el volumen de un cilindro segun su altura y radio ")
                println("digite la altura de el  cilindro en cm  : ")
                val h: Double = readLine()!!.toDouble()
                println("digite el  radio de el  cilindro en cm  : ")
                val rad:Double= readLine()!!.toDouble()
                val volume = PI*(rad).pow(2)*h
                val area =  2*(PI*rad).pow(2)+ (PI*2*rad*h)
                println("el area de el  cilindro es $area \n el volumen de el cilindro es $volume")




            }
            else if (Election_p1==7){

                println("calcular el la longitud y area de una circuferencia")
                println("Digite el radio de la circuferencia cm³ ")
                val r:Double= readLine()!!.toDouble()
                val  area= PI*(r).pow(2)
                val length= 2* PI*r
                println("el area de la circuferencia es  $area cm³  \n la longitud de la circuferencia es $length cm³")
            }
            else if (Election_p1==8){

                println("digite el 1er numero : ")
                val n1:Int= readLine()!!.toInt()
                println("digite el 2do el numero : ")
                val n2:Int= readLine()!!.toInt()
                println("digite el 3er numero : ")
                val n3:Int= readLine()!!.toInt()
                val sum=n1+n2+n3
                val prom=sum/3
                println("el promedio de los numeros es $prom")
            }

            else{
                println("eleccion equivocada")
            }
        }
        else if (eleccion==2){

            println( "eligio condicionales")
            println(" elija uno de los siguientes puntosde la parte de condicionales de el taller \n 1. Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo \n2. Escribir un algoritmo que reciba dos números por teclado y diga cuál es el mayor y cuál el menor \n3. Escriba un programa que lea tres números enteros positivos y que calcule e imprima en pantalla el menor y el mayor de ellos \n4. Dados dos números A y B, sumarlos si A es menor que B o sino restarlos \n 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es posible \n6. Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario multiplicarlos \n7. Escribir un algoritmo que determine si un año es bisiesto o no ")
            val Election_p2: Int = readLine()!!.toInt()

            if (Election_p2==1){

                println("digite un numero")
                val n : Int= readLine()!!.toInt()
                if (n >0) {
                    println("el numero es positivo")
                }
                else if (n<0) {
                    println("el numero es negativo")
                }
                else if (n.equals(0)){
                    println("el numero es cero ")

                }
                else if (Election_p2==2){

                    println(" digite el  Primer numero : ")
                    val  n1:Int = readLine()!!.toInt()
                    println(" digite el  Segundo numero 2 : ")
                    val n2:Int = readLine()!!.toInt()

                    if (n1 > n2) {
                        println("el numero mayor es el primero $n1")
                    }
                    else if (n1 < n2) {
                        println("el numero mayor es el segundo  $n2")
                    }
                    else {
                        println("los numeros son iguales ")
                    }
                }


                else if (Election_p2==3){

                    println("digite el primer numero : ")
                    val n1 :Int= readLine()!!.toInt()
                    println("digite el  segundo  numero : ")
                    val n2 :Int= readLine()!!.toInt()
                    println("digite el tercer  numero : ")
                    val n3 :Int= readLine()!!.toInt()

                    var  nums = arrayOf(n1,n2,n3)
                    var nm = nums.max()
                    var  nmen=nums.min()
                    println("el numero mayor es $nm  \n el numero menor es $nmen ")

                }
                else if (Election_p2==4){

                    println(" Digite el numero A " )
                    val a: Int = readLine()!!.toInt()
                    println(" Digite el numero B " )
                    val  b:Int = readLine()!!.toInt()
                    if(a<b){
                        val sum = a+b
                        println(" la sumade $a + $b es $sum")
                    }
                    else{
                        val res=a-b
                        println(" la resta de $a + $b es $res")
                    }
                }
            }
            if (Election_p2==5){


                // 5. Dados dos números A y B encontrar el cociente entre A y B. Recordar que la división por cero
                //no está definida, en ese caso debe aparecer una leyenda anunciando que la división no es
                //posible.
                println(" digite el numero A : ")
                val a : Int = readLine()!!.toInt()
                println(" digite el numero b : ")
                val b : Int = readLine()!!.toInt()

                if( a >0 && b>0 ) {
                    val result = a / b
                    println(" el resultado de la division entre $a y $b es $result")
                }
                else{
                    println("la division entre 0 no esta definida ")
                }





            }
            else if (Election_p2==6){


                // 6  Dados dos números A y B, sumarlos si al menos uno de ellos es negativo, en caso contrario
                //multiplicarlos

                println("Digite el numero A ")
                val  A :Int = readLine()!!.toInt()
                println("Digite el numero B ")
                val  B :Int = readLine()!!.toInt()
                if(A<0 || B<0 ){
                    val sum = A+B
                    println("la suma entre $A + $B es $sum ")
                }
                else{
                    val multiply = A*B
                    println("la multiplicacion entre $A*$B es $multiply")

                }


            }
            else if (Election_p2==7){

                // 8  Escribir un algoritmo que determine si un año es bisiesto o no
                println("escriba el año el cual desea consultar si es bisiesto o no  ")
                val year:Int = readLine()!!.toInt()
                if ( year%4 == 0 ){
                    println("el año $year es biciesto ")
                }
                else{
                    println(" el año no es biciesto ")
                }


            }
        }






    }