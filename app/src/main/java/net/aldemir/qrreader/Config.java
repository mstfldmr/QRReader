package net.aldemir.qrreader;

/**
 * Created by mustafa on 18.05.15.
 */
public class Config {

    public static final String KEY_DECODE_1D_PRODUCT = "preferences_decode_1D_product";
    public static final String KEY_DECODE_1D_INDUSTRIAL = "preferences_decode_1D_industrial";
    public static final String KEY_DECODE_QR = "preferences_decode_QR";
    public static final String KEY_DECODE_DATA_MATRIX = "preferences_decode_Data_Matrix";
    public static final String KEY_DECODE_AZTEC = "preferences_decode_Aztec";
    public static final String KEY_DECODE_PDF417 = "preferences_decode_PDF417";

    public static final String KEY_CUSTOM_PRODUCT_SEARCH = "preferences_custom_product_search";

    public static final String KEY_PLAY_BEEP = "preferences_play_beep";
    public static final String KEY_VIBRATE = "preferences_vibrate";
    public static final String KEY_COPY_TO_CLIPBOARD = "preferences_copy_to_clipboard";
    public static final String KEY_FRONT_LIGHT_MODE = "preferences_front_light_mode";
    public static final String KEY_BULK_MODE = "preferences_bulk_mode";
    public static final String KEY_REMEMBER_DUPLICATES = "preferences_remember_duplicates";
    public static final String KEY_ENABLE_HISTORY = "preferences_history";
    public static final String KEY_SUPPLEMENTAL = "preferences_supplemental";
    public static final String KEY_AUTO_FOCUS = "preferences_auto_focus";
    public static final String KEY_INVERT_SCAN = "preferences_invert_scan";
    public static final String KEY_SEARCH_COUNTRY = "preferences_search_country";
    public static final String KEY_DISABLE_AUTO_ORIENTATION = "preferences_orientation";

    public static final String KEY_DISABLE_CONTINUOUS_FOCUS = "preferences_disable_continuous_focus";
    public static final String KEY_DISABLE_EXPOSURE = "preferences_disable_exposure";
    public static final String KEY_DISABLE_METERING = "preferences_disable_metering";
    public static final String KEY_DISABLE_BARCODE_SCENE_MODE = "preferences_disable_barcode_scene_mode";
    public static final String KEY_AUTO_OPEN_WEB = "preferences_auto_open_web";





    /**
     * By default, sending this will decode all barcodes that we understand. However it
     * may be useful to limit scanning to certain formats. Use
     * {@link android.content.Intent#putExtra(String, String)} with one of the values below.
     *
     * Setting this is effectively shorthand for setting explicit formats with {@link #SCAN_FORMATS}.
     * It is overridden by that setting.
     */
    public static final String SCAN_MODE = "SCAN_MODE";

    /**
     * Decode only UPC and EAN barcodes. This is the right choice for shopping apps which get
     * prices, reviews, etc. for products.
     */
    public static final String SCAN_PRODUCT_MODE = "PRODUCT_MODE";

    /**
     * Decode only 1D barcodes.
     */
    public static final String SCAN_ONE_D_MODE = "ONE_D_MODE";

    /**
     * Decode only QR codes.
     */
    public static final String SCAN_QR_CODE_MODE = "QR_CODE_MODE";

    /**
     * Decode only Data Matrix codes.
     */
    public static final String SCAN_DATA_MATRIX_MODE = "DATA_MATRIX_MODE";

    /**
     * Decode only Aztec.
     */
    public static final String SCAN_AZTEC_MODE = "AZTEC_MODE";

    /**
     * Decode only PDF417.
     */
    public static final String SCAN_PDF417_MODE = "PDF417_MODE";

    /**
     * Comma-separated list of formats to scan for. The values must match the names of
     * {@link com.google.zxing.BarcodeFormat}s, e.g. {@link com.google.zxing.BarcodeFormat#EAN_13}.
     * Example: "EAN_13,EAN_8,QR_CODE". This overrides {@link #SCAN_MODE}.
     */
    public static final String SCAN_FORMATS = "SCAN_FORMATS";


}
