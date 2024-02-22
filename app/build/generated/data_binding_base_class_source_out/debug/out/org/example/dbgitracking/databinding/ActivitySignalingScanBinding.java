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

public final class ActivitySignalingScanBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button flashlightButton;

  @NonNull
  public final PreviewView previewView;

  @NonNull
  public final Button scanButtonSignaling;

  @NonNull
  public final TextView scanSignalingLabel;

  @NonNull
  public final TextView scanStatus;

  private ActivitySignalingScanBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button flashlightButton, @NonNull PreviewView previewView,
      @NonNull Button scanButtonSignaling, @NonNull TextView scanSignalingLabel,
      @NonNull TextView scanStatus) {
    this.rootView = rootView;
    this.flashlightButton = flashlightButton;
    this.previewView = previewView;
    this.scanButtonSignaling = scanButtonSignaling;
    this.scanSignalingLabel = scanSignalingLabel;
    this.scanStatus = scanStatus;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignalingScanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignalingScanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_signaling_scan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignalingScanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
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

      id = R.id.scanButtonSignaling;
      Button scanButtonSignaling = ViewBindings.findChildViewById(rootView, id);
      if (scanButtonSignaling == null) {
        break missingId;
      }

      id = R.id.scanSignalingLabel;
      TextView scanSignalingLabel = ViewBindings.findChildViewById(rootView, id);
      if (scanSignalingLabel == null) {
        break missingId;
      }

      id = R.id.scanStatus;
      TextView scanStatus = ViewBindings.findChildViewById(rootView, id);
      if (scanStatus == null) {
        break missingId;
      }

      return new ActivitySignalingScanBinding((ConstraintLayout) rootView, flashlightButton,
          previewView, scanButtonSignaling, scanSignalingLabel, scanStatus);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
