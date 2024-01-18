package com.example.moneymate.model

data class Transaction(
    var accountNo:Long,
    var transactionType:String,
    var amount:Int,
    var totalAmount:Int,
    var doneAt:String
) {
    override fun toString(): String {
        return """
           Transaction:{
                AccountNo: $accountNo
                Transaction Type: $transactionType
                Amount: $amount
                Total Amount: $totalAmount
                Done AT: $doneAt
            }
        """
    }
}