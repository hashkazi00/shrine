package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class LoginFragment extends Fragment {



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        MaterialButton backButton = view.findViewById(R.id.back_button);

        //Instances that will help us get the texts.
        final TextInputEditText emailEditText = view.findViewById(R.id.email_edit_text);
        final TextInputEditText passwordEditText = view.findViewById(R.id.password_edit_text);

        // Set an error if the password is less than 8 characters.
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false) {
//                    passwordTextInput.setError(getString(R.string.shr_error_password));
                } else {
//                    passwordTextInput.setError(null); // Clear the error

                    Log.d("Login Details: ", "Email"+ emailEditText.getText().toString());
                    Log.d("Login Details: ", "Password"+ passwordEditText.getText().toString());

                    ((NavigationHost) getActivity()).navigateTo(new FirstFragment(), false); // Navigate to the next Fragment
                }
            }
        });


        return view;
    }
}