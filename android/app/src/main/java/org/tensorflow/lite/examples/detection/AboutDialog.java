package org.tensorflow.lite.examples.detection;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class AboutDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("About")
                .setMessage("Custom object detector \nFor master thesis purpose at HTW Berlin. \n " +
                        "\n \nDetection with 3 classes: \nHead, Hand and Box \n \n \nby Rifqi Farhan " +
                        "\n \n \nSpecial thanks to my family, Prof. Ute Dietrich & Prof. Sven Prüser.")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
