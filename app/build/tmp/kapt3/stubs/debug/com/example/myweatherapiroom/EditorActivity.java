package com.example.myweatherapiroom;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/myweatherapiroom/EditorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/myweatherapiroom/adapter/WeatherAdapter;", "bttnSave", "Landroid/widget/Button;", "cityFullName", "Landroid/widget/EditText;", "cityHumidity", "cityPressure", "cityTemperature", "cityWindySpeed", "database", "Lcom/example/myweatherapiroom/data/AppDatabase;", "list", "", "Lcom/example/myweatherapiroom/data/entity/Weather;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class EditorActivity extends androidx.appcompat.app.AppCompatActivity {
    private android.widget.EditText cityFullName;
    private android.widget.EditText cityTemperature;
    private android.widget.EditText cityWindySpeed;
    private android.widget.EditText cityPressure;
    private android.widget.EditText cityHumidity;
    private android.widget.Button bttnSave;
    private com.example.myweatherapiroom.data.AppDatabase database;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.myweatherapiroom.data.entity.Weather> list;
    private com.example.myweatherapiroom.adapter.WeatherAdapter adapter;
    
    public EditorActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}