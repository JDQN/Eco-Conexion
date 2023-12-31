plugins {
   id("com.android.application")
}

android {
   namespace = "com.co.ecoconexion"
   compileSdk = 34

   defaultConfig {
      applicationId = "com.unal.myapplication"
      minSdk = 28
      targetSdk = 34
      versionCode = 1
      versionName = "1.0"

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
   }

   buildTypes {
      release {
         isMinifyEnabled = false
         proguardFiles(
            getDefaultProguardFile("proguard-android-optimize.txt"),
            "proguard-rules.pro"
         )
      }
   }
   compileOptions {
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
   }
}

dependencies {

   implementation("androidx.appcompat:appcompat:1.6.1")
   implementation("com.google.android.material:material:1.10.0")
   implementation("androidx.constraintlayout:constraintlayout:2.1.4")
   implementation("androidx.legacy:legacy-support-v4:1.0.0")
   implementation ("com.github.bumptech.glide:glide:4.16.0")
   implementation ("jp.wasabeef:glide-transformations:4.3.0")
   implementation ("androidx.cardview:cardview:1.0.0")
   testImplementation("junit:junit:4.13.2")
   androidTestImplementation("androidx.test.ext:junit:1.1.5")
   androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

   implementation ("androidx.compose.material3:material3:1.0.1")
   implementation ("androidx.compose.material3:material3-window-size-class:1.0.1")


}

buildscript {
   repositories {
      google()
      mavenCentral()
   }
   dependencies {
      classpath("com.android.tools.build:gradle:8.1.4")
   }
}