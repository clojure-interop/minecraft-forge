(ns net.minecraft.client.LoadingScreenRenderer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client LoadingScreenRenderer]))

(defn ->loading-screen-renderer
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`"
  (^LoadingScreenRenderer [^net.minecraft.client.Minecraft mc-in]
    (new LoadingScreenRenderer mc-in)))

(defn reset-progress-and-message
  "message - `java.lang.String`"
  ([^LoadingScreenRenderer this ^java.lang.String message]
    (-> this (.resetProgressAndMessage message))))

(defn display-saving-string
  "message - `java.lang.String`"
  ([^LoadingScreenRenderer this ^java.lang.String message]
    (-> this (.displaySavingString message))))

(defn display-loading-string
  "message - `java.lang.String`"
  ([^LoadingScreenRenderer this ^java.lang.String message]
    (-> this (.displayLoadingString message))))

(defn set-loading-progress
  "progress - `int`"
  ([^LoadingScreenRenderer this ^Integer progress]
    (-> this (.setLoadingProgress progress))))

(defn set-done-working
  ""
  ([^LoadingScreenRenderer this]
    (-> this (.setDoneWorking))))

