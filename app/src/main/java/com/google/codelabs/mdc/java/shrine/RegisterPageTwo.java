package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

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

        //Instances that will help us get the texts.
        final TextInputEditText emailEditText = view.findViewById(R.id.email_edit_text);
        final TextInputEditText serialEditText = view.findViewById(R.id.serial_edit_text);


          MaterialButton backButton = view.findViewById(R.id.back_button);
          MaterialButton registerButton = view.findViewById(R.id.register_button);

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

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false) {
//                        passwordTextInput.setError(getString(R.string.shr_error_password));
                } else {
//                        passwordTextInput.setError(null); // Clear the error

                    Log.d("Registration Details: ", "Email: "+ emailEditText.getText().toString());
                    Log.d("Registration Details: ", "Password: "+ passwordEditText.getText().toString());
                    Log.d("Registration Details: ", "V-Device Number: "+ serialEditText.getText().toString());
                }
            }
        });

        return view;

    }
}
