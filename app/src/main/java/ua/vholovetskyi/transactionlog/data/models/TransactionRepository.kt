package ua.vholovetskyi.transactionlog.data.models

import android.content.Context
import ua.vholovetskyi.transactionlog.data.room.DatabaseInstance

class TransactionRepository(context: Context) {

    private val transactionDao = DatabaseInstance.getInstance(context).transactionsDao()

    suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction)
    }

    suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction)
    }

    suspend fun deleteTransactions(transactions: List<Transaction>) {
        transactionDao.deleteTransactions(transactions)
    }

    fun getAllTransactions() = transactionDao.getAllTransactions()
    fun getAllIncomes() = transactionDao.getAllIncomes()
    fun getAllOutcomes() = transactionDao.getAllOutcomes()
    fun getSumOfIncomeByCategory() = transactionDao.getSumOfIncomesGroupByCategory()
    fun getSumOfOutcomeByCategory() = transactionDao.getSumOfOutcomesGroupByCategory()
}