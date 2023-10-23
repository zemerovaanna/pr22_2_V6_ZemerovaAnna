// Generated by view binder compiler. Do not edit!
package com.example.myweatherapiroom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myweatherapiroom.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAuthorizationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonSignIn;

  @NonNull
  public final Button buttonSignIn2;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText editTextTextPersonName;

  @NonNull
  public final LinearLayout linearlayout;

  @NonNull
  public final TextView textViewTitle;

  private ActivityAuthorizationBinding(@NonNull LinearLayout rootView, @NonNull Button buttonSignIn,
      @NonNull Button buttonSignIn2, @NonNull EditText editTextTextPassword,
      @NonNull EditText editTextTextPersonName, @NonNull LinearLayout linearlayout,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.buttonSignIn = buttonSignIn;
    this.buttonSignIn2 = buttonSignIn2;
    this.editTextTextPassword = editTextTextPassword;
    this.editTextTextPersonName = editTextTextPersonName;
    this.linearlayout = linearlayout;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAuthorizationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAuthorizationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_authorization, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAuthorizationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSignIn;
      Button buttonSignIn = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignIn == null) {
        break missingId;
      }

      id = R.id.buttonSignIn2;
      Button buttonSignIn2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignIn2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName;
      EditText editTextTextPersonName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPersonName == null) {
        break missingId;
      }

      id = R.id.linearlayout;
      LinearLayout linearlayout = ViewBindings.findChildViewById(rootView, id);
      if (linearlayout == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ActivityAuthorizationBinding((LinearLayout) rootView, buttonSignIn, buttonSignIn2,
          editTextTextPassword, editTextTextPersonName, linearlayout, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
