package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;


public class LoginFragment extends Fragment {



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        MaterialButton backButton = view.findViewById(R.id.back_button);

        // Set an error if the password is less than 8 characters.
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false) {
//                    passwordTextInput.setError(getString(R.string.shr_error_password));
                } else {
//                    passwordTextInput.setError(null); // Clear the error
                    ((NavigationHost) getActivity()).navigateTo(new FirstFragment(), false); // Navigate to the next Fragment
                }
            }
        });


        return view;
    }
}