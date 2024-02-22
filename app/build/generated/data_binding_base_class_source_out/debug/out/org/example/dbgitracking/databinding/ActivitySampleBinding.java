// Generated by view binder compiler. Do not edit!
package org.example.dbgitracking.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.example.dbgitracking.R;

public final class ActivitySampleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView emptyPlace;

  @NonNull
  public final Button flashlightButton;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final TextView sampleMethodRack;

  @NonNull
  public final Button scanButtonRack;

  @NonNull
  public final Button scanButtonSample;

  @NonNull
  public final TextView scanStatus;

  private ActivitySampleBinding(@NonNull ConstraintLayout rootView, @NonNull TextView emptyPlace,
      @NonNull Button flashlightButton, @NonNull PreviewView previewView,
      @NonNull TextView sampleMethodRack, @NonNull Button scanButtonRack,
      @NonNull Button scanButtonSample, @NonNull TextView scanStatus) {
    this.rootView = rootView;
    this.emptyPlace = emptyPlace;
    this.flashlightButton = flashlightButton;
    this.previewView = previewView;
    this.sampleMethodRack = sampleMethodRack;
    this.scanButtonRack = scanButtonRack;
    this.scanButtonSample = scanButtonSample;
    this.scanStatus = scanStatus;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySampleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySampleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sample, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySampleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyPlace;
      TextView emptyPlace = ViewBindings.findChildViewById(rootView, id);
      if (emptyPlace == null) {
        break missingId;
      }

      id = R.id.flashlightButton;
      Button flashlightButton = ViewBindings.findChildViewById(rootView, id);
      if (flashlightButton == null) {
        break missingId;
      }

      id = R.id.previewView;
      PreviewView previewView = ViewBindings.findChildViewById(rootView, id);
      if (previewView == null) {
        break missingId;
      }

      id = R.id.sampleMethodRack;
      TextView sampleMethodRack = ViewBindings.findChildViewById(rootView, id);
      if (sampleMethodRack == null) {
        break missingId;
      }

      id = R.id.scanButtonRack;
      Button scanButtonRack = ViewBindings.findChildViewById(rootView, id);
      if (scanButtonRack == null) {
        break missingId;
      }

      id = R.id.scanButtonSample;
      Button scanButtonSample = ViewBindings.findChildViewById(rootView, id);
      if (scanButtonSample == null) {
        break missingId;
      }

      id = R.id.scanStatus;
      TextView scanStatus = ViewBindings.findChildViewById(rootView, id);
      if (scanStatus == null) {
        break missingId;
      }

      return new ActivitySampleBinding((ConstraintLayout) rootView, emptyPlace, flashlightButton,
          previewView, sampleMethodRack, scanButtonRack, scanButtonSample, scanStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}