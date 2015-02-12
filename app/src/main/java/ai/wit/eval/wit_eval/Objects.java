package ai.wit.eval.wit_eval;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Admin on 2/11/2015.
 */
public class Objects {

    @SerializedName("_text")
    private String _text;

    @SerializedName("intent")
    private String intent;

    public String get_text() {
        return _text;
    }

    public void set_text(String _text) {
        this._text = _text;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }
}
