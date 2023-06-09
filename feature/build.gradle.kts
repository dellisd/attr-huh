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
  buildFeatures {
    viewBinding = true
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }
}

dependencies {
  implementation(project(":app"))
  implementation(libs.core.ktx)
  implementation(libs.material)
  implementation(libs.appcompat)
  implementation(libs.constraintlayout)
  implementation(libs.navigation.fragment.ktx)
  implementation(libs.navigation.ui.ktx)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.espresso.core)
  androidTestImplementation(libs.annotation)
}