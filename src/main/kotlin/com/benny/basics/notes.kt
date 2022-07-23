package com.benny.basics// Basic Literals

// Numeric Literals/Integers -- 50 -- Numbers can have underscores BETWEEN  them 5-39-3-4
// Character Literals -- They Have single quotes -- 'A' 'B' 'C'
// String Literals -- They have double quotes -- "A" "B"

// VARIABLES

// In many cases, it is better to use immutable variables than mutable variables


// VAL VARIABLES
// These are variables whose values cannot be changed once they have been declared.
// However, their values can be modified, either through using the "add()" or "remove()" command.
// For Instance :
/*  -list creation
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    -adding a new element
    myMutableList.add(6)   // it works
    -printing the list
    println(myMutableList) // [1, 2, 3, 4, 5, 6]

 */

/* Constant Variables
     The value of a const variable is known at compile time and won't be changed at runtime:
        const val MY_STRING = "This is a constant string"

      Besides, const variables need to be declared on top level, outside any functions:
            const val MY_INT_1 = 1024  correct line
        fun main() {
             const val MY_INT_2 = 2048  error: Modifier 'const' is not applicable to 'local variable'
}
 */


/* DATA TYPE
    Type Inference -- A mechanism that occurs when Kotlin automatically declares the data type of  variable.
    Type Mismatch -- When You assign something unsuitable to a value
    You cannot alter the type of  variable after declaration

 */

/* INVOKING FUNCTION
    For a function to be used,it has to be invoked(called) followed by parentheses e.g function().


 */