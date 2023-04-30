package com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.xmlcomposemasterswork.R.string
import com.example.xmlcomposemasterswork.data.source.BannersSource
import com.example.xmlcomposemasterswork.data.source.MenuSource
import com.example.xmlcomposemasterswork.data.source.NoveltySource
import com.example.xmlcomposemasterswork.data.source.StorySource
import com.example.xmlcomposemasterswork.data.source.SubscriptionSource
import com.example.xmlcomposemasterswork.databinding.FragmentListDifferentItemsBinding
import com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter.BannerAdapter
import com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter.MenuAdapter
import com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter.NoveltyAdapter
import com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter.StoryAdapter
import com.example.xmlcomposemasterswork.xml.presentation.screen.listdifferentitems.adapter.SubscriptionAdapter

class ListDifferentItemsFragment : Fragment() {

    private var _binding: FragmentListDifferentItemsBinding? = null
    private val binding get() = _binding!!

    private val storyAdapter: StoryAdapter = StoryAdapter()
    private val bannerAdapter: BannerAdapter = BannerAdapter()
    private val menuAdapter: MenuAdapter = MenuAdapter()
    private val subscriptionAdapter: SubscriptionAdapter = SubscriptionAdapter()
    private val noveltyAdapter: NoveltyAdapter = NoveltyAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListDifferentItemsBinding.inflate(inflater, container, false)

        setupAdapter()
        setupNavigation()

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun setupAdapter() {
        storyAdapter.dataSet = StorySource.getList()
        binding.rvListOfStories.adapter = storyAdapter

        bannerAdapter.dataSet = BannersSource.getList()
        binding.rvListOfBanners.adapter = bannerAdapter

        menuAdapter.dataSet = MenuSource.getList()
        binding.rvListOfMenu.adapter = menuAdapter

        subscriptionAdapter.dataSet = SubscriptionSource.getList()
        binding.rvListOfSubscriptions.adapter = subscriptionAdapter

        noveltyAdapter.dataSet = NoveltySource.getList()
        binding.rvListOfNovelties.adapter = noveltyAdapter
    }

    private fun setupNavigation() {
        binding.actionBar.apply {
            ivBack.setOnClickListener {
                findNavController().popBackStack()
            }
            tvTitle.text = getString(string.xml_list_different_items_screen_title)
        }
        binding.actionBar.ivBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

}
