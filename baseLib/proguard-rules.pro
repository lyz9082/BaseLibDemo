
#fresco混淆配置 start---------------------------------------
#fresco
# Keep our interfaces so they can be used by other ProGuard rules.
# See http://sourceforge.net/p/proguard/bugs/466/
-keep,allowobfuscation @interface com.facebook.common.internal.DoNotStrip
-keep,allowobfuscation @interface com.facebook.soloader.DoNotOptimize

# Do not strip any method/class that is annotated with @DoNotStrip
-keep @com.facebook.common.internal.DoNotStrip class *
-keepclassmembers class * {
    @com.facebook.common.internal.DoNotStrip *;
}

# Do not strip any method/class that is annotated with @DoNotOptimize
-keep @com.facebook.soloader.DoNotOptimize class *
-keepclassmembers class * {
    @com.facebook.soloader.DoNotOptimize *;
}

# Keep native methods
-keepclassmembers class com.facebook.** {
    native <methods>;
}

# Do not strip SoLoader class and init method
-keep public class com.facebook.soloader.SoLoader {
    public static void init(android.content.Context, int);
}

-dontwarn okio.**
-dontwarn com.squareup.okhttp.**
-dontwarn okhttp3.**
-dontwarn javax.annotation.**
-dontwarn com.android.volley.toolbox.**
-dontwarn com.facebook.infer.**
#fresco混淆配置 end---------------------------------------

#glide混淆配置 start---------------------------------------
# 图片加载
-dontwarn com.bumptech.glide.**
-keep class com.bumptech.glide.** {*;}
#glide混淆配置 end---------------------------------------

#okhttp混淆配置 start---------------------------------------
#okhttp
-dontwarn okhttp3.**
-keep class okhttp3.**{*;}
#okhttp混淆配置 start---------------------------------------
-keep class com.mgtv.okhttp.**{*;}
-keep class com.mgtv.glideimage.**{*;}