plugins {
  alias(libs.plugins.com.android.dynamic.feature)
  alias(libs.plugins.org.jetbrains.kotlin.android)
}
android {
  namespace = "com.example.attr.feature"
  compileSdk = 33

  defaultConfig {
    minSdk = 24
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    release {
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
}

dependencies {
  implementation(project(":app"))
  implementation(libs.core.ktx)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.espresso.core)
  androidTestImplementation(libs.annotation)
}