package ua.vholovetskyi.transactionlog.ui.income_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import ua.vholovetskyi.transactionlog.R
import ua.vholovetskyi.transactionlog.ui.outcome_fragment.OutcomeViewModel

class IncomeFragment : Fragment() {

    private val viewModel by viewModels<IncomeViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_income, container, false)
    }

}