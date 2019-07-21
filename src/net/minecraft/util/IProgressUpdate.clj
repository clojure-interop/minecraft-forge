(ns net.minecraft.util.IProgressUpdate
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util IProgressUpdate]))

(defn display-saving-string
  "message - `java.lang.String`"
  ([^IProgressUpdate this ^java.lang.String message]
    (-> this (.displaySavingString message))))

(defn reset-progress-and-message
  "message - `java.lang.String`"
  ([^IProgressUpdate this ^java.lang.String message]
    (-> this (.resetProgressAndMessage message))))

(defn display-loading-string
  "message - `java.lang.String`"
  ([^IProgressUpdate this ^java.lang.String message]
    (-> this (.displayLoadingString message))))

(defn set-loading-progress
  "progress - `int`"
  ([^IProgressUpdate this ^Integer progress]
    (-> this (.setLoadingProgress progress))))

(defn set-done-working
  ""
  ([^IProgressUpdate this]
    (-> this (.setDoneWorking))))

