(ns net.minecraft.util.HttpUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util HttpUtil]))

(defn ->http-util
  "Constructor."
  (^HttpUtil []
    (new HttpUtil )))

(def *-downloader-executor
  "Static Constant.

  type: com.google.common.util.concurrent.ListeningExecutorService"
  HttpUtil/DOWNLOADER_EXECUTOR)

(defn *build-post-string
  "data - `java.util.Map`

  returns: `java.lang.String`"
  (^java.lang.String [^java.util.Map data]
    (HttpUtil/buildPostString data)))

(defn *post-map
  "url - `java.net.URL`
  data - `java.util.Map`
  skip-logging-errors - `boolean`
  p-151226-3 - `java.net.Proxy`

  returns: `java.lang.String`"
  (^java.lang.String [^java.net.URL url ^java.util.Map data ^Boolean skip-logging-errors ^java.net.Proxy p-151226-3]
    (HttpUtil/postMap url data skip-logging-errors p-151226-3)))

(defn *download-resource-pack
  "save-file - `java.io.File`
  pack-url - `java.lang.String`
  p-180192-2 - `java.util.Map`
  max-size - `int`
  p-180192-4 - `net.minecraft.util.IProgressUpdate`
  p-180192-5 - `java.net.Proxy`

  returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^java.io.File save-file ^java.lang.String pack-url ^java.util.Map p-180192-2 ^Integer max-size ^net.minecraft.util.IProgressUpdate p-180192-4 ^java.net.Proxy p-180192-5]
    (HttpUtil/downloadResourcePack save-file pack-url p-180192-2 max-size p-180192-4 p-180192-5)))

(defn *get-suitable-lan-port
  "returns: `int`

  throws: java.io.IOException"
  (^Integer []
    (HttpUtil/getSuitableLanPort )))

