package ir.ea2.kotlin_sampleapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.ea2.kotlin_sampleapp.adapter.TabLayoutViewPagerAdapter
import kotlinx.android.synthetic.main.fragment_home.*
class HomeFragment : Fragment() {

companion object{
    fun newInstance()=HomeFragment()
}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupTabLayout()
    }
   fun setupTabLayout(){
       fr_home_viewpager.adapter=TabLayoutViewPagerAdapter(childFragmentManager)
       fr_home_tablayout.setupWithViewPager(fr_home_viewpager)
   }
}
