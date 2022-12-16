// Generated by view binder compiler. Do not edit!
package com.example.games.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.games.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoadStateFooterBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonRetry;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView textViewError;

  private LoadStateFooterBinding(@NonNull LinearLayout rootView, @NonNull Button buttonRetry,
      @NonNull ProgressBar progressBar, @NonNull TextView textViewError) {
    this.rootView = rootView;
    this.buttonRetry = buttonRetry;
    this.progressBar = progressBar;
    this.textViewError = textViewError;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoadStateFooterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoadStateFooterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.load_state_footer, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoadStateFooterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_retry;
      Button buttonRetry = ViewBindings.findChildViewById(rootView, id);
      if (buttonRetry == null) {
        break missingId;
      }

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.text_view_error;
      TextView textViewError = ViewBindings.findChildViewById(rootView, id);
      if (textViewError == null) {
        break missingId;
      }

      return new LoadStateFooterBinding((LinearLayout) rootView, buttonRetry, progressBar,
          textViewError);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
