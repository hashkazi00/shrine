package com.google.codelabs.mdc.java.shrine;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;


public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_firstscreen, container, false);
        // Inflate the layout for this fragment
        MaterialButton navToLogin = view.findViewById(R.id.navToLoginButton);

        MaterialButton navToSignup = view.findViewById(R.id.navToRegButton);


        navToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false) {
//                        passwordTextInput.setError(getString(R.string.shr_error_password));
                } else {
//                        passwordTextInput.setError(null); // Clear the error
                    ((NavigationHost) getActivity()).navigateTo(new LoginFragment(), false); // Navigate to the next Fragment
                }
            }
        });

        navToSignup.setOnClickListener(new View.OnClickListener() {
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