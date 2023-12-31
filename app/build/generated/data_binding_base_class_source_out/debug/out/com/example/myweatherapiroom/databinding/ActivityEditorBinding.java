// Generated by view binder compiler. Do not edit!
package com.example.myweatherapiroom.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myweatherapiroom.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button bttnSave;

  @NonNull
  public final EditText cityFullName;

  @NonNull
  public final EditText cityHumidity;

  @NonNull
  public final EditText cityPressure;

  @NonNull
  public final EditText cityTemperature;

  @NonNull
  public final EditText cityWindySpeed;

  private ActivityEditorBinding(@NonNull LinearLayout rootView, @NonNull Button bttnSave,
      @NonNull EditText cityFullName, @NonNull EditText cityHumidity,
      @NonNull EditText cityPressure, @NonNull EditText cityTemperature,
      @NonNull EditText cityWindySpeed) {
    this.rootView = rootView;
    this.bttnSave = bttnSave;
    this.cityFullName = cityFullName;
    this.cityHumidity = cityHumidity;
    this.cityPressure = cityPressure;
    this.cityTemperature = cityTemperature;
    this.cityWindySpeed = cityWindySpeed;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_editor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bttn_save;
      Button bttnSave = ViewBindings.findChildViewById(rootView, id);
      if (bttnSave == null) {
        break missingId;
      }

      id = R.id.city_full_name;
      EditText cityFullName = ViewBindings.findChildViewById(rootView, id);
      if (cityFullName == null) {
        break missingId;
      }

      id = R.id.city_humidity;
      EditText cityHumidity = ViewBindings.findChildViewById(rootView, id);
      if (cityHumidity == null) {
        break missingId;
      }

      id = R.id.city_pressure;
      EditText cityPressure = ViewBindings.findChildViewById(rootView, id);
      if (cityPressure == null) {
        break missingId;
      }

      id = R.id.city_temperature;
      EditText cityTemperature = ViewBindings.findChildViewById(rootView, id);
      if (cityTemperature == null) {
        break missingId;
      }

      id = R.id.city_windy_speed;
      EditText cityWindySpeed = ViewBindings.findChildViewById(rootView, id);
      if (cityWindySpeed == null) {
        break missingId;
      }

      return new ActivityEditorBinding((LinearLayout) rootView, bttnSave, cityFullName,
          cityHumidity, cityPressure, cityTemperature, cityWindySpeed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
