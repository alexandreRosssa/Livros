package pt.ipg.livros

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import pt.ipg.livros.databinding.FragmentMenuPrincipalBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MenuPrincipalFragment : Fragment() {

    private var _binding: FragmentMenuPrincipalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMenuPrincipalBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSobre.setOnClickListener {
            findNavController().navigate(R.id.action_MenuPrincipalFragment_to_SobreFragment)
        }

        binding.buttonLivros.setOnClickListener {
            findNavController().navigate(R.id.action_MenuPrincipalFragment_to_ListaLivrosFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}