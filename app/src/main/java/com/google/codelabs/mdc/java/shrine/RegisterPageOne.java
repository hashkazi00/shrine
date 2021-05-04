package com.google.codelabs.mdc.java.shrine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/**
 * Fragment representing the login screen for Shrine.
 */
public class RegisterPageOne extends Fragment {
    sendDataInterface senddatainterface;
    public interface sendDataInterface{
        public void senddata(String fname, String lname, String gender, String bday);
    }

    Bundle bundle = new Bundle();
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.reg_pageone_fragment, container, false);

        //Instances that will help us get the texts.
        final TextInputEditText fnameEditText = view.findViewById(R.id.fname_edit_text);
        final TextInputEditText lnameEditText = view.findViewById(R.id.lname_edit_text);
        final RadioGroup genderRadioGroup = view.findViewById(R.id.radioGroup);
        final TextInputEditText bdateEditText = view.findViewById(R.id.bdate_edit_text);

        MaterialButton nextButton = view.findViewById(R.id.next_button);
        MaterialButton cancelButton = view.findViewById(R.id.cancel_button);

        // Set an error if the password is less than 8 characters.
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (false) {
//                    passwordTextInput.setError(getString(R.string.shr_error_password));
                } else {
//                    passwordTextInput.setError(null); // Clear the error

                    bundle.putString("fname", fnameEditText.getText().toString());
                    bundle.putString("lname", lnameEditText.getText().toString());
                    bundle.putString("bday",  bdateEditText.getText().toString());
                    Log.d("Registration Details: ", "First name: "+ fnameEditText.getText().toString());
                    Log.d("Registration Details: ", "Last name: "+ lnameEditText.getText().toString());
                    findRadioButton(genderRadioGroup.getCheckedRadioButtonId());
                    Log.d("Registration Details: ", "Birthdate: "+ bdateEditText.getText().toString());
                    /*RegisterPageTwo ldf = new RegisterPageTwo ();
                    ldf.setArguments(bundle);
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.container, new RegisterPageTwo());
                    fragmentTransaction.commit();*/
                    senddatainterface.senddata(bundle.getString("fname"), bundle.getString("lname"),
                            bundle.getString("gender"), bundle.getString("bday"));
                    ((NavigationHost) getActivity()).navigateTo(new RegisterPageTwo(), false); // Navigate to the next Fragment
                }
            }
        });

        // Set an error if the password is less than 8 characters.
        cancelButton.setOnClickListener(new View.OnClickListener() {
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

    //Converting the ID to a readable string.
    private void findRadioButton(int checkedId){
        switch (checkedId){
            case R.id.radio_button_1:
                bundle.putString("gender",  "Male");
                Log.d("Registration Details: ", "Gender: Male");
                break;
            case R.id.radio_button_2:
                bundle.putString("gender",  "Female");
                Log.d("Registration Details: ", "Gender: Female");
                break;
            case R.id.radio_button_3:
                bundle.putString("gender",  "Others");
                Log.d("Registration Details: ", "Gender: Others");
                break;
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Activity activity = (Activity) context;

        try {
            senddatainterface=(sendDataInterface) activity;
        }catch (RuntimeException e){
            throw new RuntimeException(activity.toString()+"Must implement method.. ");
        }
    }
}
