package ua.vholovetskyi.transactionlog.ui.outcome_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import ua.vholovetskyi.transactionlog.R

class OutcomeFragment : Fragment() {

    private val viewModel by viewModels<OutcomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_outcome, container, false)
    }

}