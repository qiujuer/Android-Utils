buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.1.4'
    }
}

plugins {
    id "com.jfrog.bintray" version "1.8.4"
    id "com.github.dcendents.android-maven" version "2.1"
}

allprojects {
    version = VERSION_NAME
    group = POM_GROUP_ID

    repositories {
        jcenter()
        mavenCentral()
        google()
    }
}

static int getVersionCode() {
    def date = new Date()
    def formattedDate = date.format('yyMMddHHmm')
    return formattedDate as int
}

ext {
    versionCode = getVersionCode()
    versionName = VERSION_NAME
}

apply plugin: 'android-reporting'
