package pe.edu.upc.jetpackviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pe.edu.upc.jetpackviewbinding.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.btSecond.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToSecondFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }


}