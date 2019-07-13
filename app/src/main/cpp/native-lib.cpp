#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_syd_auto_main_cpp_Native_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jbyteArray JNICALL
Java_com_syd_auto_main_cpp_Native_start(JNIEnv *env, jobject instance) {

    // TODO

}extern "C"
JNIEXPORT jint JNICALL
Java_com_syd_auto_main_cpp_Native_getIntCode(JNIEnv *env, jobject instance) {

    // TODO
    return -1;
}extern "C"
JNIEXPORT jobject JNICALL
Java_com_syd_auto_main_cpp_Native_getInputStream(JNIEnv *env, jobject instance) {

    // TODO
    return nullptr;
}extern "C"
JNIEXPORT jobject JNICALL
Java_com_syd_auto_main_cpp_Native_getOutputStream(JNIEnv *env, jobject instance) {

    // TODO

    return nullptr;
}