package com.example.xmlcomposemasterswork.xml.presentation.screen.withupdates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.xmlcomposemasterswork.R.string
import com.example.xmlcomposemasterswork.data.source.WithUpdatesSource
import com.example.xmlcomposemasterswork.databinding.FragmentWithUpdatesBinding
import com.example.xmlcomposemasterswork.xml.presentation.screen.withupdates.adapter.WithUpdatesAdapter

class WithUpdatesFragment : Fragment() {

    private var _binding: FragmentWithUpdatesBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<WithUpdatesViewModel>()

    private val adapter: WithUpdatesAdapter = WithUpdatesAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWithUpdatesBinding.inflate(inflater, container, false)

        setupAdapter()
        setupNavigation()
        setStateObserver()

        viewModel.startTimer()

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        viewModel.stopTimer()
        super.onDestroyView()
    }

    private fun setupAdapter() {
        binding.rvOrder.adapter = adapter
    }

    private fun setupNavigation() {
        binding.actionBar.apply {
            ivBack.setOnClickListener {
                findNavController().popBackStack()
            }
            tvTitle.text = getString(string.xml_with_updates_screen_title)
        }
        binding.actionBar.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun setStateObserver() {
        viewModel.state.observe(viewLifecycleOwner) {
            with(binding) {
                adapter.dataSet = WithUpdatesSource.getList()
                orderTimer.tvTimeLeft.text = it.timerText
                tvOrderId.text = it.orderId
                tvReceiver.text = it.receiverName
                tvPhone.text = it.receiverPhone
                tvEmail.text = it.receiverEmail
                tvGiftSenderName.text = it.senderName
                tvDeliveryMethod.text = it.deliveryMethod
                tvDateTime.text = it.dateTime
                tvOrderStatus.text = it.orderStatus
                tvPaymentMethod.text = it.paymentMethod
                tvTotalPrice.text = it.totalPrice
            }
        }
    }

}
