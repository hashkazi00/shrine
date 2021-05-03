package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class RegisterPageTwo extends Fragment {

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.reg_pagetwo_fragment, container, false);
          final TextInputLayout passwordTextInput = view.findViewById(R.id.password_text_input);

          final TextInputEditText passwordEditText = view.findViewById(R.id.password_edit_text);


          MaterialButton backButton = view.findViewById(R.id.back_button);

          backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (false) {
//                        passwordTextInput.setError(getString(R.string.shr_error_password));
                    } else {
//                        passwordTextInput.setError(null); // Clear the error
                        ((NavigationHost) getActivity()).navigateTo(new RegisterPageOne(), false); // Navigate to the next Fragment
                    }
                }
            });

        return view;

    }
}
