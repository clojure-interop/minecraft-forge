(ns net.minecraftforge.client.model.animation.ModelBlockAnimation$MBJointWeight
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation ModelBlockAnimation$MBJointWeight]))

(defn ->mb-joint-weight
  "Constructor.

  name - `java.lang.String`
  weights - `com.google.common.collect.ImmutableMap`"
  (^ModelBlockAnimation$MBJointWeight [^java.lang.String name ^com.google.common.collect.ImmutableMap weights]
    (new ModelBlockAnimation$MBJointWeight name weights)))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ModelBlockAnimation$MBJointWeight this]
    (-> this (.getName))))

(defn get-weights
  "returns: `com.google.common.collect.ImmutableMap<java.lang.Integer,float[]>`"
  ([^ModelBlockAnimation$MBJointWeight this]
    (-> this (.getWeights))))

