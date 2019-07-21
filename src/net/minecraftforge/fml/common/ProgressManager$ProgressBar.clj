(ns net.minecraftforge.fml.common.ProgressManager$ProgressBar
  "Not a fully fleshed out API, may change in future MC versions.
  However feel free to use and suggest additions."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common ProgressManager$ProgressBar]))

(defn step
  "class-to-name - `java.lang.Class`
  extra - `java.lang.String`"
  ([^ProgressManager$ProgressBar this ^java.lang.Class class-to-name ^java.lang.String extra]
    (-> this (.step class-to-name extra)))
  ([^ProgressManager$ProgressBar this ^java.lang.String message]
    (-> this (.step message))))

(defn get-title
  "returns: `java.lang.String`"
  (^java.lang.String [^ProgressManager$ProgressBar this]
    (-> this (.getTitle))))

(defn get-steps
  "returns: `int`"
  (^Integer [^ProgressManager$ProgressBar this]
    (-> this (.getSteps))))

(defn get-step
  "returns: `int`"
  (^Integer [^ProgressManager$ProgressBar this]
    (-> this (.getStep))))

(defn get-message
  "returns: `java.lang.String`"
  (^java.lang.String [^ProgressManager$ProgressBar this]
    (-> this (.getMessage))))

(defn time-each-step
  ""
  ([^ProgressManager$ProgressBar this]
    (-> this (.timeEachStep))))

