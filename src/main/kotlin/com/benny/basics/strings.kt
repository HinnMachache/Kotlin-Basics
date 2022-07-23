fun main() {
    //strings
    var message = "Hello String"
    println(message.length)

    var age = 19
    var country = "Kenya"

    println("Heloo my Age is $age and I'm from $country in two years I will be ${age + 2} years old")
    println("Hello My Age is " + age + " and I'm from " + country)

    println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")


    var mpesa =
        "QFO59PY1HT Confirmed. Ksh1,000.00 sent to Jata Mota 0727036980 on 24/6/22 at 9:03 AM. New M-PESA balance is Ksh2,989.48. Transaction cost, Ksh12.00. Amount you can transact within the day is 299,000.00. Get Stamped M-PESA Statement for free, dial *334# >My Account>M-PESA statement. To reverse, forward this message to 456."

    var positTo = mpesa.indexOf(" to ") + 4
    var positOn = mpesa.indexOf(" on ") - 10
    var name = mpesa.substring(positTo, positOn)

    println(name)


   /* var posOn = mpesa.indexOf(" on ")
    var posAt = mpesa.indexOf(" at ")

    var date = mpesa.substring(posOn, posAt)
        .replace("on","")
        .trim()

    println(date)

    var phone = mpesa.substring(posOn-11, posOn).trim()
    println(phone)

    var positionKsh = mpesa.indexOf("Ksh")
    var positionSent = mpesa.indexOf("sent")


    var amountString = mpesa.substring(positionKsh, positionSent)//Getting Ksh 1,000.00
    amountString = amountString.replace("Ksh","",true)//removing Ksh
    amountString = amountString.replace(",","").trim()//removing space
    amountString = amountString.replace(".00","")//removing ".00"

    var amount : Int = amountString.toInt()

    println(amount)//1000
*/
    println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")

    /*var mpesa2 = "QFP1D9XMZ9 Confirmed.You have received Ksh2970.00 from IAN MUCHERI PEDI 0743975939 on 25/6/22 at 9:04 PM  New M-PESA balance is Ksh3020.50.Download M-PESA app on http://bit.ly/mpesappsm & get 500MB."

    var positionKSH = mpesa2.indexOf("Ksh")
    var positionFrom = mpesa2.indexOf("from")

    var amountsent = mpesa2.substring(positionKSH, positionFrom)
    amountsent = amountsent.replace("Ksh","",true)
        .replace(",","").trim()
        .replace(".00","")

    var cash = amountsent.toInt()


    println(cash)

    var positionOn = mpesa2.indexOf(" on ")
    var positionAt = mpesa2.indexOf(" at ")

    var dateReceived = mpesa2.substring(positionOn, positionAt)
        .replace("on","")
        .trim()

    println(dateReceived)

    var phoneNumber = mpesa2.substring(positionOn-11, positionOn).trim()
    println(phoneNumber)
*/
}