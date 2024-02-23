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

public final class ActivityFalconBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView Spacing;

  @NonNull
  public final TextView emptyPlace;

  @NonNull
  public final Button flashlightButton;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final Button scanButtonFalcon;

  @NonNull
  public final Button scanButtonRack;

  @NonNull
  public final TextView scanStatus;

  @NonNull
  public final TextView textFalcon;

  @NonNull
  public final TextView textRack;

  private ActivityFalconBinding(@NonNull ConstraintLayout rootView, @NonNull TextView Spacing,
      @NonNull TextView emptyPlace, @NonNull Button flashlightButton,
      @NonNull PreviewView previewView, @NonNull Button scanButtonFalcon,
      @NonNull Button scanButtonRack, @NonNull TextView scanStatus, @NonNull TextView textFalcon,
      @NonNull TextView textRack) {
    this.rootView = rootView;
    this.Spacing = Spacing;
    this.emptyPlace = emptyPlace;
    this.flashlightButton = flashlightButton;
    this.previewView = previewView;
    this.scanButtonFalcon = scanButtonFalcon;
    this.scanButtonRack = scanButtonRack;
    this.scanStatus = scanStatus;
    this.textFalcon = textFalcon;
    this.textRack = textRack;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFalconBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFalconBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_falcon, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFalconBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Spacing;
      TextView Spacing = ViewBindings.findChildViewById(rootView, id);
      if (Spacing == null) {
        break missingId;
      }

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

      id = R.id.scanButtonFalcon;
      Button scanButtonFalcon = ViewBindings.findChildViewById(rootView, id);
      if (scanButtonFalcon == null) {
        break missingId;
      }

      id = R.id.scanButtonRack;
      Button scanButtonRack = ViewBindings.findChildViewById(rootView, id);
      if (scanButtonRack == null) {
        break missingId;
      }

      id = R.id.scanStatus;
      TextView scanStatus = ViewBindings.findChildViewById(rootView, id);
      if (scanStatus == null) {
        break missingId;
      }

      id = R.id.textFalcon;
      TextView textFalcon = ViewBindings.findChildViewById(rootView, id);
      if (textFalcon == null) {
        break missingId;
      }

      id = R.id.textRack;
      TextView textRack = ViewBindings.findChildViewById(rootView, id);
      if (textRack == null) {
        break missingId;
      }

      return new ActivityFalconBinding((ConstraintLayout) rootView, Spacing, emptyPlace,
          flashlightButton, previewView, scanButtonFalcon, scanButtonRack, scanStatus, textFalcon,
          textRack);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}