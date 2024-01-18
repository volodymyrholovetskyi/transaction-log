package ua.vholovetskyi.transactionlog

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ua.vholovetskyi.transactionlog.data.models.Transaction
import ua.vholovetskyi.transactionlog.data.models.TransactionRepository

class MainViewModel(app: Application) : AndroidViewModel(app) {
    private val repo = TransactionRepository(app.applicationContext)

    fun insertTransaction(transaction: Transaction) =
        CoroutineScope(Dispatchers.IO).launch {
            repo.insertTransaction(transaction)
        }

    fun updateTransaction(transaction: Transaction) =
        CoroutineScope(Dispatchers.IO).launch {
            repo.updateTransaction(transaction)
        }

    fun deleteTransactions(transactions: List<Transaction>) =
        CoroutineScope(Dispatchers.IO).launch {
            repo.deleteTransactions(transactions)
        }

    fun getAllTransactions() = repo.getAllTransactions().asLiveData(viewModelScope.coroutineContext)
    fun getAllIncomes() = repo.getAllIncomes().asLiveData(viewModelScope.coroutineContext)
    fun getAllOutcomes() = repo.getAllOutcomes().asLiveData(viewModelScope.coroutineContext)
    fun getSumOfIncomesByCategory() = repo.getSumOfIncomeByCategory().asLiveData(viewModelScope.coroutineContext)
    fun getSumOfOutcomesByCategory() = repo.getSumOfOutcomeByCategory().asLiveData(viewModelScope.coroutineContext)

}